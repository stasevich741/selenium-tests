package com.example.seleniumtests.conf;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;

import java.time.Duration;
import java.util.Set;

public class CloseAndQuitTest extends BaseTest {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(CloseAndQuitTest.class);

    @Test
    public void close() {
        driver = new ChromeDriver();
        driver.get("https://www.google.co.uk/services/?subid=ww-ww-et-g-awa-a-g_hpbfoot1_1!o2&fg=1#?modal_active=none");
        driver.findElement(By.cssSelector("a.button.cta-main")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(drvr -> drvr.getWindowHandles().size() > 1);

        Set<String> handles = driver.getWindowHandles();
        log.info("Total tabs: {}", handles.size());
        String tab = driver.getWindowHandle();
        log.info("Current tab: {}", tab);

        driver.close();

        handles.remove(tab);
        driver.switchTo().window(handles.iterator().next());
        log.info("Current tab: {}", driver.getWindowHandle());

        log.warn("Close only current tab");
        log.warn("Need to change handle manually");
    }

    @Test
    public void quit() {
        driver = new ChromeDriver();
        driver.get("https://www.google.co.uk/services/?subid=ww-ww-et-g-awa-a-g_hpbfoot1_1!o2&fg=1#?modal_active=none");
        driver.findElement(By.cssSelector("a.button.cta-main")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(drvr -> drvr.getWindowHandles().size() > 1);

        Set<String> handles = driver.getWindowHandles();
        log.info("Total tabs: {}", handles.size());
        String tab = driver.getWindowHandle();
        log.info("Current tab: {}", tab);

        driver.quit();

        try {
            log.info(driver.getWindowHandle());
        } catch (Exception ex) {
            log.error(String.valueOf(ex));
        }
    }
}
