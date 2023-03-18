package com.example.seleniumtests.conf;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

@Slf4j
public class CapsTest extends BaseTest {

    //https://w3c.github.io/webdriver/#capabilities

    @Test
    public void capsChrome() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        //options.addExtensions(new File("C:\\Program Files (x86)\\Google\\CHROME\\Application\\74.0.3729.169\\default_apps\\youtube.crx"));
        options.addArguments("start-maximized");
//
//      bookmarks, history, settings, extensions, and more – in a profile
        options.addArguments("user-data-dir=/path/to/your/custom/profile");
        options.setHeadless(false);
        options.setPageLoadStrategy(PageLoadStrategy.NONE);

        driver = new ChromeDriver(options);

        Capabilities capabilities = ((HasCapabilities) driver).getCapabilities();
        log.info(capabilities.toString());

        driver.get("https://ya.ru");
    }

    @Test
    public void capsFirefox() {
        WebDriverManager.firefoxdriver().setup();

        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);

        driver = new FirefoxDriver(options);

        Capabilities capabilities = ((HasCapabilities) driver).getCapabilities();
        log.info(String.valueOf(capabilities));

        driver.get("https://ya.ru");
        log.warn("About caps: https://firefox-source-docs.mozilla.org/testing/geckodriver/Capabilities.html");
    }

    @Test
    public void capsEdge() {
        WebDriverManager.edgedriver().setup();

        log.error("io.github.bonigarcia.wdm.WebDriverManagerException: io.github.bonigarcia.wdm.WebDriverManagerException");
        log.warn("Check https://github.com/bonigarcia/webdrivermanager/issues/308");

        EdgeOptions options = new EdgeOptions();
        options.setCapability("ms:startPage", "https://otus.ru");

        driver = new EdgeDriver(options);

        Capabilities capabilities = ((HasCapabilities) driver).getCapabilities();
        log.info(capabilities.toString());

        driver.get("https://ya.ru");
        log.warn("About caps: https://docs.microsoft.com/en-us/microsoft-edge/webdriver");
    }
}
