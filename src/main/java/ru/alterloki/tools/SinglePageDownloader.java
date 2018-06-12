package ru.alterloki.tools;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.util.Map;

public class SinglePageDownloader implements Downloader {

    private final CloseableHttpClient httpclient;
    private final String url;
    private final Map<String, String> params;

    public SinglePageDownloader(String url, Map<String, String> params, String method) {
        httpclient = HttpClients.createDefault();
        this.url = url;
        this.params = params;
    }

    @Override
    public String download() {

        return null;
    }
}
