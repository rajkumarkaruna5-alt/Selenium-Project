package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alertClass {



    public static void alert() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.get("https://vinothqaacademy.com/alert-and-popup/");
        Thread.sleep(6000);

        JavascriptExecutor js = (JavascriptExecutor)driver;

        //only Accept alert
        WebElement acceptalert = driver.findElement(By.xpath("//button[@name='alertbox']"));
        js.executeScript("arguments[0].click()",acceptalert);
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        //Accept and Dismiss alert
        WebElement dismissalert = driver.findElement(By.xpath("//button[@name='confirmalertbox']"));
        js.executeScript("arguments[0].click()", dismissalert);
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);

        //prompt Alert
        WebElement promptalert = driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
        js.executeScript("arguments[0].click()", promptalert);
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Yes");
        driver.switchTo().alert().accept();
        Thread.sleep(6000);

        driver.quit();


    }

    public static void main(String[] args) throws InterruptedException {

        alert();

    }


}
