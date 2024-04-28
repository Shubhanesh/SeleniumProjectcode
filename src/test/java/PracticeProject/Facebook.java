package PracticeProject;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Facebook {
    @Test(groups = "QA")
    @Description("Verify the current URl, title of Facebook")

    public void FacebookLogin(){
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Facebook – log in or sign up");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/");


        WebElement emailinputbox= driver.findElement(By.id("email"));
        emailinputbox.sendKeys("gholap.shubhangi6@gmail.com");

        WebElement passinputbox= driver.findElement(By.id("pass"));
        passinputbox.sendKeys("Shubh@1994");

        driver.findElement(By.name("login")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();



    }
}
