package ru.alterloki.download;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.alterloki.pipeline.*;

@Component
public class DownloadActionFactory extends AbstractLocalActionFactory {


    private Downloader downloader;

    private Extractor extractor;

    private Saver saver;

    @Override
    public ActionType getActionType() {
        return ActionType.DOWNLOAD_SINGLE_PAGE;
    }

    @Override
    public Action createAction(ActionMetaInfo actionMetaInfo) {
        return new Action(getActionType()) {
            @Override
            public void act() {

            }
        };
    }
}
