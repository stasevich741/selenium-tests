package com.example.seleniumtests.base;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class GetAttributeTest extends BaseTest {

    //session/{session id}/element/{element id}/attribute/{name}
    @Test
    public void getAttribute() {
        driver.get("https://automated-testing.info/");
        WebElement logo = driver.findElement(By.cssSelector("#site-logo"));
        log.info("Src: {}", logo.getAttribute("src"));
        log.info("Name: {}", logo.getAttribute("localName"));
        WebElement  header = driver.findElement(By.cssSelector("header"));
        log.info("HTML: {}", header.getAttribute("outerHTML"));
    }

    @Test
    public void getHref() {
        driver.get("https://market.yandex.ru/");
        WebElement logo = driver.findElement(By.cssSelector("div.n-w-tab_type_navigation-menu > a"));
        String href = logo.getAttribute("href");
        log.info("HREF: {}", href);
       assertThat(href).startsWith("https://market.yandex.ru");
    }

    @Test
    public void getBooleanAttribute() {
        driver.get("https://github.com/join");
        WebElement logo = driver.findElement(By.cssSelector("#signup_button"));
        log.info("Disabled: {}", logo.getAttribute("disabled"));
        log.info("Readonly: {}", logo.getAttribute("readonly"));
        log.info("It's 'true' or null only");
    }
}

