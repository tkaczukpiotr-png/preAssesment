package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjects.QuestionnairePage;

@Configuration
@PropertySource(value = "classpath:config/test-config.yml", factory = YamlPropertySourceFactory.class)
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