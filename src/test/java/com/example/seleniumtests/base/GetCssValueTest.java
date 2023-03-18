package com.example.seleniumtests.base;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@Slf4j
public class GetCssValueTest extends BaseTest {

    //session/{session id}/element/{element id}/css/{property name}
    @Test
    public void getCss() {
        driver.get("https://ya.ru/");
        WebElement find = driver.findElement(By.cssSelector("button"));
        log.info("Src: {}", find.getCssValue("cursor")); //pointer
    }
}

