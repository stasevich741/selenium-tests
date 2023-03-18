package com.example.seleniumtests;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

@Slf4j
public class ClickTest extends BaseTest {
    ///session/{session id}/element/{element id}/click
    @Test
    public void click() {
        driver.get("https://habr.com/ru/");
        driver.findElement(By.cssSelector("div[class='tm-footer__container']")).click();
    }
//при клике на футер попадаем в "тех поддержку", т.к. драйвер кликает по середине элемента
}
