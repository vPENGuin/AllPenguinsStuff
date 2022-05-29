package com.random.video;

import lombok.Data;

import java.util.ArrayList;


//   /watch?v={videoId}

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */

@Data
public class YoutubeResponse {
    @Data
    public class Root {
        public Content contents;
    }
    @Data
    public class Content {
        public ItemSectionRenderer itemSectionRenderer;
        public VideoRenderer videoRenderer;
        public TwoColumnSearchResultsRenderer twoColumnSearchResultsRenderer;
    }
    @Data
    public class TwoColumnSearchResultsRenderer {
        public PrimaryContents primaryContents;
    }
    @Data
    public class PrimaryContents {
        public SectionListRenderer sectionListRenderer;
    }
    @Data
    public class SectionListRenderer {
        public ArrayList<Content> contents;
    }
    @Data
    public class ItemSectionRenderer {
        public ArrayList<Content> contents;
    }
    @Data
    public static class VideoRenderer {
        public String videoId;
        public Title title;
        public PublishedTimeText publishedTimeText;
        public LengthText lengthText;
        public ViewCountText viewCountText;
    }
    @Data
    public static class Title {
        public ArrayList<Run> runs;
    }
    @Data
    public static class Run {
        public String text;
    }
    @Data
    public static class PublishedTimeText {
        public String simpleText;
    }
    @Data
    public static class LengthText {
        public String simpleText;
    }
    @Data
    public static class ViewCountText {
        public String simpleText;
    }
}
