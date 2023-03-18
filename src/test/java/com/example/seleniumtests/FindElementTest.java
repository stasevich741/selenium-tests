package com.example.seleniumtests;

import com.example.seleniumtests.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

@Slf4j
public class FindElementTest extends BaseTest {

    //session/{session id}/element/{element id}/element
    @Test
    public void findElements() {
        driver.get("https://www.google.com/search?source=hp&ei=QFkDXdu5POHFrgSDvZroAw&q=selenium&oq=seleniu&gs_l=psy-ab.3.0.0l10.1135.2750..4142...0.0..0.430.2527.2-1j5j1......0....1..gws-wiz.....0..0i131.f1AHtH5RWTc");
        WebElement searchContainer = driver.findElement(By.cssSelector("#search"));
        log.info("WebElement extends SearchContext");
        log.info("WebDriver -> Let start node be the current browsing context’s document element.");
        log.info("WebElement -> Let start node be the result of trying to get a known connected element with url variable element id.");

        List<WebElement> results = searchContainer.findElements(By.cssSelector(".g"));
        log.info("Count results: {}", results.size());
    }
}

