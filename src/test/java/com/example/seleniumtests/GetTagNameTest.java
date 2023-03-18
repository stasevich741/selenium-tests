package com.example.seleniumtests;

import com.example.seleniumtests.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
@Slf4j
public class GetTagNameTest extends BaseTest {

    //session/{session id}/element/{element id}/name
    @Test
    public void getTagName() {
        driver.get("https://ya.ru/");
        WebElement searchButton = driver.findElement(By.cssSelector("button"));
        log.info("Tag: {}", searchButton.getTagName());
        log.warn("Not the value of the name attribute: will return 'input' for the element <input name='foo'/>");
    }
}

