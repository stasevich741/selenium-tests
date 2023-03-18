package com.example.seleniumtests.base;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

@Slf4j
public class GetTextTest extends BaseTest {

    //session/{session id}/element/{element id}/text
    @Test
    public void getText(){
        driver.get("https://seleniumhq.github.io/selenium/docs/api/java/org/openqa/selenium/WebElement.html");
        String h2 = driver.findElement(By.cssSelector("h2")).getText();
        log.info("h2 content: {}", h2);

        String header = driver.findElement(By.cssSelector(".header")).getText();
        log.info("header content: {}", header);
        log.info("returns an element’s text 'as rendered'");
    }
    @Test
    public void getInputText() throws InterruptedException {
        driver.get("https://ya.ru");
        String text = driver.findElement(By.cssSelector("#text")).getText();
        log.info("Content: {}",  text);

        driver.findElement(By.cssSelector("#text")).sendKeys("  t", "e", "s", "t", " test  ");
        text = driver.findElement(By.cssSelector("#text")).getText();
        log.info("Content: {}", text);
        log.warn("make it by get attribute value!");
    }
}

