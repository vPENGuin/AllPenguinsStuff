package com.random.video;

import com.google.gson.Gson;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    public static final String URL = "https://www.youtube.com/youtubei/v1/search";

    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Gson gson = new Gson();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print("Search: ");
            input = scanner.nextLine();
            if (input.equals("exit")) {
                System.out.println("Exiting program");
                break;
            }
            String query;
            if (input.isEmpty()) {
                query = generateRandomQuery(random);
            } else {
                query = input;
            }
            System.out.println("Search query: " + query);
            RequestBody requestBody = createBody(query, gson);

            String responseBody = sendRequest(client, requestBody);
            if (responseBody != null) {
                YoutubeResponse.Root entity = gson.fromJson(responseBody, YoutubeResponse.Root.class);
                ArrayList<YoutubeResponse.Content> contents = getContents(entity);
                System.out.println("size: " + contents.size());

                ArrayList<Video> videos = parseVideos(contents);
                if (videos.size() > 0) {
                    Video video = findMinViewCountVideo(videos);
                    System.out.println(video + " URL: " + video.getUrl());
                }
            }
        }
    }

    @NotNull
    private static String generateRandomQuery(Random random) {
        boolean latin = random.nextBoolean();
        char first;
        char second;
        if (latin) {
            first = randomLatinChar(random);
            second = randomLatinChar(random);
        } else {
            first = randomRuChar(random);
            second = randomRuChar(random);
        }
        return "" + first + second;
    }

    private static char randomLatinChar(Random random) {
        return (char) (random.nextInt(26) + 'a');
    }

    private static char randomRuChar(Random random) {
        return (char) (random.nextInt(32) + 'а');
    }

    private static Video findMinViewCountVideo(ArrayList<Video> videos) {
        int minIndex = 0;
        for (int i = 0; i < videos.size(); i++) {
            if (videos.get(i).getViewCount() < videos.get(minIndex).getViewCount()) {
                minIndex = i;
            }
        }
        return videos.get(minIndex);
    }

    @NotNull
    private static ArrayList<Video> parseVideos(ArrayList<YoutubeResponse.Content> contents) {
        ArrayList<Video> videos = new ArrayList<>();
        for (YoutubeResponse.Content content : contents) {
            YoutubeResponse.VideoRenderer videoRenderer = content
                    .getVideoRenderer();
            if (videoRenderer != null && videoRenderer.getViewCountText() != null && videoRenderer.getViewCountText().getSimpleText() != null) {
                String simpleText = videoRenderer.getViewCountText().getSimpleText();
                int viewCount;
                if (simpleText.contains("No")) {
                    viewCount = 0;
                } else {
                    viewCount = Integer.parseInt(simpleText
                            .replaceAll("views", "")
                            .replaceAll("view", "")
                            .replaceAll(",", "")
                            .trim());
                }
                String videoId = videoRenderer.getVideoId();
                String title = videoRenderer.getTitle().getRuns().get(0).getText();
                videos.add(new Video(title, videoId, viewCount));
            }
        }
        return videos;
    }

    private static ArrayList<YoutubeResponse.Content> getContents(YoutubeResponse.Root entity) {
        return entity
                .getContents()
                .getTwoColumnSearchResultsRenderer()
                .getPrimaryContents()
                .getSectionListRenderer()
                .getContents()
                .get(0)
                .getItemSectionRenderer()
                .getContents();
    }

    private static String sendRequest(OkHttpClient client, RequestBody requestBody) throws IOException {
        Request request = new Request.Builder()
                .url(URL)
                .post(requestBody)
                .header("content-type", "application/json")
                .build();
        Call call = client.newCall(request);
        Response response = call.execute();

        ResponseBody responseBody = response.body();
        if (responseBody != null) {
            return responseBody.string();
        }
        return null;
    }

    @NotNull
    private static RequestBody createBody(String query, Gson gson) {
        Body.Client bodyClient = new Body.Client("WEB", "2.20220527.00.00");
        Body.Context context = new Body.Context(bodyClient);
        Body body = new Body(context, query, "CAISBAgBEAE%3D");
        return RequestBody.create(gson.toJson(body), JSON);
    }
}

