package com.example.seleniumtests;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
@Slf4j
public class IsDisplayedTest extends BaseTest {

    //session/{session id}/element/{element id}/displayed.
    @Test
    public void isDisplayed(){
        driver.get("https://github.com/join");
        WebElement btn = driver.findElement(By.cssSelector("#signup_button"));
        log.info("Disabled: {}", btn.isDisplayed());
        log.warn("More: https://www.w3.org/TR/webdriver1/#element-displayedness");
    }

    //session/{session id}/element/{element id}/enabled
    @Test
    public void isEnabled(){
        driver.get("https://github.com/join");
        WebElement btn = driver.findElement(By.cssSelector("#signup_button"));
        log.info("Enabled: {}", btn.isEnabled());
    }

    //session/{session id}/element/{element id}/selected
    @Test
    public void isSelected(){
        driver.get("https://otus.ru/");
        driver.findElement(By.cssSelector("button[data-modal-id='new-log-reg']")).click();
        driver.findElement(By.cssSelector("div[data-tab-id='register']")).click();

        boolean student = driver.findElement(By.cssSelector("#type-student")).isSelected();
        boolean teacher = driver.findElement(By.cssSelector("#type-teacher")).isSelected();
        boolean b2b = driver.findElement(By.cssSelector("#type-b2b")).isSelected();

        log.info("Student {} - Teacher {} - B2B {}", student, teacher, b2b);

        boolean termsAgree =driver.findElement(By.cssSelector("input[name='terms_agree']")).isSelected();
        boolean subscribe =driver.findElement(By.cssSelector("input[name='subscribe']")).isSelected();
        log.info("Terms agree {} - Subscribe {}", termsAgree, subscribe);
    }
}

