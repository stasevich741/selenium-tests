package com.example.seleniumtests.conf;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;

import java.util.concurrent.TimeUnit;

public class TargetLocatorTest extends BaseTest {
    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(TargetLocatorTest.class);

    @Test
    public void defaultContent() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://ya.ru");
        driver.switchTo().activeElement().sendKeys("test");
    }
}
