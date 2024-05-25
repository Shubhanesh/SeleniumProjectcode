package org.example.AutomateGODaddy;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class GmailLogin {
    /*Steps to Automate:
1. Open this URL  http://automationpractice.com/index.php
2. Click on the sign-in link.
3. Enter your email address in the 'Create and Account' section.
4. Click on Create an Account button.
5. Enter your Personal Information, Address, and Contact info.
6. Click on the Register button.
7. Validate that the user is created.
*/
    @Test(groups = "QA")
    @Description("Launch facebook")
    public void facebookLogin(){
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

    //driver.findElement(By.id("u_0_0_mE")).click();
        driver.findElement(By.cssSelector("[data-testid='open-registration-form-button']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));

      // WebElement fname= driver.findElement(By.name("firstname"));
 //WebElement fname= driver.findElement(By.cssSelector("input#u_17_b_EA"));
      // WebElement fname= driver.findElement(By.xpath("//input[contains(@aria-label,'First name')]"));
       //fname.sendKeys("Arushi");
       //WebElement lname= driver.findElement(By.name("lastname"));
      // lname.sendKeys("Arora");
      //WebElement Mnumber= driver.findElement(By.className("inputtext _58mg _5dba _2ph-"));
     //  Mnumber.sendKeys("9999999999");
     // WebElement passwordbox= driver.findElement(By.xpath("//input[@id=\"password_step_input\"]"));
     //  passwordbox.sendKeys("India@123");





    }
}
