package com.example.seleniumtests.base;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

@Slf4j
public class SubmitTest extends BaseTest {

    @Test
    public void submit() {
        driver.get("https://account.habr.com/login/");

        driver.findElement(By.cssSelector("#email_field")).submit();

        log.info("Error text: {}", driver.findElement(By.cssSelector(".s-error")).getText());
        log.warn("No info on W3C ¯\\_(ツ)_/¯");
    }
}

