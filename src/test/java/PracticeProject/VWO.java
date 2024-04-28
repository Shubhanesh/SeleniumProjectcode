package PracticeProject;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VWO {

    @Test(groups = "QA")
    @Description("Verify the current URl, title of VWO app")
    public void VWOloginTest(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        WebElement emailinputbox= driver.findElement(By.id("login-username"));
        emailinputbox.sendKeys("admin@admin.com");

        WebElement passwordinputbox= driver.findElement(By.id("login-password"));

        passwordinputbox.sendKeys("admin");

        driver.findElement(By.id("js-login-btn")).click();
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        WebElement errormessage= driver.findElement(By.className("notification-box-description"));
        String error_msg_text= errormessage.getText();
        String error_msg_attribute_dataqa  = errormessage.getAttribute("data-qa");
        System.out.println(error_msg_attribute_dataqa);

        Assert.assertEquals(error_msg_text,"Your email, password, IP address or location did not match");


        driver.quit(); // Stop the session and edge browser which is opened.

    }

}
