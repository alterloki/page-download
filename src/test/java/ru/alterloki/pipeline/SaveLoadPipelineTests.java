package ru.alterloki.pipeline;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.alterloki.repository.PipelineRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SaveLoadPipelineTests {

    @Autowired
    private PipelineRepository pipelineRepository;

    @Test
    public void testCreatePipeline() throws Exception {
        Pipeline pipeline = new Pipeline("Pipeline 1");
        ActionMetaInfo actionMetaInfo = new ActionMetaInfo(ActionType.DOWNLOAD_SINGLE_PAGE);
        actionMetaInfo.setParam("url", "http://jleague13.ru");
        pipeline.addAction(actionMetaInfo);

        ActionMetaInfo metaInfo = pipeline.getActionMetaInfos().iterator().next();
        assertNotNull(metaInfo);
        assertEquals(metaInfo.getActionType(), ActionType.DOWNLOAD_SINGLE_PAGE);
    }

}
