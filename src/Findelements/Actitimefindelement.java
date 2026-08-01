package Findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimefindelement {
/*Scenario:
An employee wants to log in to the ActiTime application using valid credentials.
Requirements:
1.Launch the browser.
2.Open the ActiTime application URL.
3.Verify that the Login page is displayed.
4.Enter the Username.
5.Enter the Password.
6.Click the Login button.
7.Verify that the login operation is successful.
Expected Result:
• Application should open successfully.
• User should be able to log in using valid credentials.*/


    public static void main(String[] args) throws InterruptedException {


        WebDriver driver= new ChromeDriver();

        driver.get("https://www.actitime.com");
        driver.manage().window().maximize();
        Thread.sleep(4000);

        WebElement login = driver.findElement(By.xpath("//a[normalize-space()='Log in']"));
        login.click();
        Thread.sleep(4000);
        String title = driver.getTitle();
        System.out.println("Page Title: "+title);

        WebElement enteremail = driver.findElement(By.xpath("//input[@id='Enteryouremail']"));
        enteremail.sendKeys("rajdon380@gmail.com");
        Thread.sleep(4000);

        driver.findElement(By.xpath("//span[@class='app-button__content']")).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath("//div[@class='full-width-wrapper verify-code']//input[1]")).sendKeys("3");
        driver.findElement(By.xpath("//input[2]")).sendKeys("6");
        driver.findElement(By.xpath("//input[3]")).sendKeys("5");
        driver.findElement(By.xpath("//input[4]")).sendKeys("1");
        driver.findElement(By.xpath("//input[5]")).sendKeys("2");
        driver.findElement(By.xpath("//input[6]")).sendKeys("5");




    }

}
