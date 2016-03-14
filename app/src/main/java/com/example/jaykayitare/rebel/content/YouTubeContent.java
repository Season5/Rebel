package com.example.jaykayitare.rebel.content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class YouTubeContent {

    /**
     * An array of YouTube videos
     */
    public static List<YouTubeVideo> ITEMS = new ArrayList<>();

    /**
     * A map of YouTube videos, by ID.
     */
    public static Map<String, YouTubeVideo> ITEM_MAP = new HashMap<>();

    static {
        addItem(new YouTubeVideo("6iRTBh1gCjk", "Lecrae:\"All I need is you\""));
        addItem(new YouTubeVideo("iVSX7uJeonE", "Lecrae:\"Freedom\""));
        addItem(new YouTubeVideo("zf4Mgc6dV7s", "Lecrae:\"DejaVu\""));
        addItem(new YouTubeVideo("F8NDgil12K0", "Lecrae: \"church clothes\""));
        addItem(new YouTubeVideo("4qbnOLxI4T4", "Lecrae;:\"CHurch Clothes Film\""));
        addItem(new YouTubeVideo("CR7SBRCKIuU", "Lecrae:Say i wount"));
        addItem(new YouTubeVideo("EFVV5SXqqrA", "Lecrea:Confession"));
        addItem(new YouTubeVideo("sN2oynpHATI", "Lecrae:Unshamed"));
        addItem(new YouTubeVideo("YiUdrIsqmyQ", "Lecrea I'm Turnt"));
    }

    private static void addItem(final YouTubeVideo item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A POJO representing a YouTube video
     */
    public static class YouTubeVideo {
        public String id;
        public String title;

        public YouTubeVideo(String id, String content) {
            this.id = id;
            this.title = content;
        }

        @Override
        public String toString() {
            return title;
        }
    }
}