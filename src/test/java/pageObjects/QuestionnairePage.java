package pageObjects;

import com.codeborne.selenide.ElementsCollection;
import helpers.RedioButtons;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$$;

public class QuestionnairePage {
    private ElementsCollection rbnTwoOptionsForSingleQuestion = $$("css selector for radio buttons " +
            "- option Yes and No - it should return 32 elements, because we have 16 questions with option Yes / No");

    @Step("Select randomly radio buttons for each question")
    public void selectRandomRadioButtonsForEachQuestion() {
        // Loop through each question and select a random radio button (Yes or No) randomly
        int numberOfQuestionsWithRadioButtons = 16; // 16 questions with radio buttons
        for (int question = 1; question <= numberOfQuestionsWithRadioButtons; question++) {

            // Choose the option randomly (Yes or No) for the current question (using Math.random(),
            // which returns a value between 0.0 and 1.0) - it's a proposed solution of course
            RedioButtons selectedOption = Math.random() < 0.5 ? RedioButtons.YES : RedioButtons.NO;


            rbnTwoOptionsForSingleQuestion
                    // Select the corresponding radio button for the current question
                    //Yes is on the first position for answer (that is why we multiply by 2 and add 0 for Yes)
                    //No is on the second position for answer (that is why we multiply by 2 and add 1 for No, it's the next
                    // element)
                    .get((question - 1) * 2 + (selectedOption == RedioButtons.YES ? 0 : 1))
                    .click();
        }
    }

}