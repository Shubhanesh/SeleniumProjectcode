package PracticeProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlterHandalingDemo {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.browserstack.com/users/sign_up");
        driver.findElement(By.id("user_full_name")).sendKeys("Shubhangi Gholap");
        driver.findElement(By.id("user_email_login")).sendKeys("gholap.shubhangi6@gmail.com");
        driver.findElement(By.id("user_password")).sendKeys("OneP!ece@1994");////*[@id="user_password"]
        driver.findElement(By.id("user_submit")).click();
       // driver.findElement(By.xpath("//a[@class='bs-alert-close']")).click();  /handle alter manualy

        Thread.sleep(5000);

        Alert alert= driver.switchTo().alert(); // handled alert
        String getalertmessage= driver.switchTo().alert().getText(); // capture the alert message
        System.out.println(getalertmessage); // print alert message
        Thread.sleep(5000);
        alert.accept();



    }
}
//driver.switchTo().alert().dismiss();This method is used when the ‘Cancel’ button is clicked in the alert box.
//driver.switchTo().alert().accept();This method is used to capture the alert message.
//driver.switchTo().alert().getText();This method is used to capture the alert message.
//driver.switchTo().alert().sendKeys("Text");This method is used to send data to the alert box.