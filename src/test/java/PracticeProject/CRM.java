package PracticeProject;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CRM {
    @Test(groups = "QA")
    @Description("Open the CRM with valid credential")



    public void crmLogin(){
        WebDriver driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement emailinputbox= driver.findElement(By.name("username"));
        emailinputbox.sendKeys("Admin");

        WebElement passwordinputbox= driver.findElement(By.name("password"));
        passwordinputbox.sendKeys("admin123");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




        //*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[1]
    }
}
