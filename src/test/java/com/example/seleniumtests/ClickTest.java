package com.example.seleniumtests;

import com.example.seleniumtests.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

@Slf4j
public class ClickTest extends BaseTest {

    ///session/{session id}/element/{element id}/click
    @Test
    public void click() {
        driver.get("https://habr.com/ru/");
        driver.findElement(By.cssSelector(".footer")).click();
        log.info("Q. Where are we? Why?");
        log.warn(NOTE_CLICK);
    }

    private static final String NOTE_CLICK = "The Element Click command scrolls into view the element if it is not already pointer-interactable,\n" +
            "    and clicks its in-view center point.\n" +
            "    If the element’s center point is obscured by another element, an element click intercepted error is returned.\n" +
            "    If the element is outside the viewport, an element not interactable error is returned.";
}
