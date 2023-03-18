package com.example.seleniumtests.conf;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;

public class TitleTest extends BaseTest {
    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(TitleTest.class);

    @Test
    public void getTitle() {
        driver = new ChromeDriver();
        logger.info("Title on start: {}", driver.getTitle());
        driver.get("https://angular.io/");
        logger.info("Title on webpage: {}", driver.getTitle());
    }
}
