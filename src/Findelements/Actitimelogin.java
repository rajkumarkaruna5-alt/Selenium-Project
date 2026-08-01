package Findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimelogin {

    //https://online.actitime.com/walmart/login.do


    public static void main(String[] args) throws InterruptedException {


        WebDriver driver= new ChromeDriver();

        driver.get("https://online.actitime.com/walmart/login.do");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println("Page Title: "+title);
        Thread.sleep(4000);

        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("rajdon380@gmail.com");
        Thread.sleep(2000);


        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("Rajkumar@123");
        Thread.sleep(4000);

        driver.findElement(By.xpath("//div[normalize-space()='Login']")).click();
        //Thread.sleep(6000);
        //driver.close();

    }


}
