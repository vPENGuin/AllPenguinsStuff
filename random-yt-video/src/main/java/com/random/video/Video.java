package com.random.video;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Video {
    private String title;
    private String videoId;
    private int viewCount;

    public String getUrl() {
        String baseUrl = "https://www.youtube.com/watch?v=";
        return baseUrl + videoId;
    }
}
