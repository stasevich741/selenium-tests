package com.example.seleniumtests.conf;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;

import java.util.concurrent.TimeUnit;

public class NavigateTest extends BaseTest {
    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(NavigateTest.class);

    @Test
    public void navigate() {
        String wdUrl = "https://www.w3.org/TR/webdriver1";
        String yaUrl = "https://ya.ru";

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        logger.info("Go to: {}", wdUrl);
        driver.get(wdUrl);
        logger.info("Current page: {}", driver.getTitle());

        logger.info("Go to: {}", yaUrl);
        driver.navigate().to(yaUrl);
        logger.info("Current page: {}", driver.getTitle());

        logger.info("Go back");
        driver.navigate().back();
        logger.info("Current page: {}", driver.getTitle());

        logger.info("Go forward");
        driver.navigate().forward();
        logger.info("Current page: {}", driver.getTitle());

        logger.info("Refresh");
        driver.navigate().refresh();
        logger.info("Current page: {}", driver.getTitle());
    }
}
