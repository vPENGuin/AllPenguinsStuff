package com.random.video;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Body {
    public Context context;
    public String query;
    public String params;

    @AllArgsConstructor
    @Data
    public static class Context {
        public Client client;
    }

    @AllArgsConstructor
    @Data
    public static class Client {
        public String clientName;
        public String clientVersion;
    }
}
