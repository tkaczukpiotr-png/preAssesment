I have created tests for Login Page and Quesitonaire Page. (Question 1 and Question 2)
To simplify the syntax I have used Selenide (also to include fluent waits,
which are really helpful and simplify configuration).
For me it is common to use some tool for reporting, so I have used Allure.
Spring Boot is for easier syntax readability.
I can enhance the tests, use some things better, simpler, also with Spring Boot config, this is proposed solution
In terms of limited time, I have created a simple project for your review before assessment.
For 3rd question I used pure Selenium WebDriver to show, that I understand the pure WebDriver syntax.
It also contains the example with finding multiple elements, to show you that I understand how to do this
with WebDriver.
For tests I have used example of convention: p/n(positive/negative) + _ + 'I would like to...' 'test name'.
This is just an example.
For test steps I have used the pattern, that each test step (method) should be readable by business people.
For running all the tests you can use 'mvn test' command.

Issues:
I have a problem with opening both pages: Login Page and Questionnaire Page XMLs in web browsers (syntax errors).

Solutions:
For Login Page I have used standard selectors for id, just for example

For Questionnaire Page I was able to read the structure for radio buttons, so I have created selectors
(but I was not able to confirm, that they are correct, because page was not loading properly - syntax error).

#Question 1
Tests:
- p_loginWithValidCredentialsAndVerifySuccessMessage()
- p_loginWithValidCredentialsAndVerifyThatMainPageIsDisplayed()
- n_loginWithIncorrectEmailAndVerifyThatInvalidEmailMessageIsDisplayed()
- n_loginWithIncorrectEmailAndCheckCorrectionMessage()


#Question 2
Tests:
- p_selectRandomlyRadioButtonsForEachQuestion()


#Question 3
Tests:
- p_locate5thElementFromDropDown()