package com.example.seleniumtests.base;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
@Slf4j
public class SendKeysTest extends BaseTest {

    @Test
    public void sendKeys() {
        driver.get("https://ya.ru");

        driver.findElement(By.cssSelector("#text")).sendKeys("  o", "t", "u", "s", " test  ");
        String text = driver.findElement(By.cssSelector("#text")).getAttribute("value");
        log.info("Content: {}", text);

        driver.findElement(By.cssSelector("#text")).sendKeys("  ADDITIONAL TEXT");
        text = driver.findElement(By.cssSelector("#text")).getAttribute("value");
        log.info("Content: {}", text);

        driver.findElement(By.cssSelector("#text")).sendKeys(Keys.ENTER);

        log.warn("U better to go deeper inside sendkeys method");
    }
}

