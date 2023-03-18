package com.example.seleniumtests.base;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;

import static org.assertj.core.api.Assertions.assertThat;


@Slf4j
public class GetLocationValueTest extends BaseTest {

    //session/{session id}/element/{element id}/rect
    @Test
    public void getRect() {
        driver.get("https://ya.ru/");
        WebElement searchButton = driver.findElement(By.cssSelector("button"));
        Rectangle rectangle = searchButton.getRect();
        log.info("Button rectangle: {}", rectangle);
    }

    @Test
    public void comparing() {
        driver.get("https://ya.ru/");
        WebElement srchBtn = driver.findElement(By.cssSelector("button"));

        Point location = srchBtn.getLocation();
        Dimension dimension = srchBtn.getSize();
        Rectangle rectangle = srchBtn.getRect();

        assertThat(rectangle.getX()).isEqualTo(location.getX());
        assertThat(rectangle.getY()).isEqualTo(location.getY());

        assertThat(rectangle.getHeight()).isEqualTo(dimension.getHeight());
        assertThat(rectangle.getWidth()).isEqualTo(dimension.getWidth());

        assertThat(rectangle.getPoint()).isEqualTo(location);
        assertThat(rectangle.getDimension()).isEqualTo(dimension);

        log.warn("I can't see info for getLocation and getSize methods in W3C doc. So..?");
    }
}

