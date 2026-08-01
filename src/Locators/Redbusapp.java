package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbusapp {


    public static void ticketbooking() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.get("https://www.redbus.in/");
        Thread.sleep(2000);

        WebElement from = driver.findElement(By.xpath("//input[@id='srcinput']"));
        from.sendKeys("Koyambedu");
        Thread.sleep(2000);

        //debugger: setTimeout(()=>{debugger;}, 5000)

        WebElement koyam = driver.findElement(By.xpath("//div[@aria-label='Koyambedu, Chennai']"));
        koyam.click();
        Thread.sleep(2000);

        WebElement to = driver.findElement(By.xpath("//input[@id='destinput']"));
        to.sendKeys("Bengaluru");
        Thread.sleep(2000);

        WebElement bang = driver.findElement(By.xpath("//div[@aria-label='Bengaluru']"));
        bang.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@aria-label='Select date of journey']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@aria-label='Thursday, August 20, 2026']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@aria-label='Search buses']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@aria-label='SLEEPER (176)']")).click();//doubt
        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[text()='V Bus Holidays']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@aria-label='Login to get exciting offers']//button[@aria-label='Close']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[@id=\"U18\"]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='Board/Drop point']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[text()='Infront of HDFC ATM, Opp to Adyar anandha Bhavan - Siruseri']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[text()='Infront of DHL Express courier office, After Girias Showroom Silk Board']")).click();
        Thread.sleep(2000);

        WebElement phone = driver.findElement(By.xpath("//input[@name='Phone']"));
        phone.sendKeys("9783764752");
        Thread.sleep(2000);

        WebElement email = driver.findElement(By.xpath("//input[@placeholder=\"Enter email id\"]"));
        email.sendKeys("rajkumar@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@aria-label=\"State of Residence\"]")).click();

        WebElement state = driver.findElement(By.xpath("//input[@aria-label=\"Search for state\"]"));
        state.sendKeys("Tamil Nadu");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[text()='Tamil Nadu']")).click();
        Thread.sleep(2000);

        WebElement name = driver.findElement(By.xpath("//input[@placeholder=\"Enter your Name\"]"));
        name.sendKeys("Rajkumar");

        WebElement age = driver.findElement(By.xpath("//input[@placeholder=\"Enter Age\"]"));
        age.sendKeys("28");

        driver.findElement(By.xpath("//span[@id=\":rk:\"]")).click();//doubt

    }


    public static void main(String[] args) throws InterruptedException {

        ticketbooking();


    }


}
