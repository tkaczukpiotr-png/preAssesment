package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjects.QuestionnairePage;

@Configuration
public class TestConfig {
    @Bean
    public LoginPage loginPage() {
        return new LoginPage();
    }

    @Bean
    public MainPage mainPage() {
        return new MainPage();
    }

    @Bean
    public QuestionnairePage questionnairePage() {
        return new QuestionnairePage();
    }
}