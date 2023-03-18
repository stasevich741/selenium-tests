package com.example.seleniumtests.conf;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;

public class PageSourceTest extends BaseTest {
    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(PageSourceTest.class);

    @Test
    public void getPAgeSource() {
        driver = new ChromeDriver();
        driver.get("https://www.w3.org/TR/webdriver1");
        String src = driver.getPageSource();
        logger.warn("There's no info in w3c");
        logger.info("Page source:\n{}", src);
    }
}
