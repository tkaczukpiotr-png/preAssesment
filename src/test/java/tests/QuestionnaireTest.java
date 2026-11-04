package tests;

import config.TestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.Test;
import pageObjects.QuestionnairePage;


@ContextConfiguration(classes = TestConfig.class)
public class QuestionnaireTest  extends BaseTest{

    @Autowired
    private QuestionnairePage questionnairePage;

    @Test(testName = "Select randomly radio buttons for each question")
    public void p_selectRandomlyRadioButtonsForEachQuestion() {
        questionnairePage.selectRandomRadioButtonsForEachQuestion();
    }
}