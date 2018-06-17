package ru.alterloki.download;

import ru.alterloki.pipeline.Action;
import ru.alterloki.pipeline.ActionType;

public class DownloadAction extends Action {
    private Downloader downloader;
    private Extractor extractor;
    private Saver saver;

    public DownloadAction() {
        super(ActionType.DOWNLOAD_SINGLE_PAGE);
    }
}
