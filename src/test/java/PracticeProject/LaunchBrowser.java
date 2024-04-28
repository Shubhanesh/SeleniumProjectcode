package PracticeProject;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.net.MalformedURLException;

public class LaunchBrowser {
    public static void main(String[] args)  {
        WebDriver driver= new ChromeDriver(); //launch the browser
        driver.get("https://www.facebook.com/");

    driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");// Open the URL
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        Dimension size= new Dimension(500,500);

      driver.quit();


    }
}
