package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class WebDriverLocate5thElementTest { //no inheritance in this case (everything is inside one class)
    @Test
    public void p_locate5thElementFromDropDown() {
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);

        driver.get("http://google.com"); // sample URL just for example for Question 3 task
        driver.findElements(By.cssSelector("[id*='EventType'] li")).get(4).click();
        //there are some different ways for drop downs also, but I decided to:
        //1. locate closer element by id contains 'EventType', because
        //- it is a reference to id
        //2. Find any element with tag name 'li' because structure of the tree could also be changed,
        //when the page would be changed in the future in next iterations
    }
}