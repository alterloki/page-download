package ru.alterloki.pipeline;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MainActionFactoryTests {

    @Autowired
    @Qualifier("mainActionFactory")
    private ActionFactory mainActionFactory;

    @Test
    public void createActionTest() {
        ActionMetaInfo actionMetaInfo = new ActionMetaInfo(ActionType.DOWNLOAD_SINGLE_PAGE);
        Action action = mainActionFactory.createAction(actionMetaInfo);
        assertNotNull(action);
        assertEquals(action.getActionType(), ActionType.DOWNLOAD_SINGLE_PAGE);
    }
}
