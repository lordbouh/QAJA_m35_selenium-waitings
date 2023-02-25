package ru.rockstarhamster.selenium.waitings;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestTest {
    @Test
    public void open_aviasales() {
        System.setProperty("webdriver.chrome.driver", "C:/soft/chromedriver/win32/110.0.5481.30/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aviasales.ru");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.className("container_0d4223f")));
      //  driver.navigate().to("https://www.google.com");

    }
}
