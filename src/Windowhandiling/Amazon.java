package Windowhandiling;

import Screenshots.Unsplash;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Amazon extends Unsplash{


    public static WebDriver driver;

    public static void setmethodwindowhandles(int index)
    {
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> li = new ArrayList<>(windowHandles);
        driver.switchTo().window(li.get(index));

    }

    public static void amazon() throws InterruptedException, IOException {
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);

        /*driver.findElement(By.xpath("//button[@alt='Continue shopping']")).click();
        Thread.sleep(3000);*/

        WebElement searchbar = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
        searchbar.sendKeys("running shoes", Keys.ENTER);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//h2[@aria-label='Mens Fast-r Nitro™ Elite 2 Running Shoe']")).click();
        Thread.sleep(3000);

        setmethodwindowhandles(1);
        Thread.sleep(3000);

        WebElement shoe_image = driver.findElement(By.xpath("//img[@alt='Puma Mens Fast-r Nitro™ Elite 2 Running Shoe']"));
        single_images(shoe_image, "Puma_shoe");
        Thread.sleep(3000);

        WebElement addtocart = driver.findElement(By.xpath("//span[@id='submit.add-to-cart']"));
        addtocart.click();
        Thread.sleep(3000);

        setmethodwindowhandles(0);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//h2[@aria-label='Barefoot Rooted Wide feet Shoes for Men | Lightweight Running & Training Shoes with Soft Sole & Superior Grip | Running, Jogging Regular Gym Shoes for Men']")).click();
        Thread.sleep(3000);

        setmethodwindowhandles(2);
        Thread.sleep(3000);

        WebElement shoe_image1 = driver.findElement(By.xpath("//img[@alt='Impakto Barefoot Rooted Wide feet Shoes for Men | Lightweight Running &amp; Training Shoes with Soft Sole &amp; Superior Grip | Running, Jogging Regular Gym Shoes for Men']"));
        single_images(shoe_image1, "Impakto_shoe");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        Thread.sleep(4000);

        driver.quit();


    }

    public static void main(String[] args) throws InterruptedException, IOException {

        amazon();

    }

}
