package ru.alterloki.download;

import ru.alterloki.pipeline.Action;

public class DownloadAction extends Action {
    private Downloader downloader;
    private Extractor extractor;
    private Saver saver;
}
