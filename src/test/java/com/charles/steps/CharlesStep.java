package com.charles.steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CharlesStep {
    static ChromeDriver driver = null;

    static {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("打开百度搜索")
    public void open() throws InterruptedException {
        driver.get("https://www.baidu.com");
        Thread.sleep(2000);
    }

    @When("输入 {string}")
    public void input(String query) {
        WebElement element = driver.findElement(By.name("wd"));
        element.sendKeys(query);
        element.submit();
    }

    @Then("显示 {string}")
    public void show(String title) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//a[text()='" + title + "']")));
    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
