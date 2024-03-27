package org.example.Selenium23032024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium19 {
    EdgeDriver driver;

    @BeforeTest
    public void openbrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver(options);
    }

    @Test(groups = "QA")
    @Description("Test case discription")

    public void VWOLogin_positive() throws InterruptedException {
        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");
        driver.manage().window().maximize();
        WebElement serachbox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        serachbox.sendKeys("macmini");
        WebElement searchboxButton = driver.findElement(By.cssSelector("input[ value='Search']"));
        searchboxButton.click();
        Thread.sleep(300);
        List<WebElement> searchedTitles = driver.findElements(By.className("s-item__title"));
        int i = 0;
        for (WebElement title : searchedTitles) {
            System.out.println(i + " -> " + title.getText());
            if (i == 10) {
                title.click();
            }
            i++;
        }

    }

    @AfterTest
    public void browserclosed() {
        driver.quit();
    }



}
