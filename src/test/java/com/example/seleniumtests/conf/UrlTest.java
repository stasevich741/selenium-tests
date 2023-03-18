package com.example.seleniumtests.conf;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;

import static org.assertj.core.api.Assertions.assertThat;

public class UrlTest extends BaseTest {
    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(UrlTest.class);

    @Test
    public void get() {
        driver = new ChromeDriver();

        try {
            driver.get("yandex.ru");
        } catch (Exception ex) {
            logger.error(String.valueOf(ex));
        }

        driver.get("https://ya.ru");

        logger.warn("Use with protocol only. http(s)://");
        logger.warn("This will follow redirects");
        logger.warn("Synonym for WebDriver.Navigation.to(String)");
    }

    @Test
    public void getCurrentUrl() {
        driver = new ChromeDriver();
        driver.get("https://angular.io/");
        driver.findElement(By.cssSelector("a.button.hero-cta")).click();
        String url = driver.getCurrentUrl();
        logger.info("Current url: {}", url);
        assertThat(url).endsWith("angular.io/start");
    }
}
