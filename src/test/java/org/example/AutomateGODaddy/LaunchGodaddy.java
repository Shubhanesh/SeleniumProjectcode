package org.example.AutomateGODaddy;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchGodaddy {

    //1. Test Case - Open Godaddy.com and maximize the browser window.
    //2. Test Case - Open Godaddy.com and Print its Page title.
    //3. Test Case - Open Godaddy.com and Validate Page Title
    //1. Test Case - Automate the first menu link of godaddy.com

    @Test(groups = "QA")
    @Description("Launch the Godaddy URL")

    public void launchWeb(){
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.godaddy.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        Assert.assertEquals(driver.getTitle(),"Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.godaddy.com/en-in");







        driver.quit();
    }

}
