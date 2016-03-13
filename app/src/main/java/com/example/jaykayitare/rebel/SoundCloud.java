package com.example.jaykayitare.rebel;

/**
 * Created by jaykayitare on 3/12/16.
 */


import retrofit.RestAdapter;

public class SoundCloud {

    private static final RestAdapter REST_ADAPTER = new RestAdapter.Builder().setEndpoint(Config.API_URL).build();
    private static final SCService SERVICE = REST_ADAPTER.create(SCService.class);

    public static SCService getService() {
        return SERVICE;
    }
}
