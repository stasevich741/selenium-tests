package com.example.seleniumtests.base;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


public class ClearTest extends BaseTest {

    ///session/{session id}/element/{element id}/clear
    @Test
    public void clear() {
        driver.get("https://account.habr.com/login/");
        driver.findElement(By.cssSelector("#email_field")).sendKeys("test@otus.ru");
        driver.findElement(By.cssSelector("#email_field")).clear();
    }
}

