package Windowhandiling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Flipkart extends Amazon{


    //public static WebDriver driver;


    public static void flipkart() throws InterruptedException, IOException {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[@role='button']")).click();
        Thread.sleep(3000);

        WebElement searchbar = driver.findElement(By.xpath("//form[@action='/search']//input[@placeholder='Search for Products, Brands and More']"));
        searchbar.sendKeys("Emporio armani watch for men", Keys.ENTER);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[@data-id='WATHE49PFZSSRNZX']//a[@title='Analog Watch  - For Men AR60091']")).click();
        Thread.sleep(3000);


        //setmethodwindowhandles(1);
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> li = new ArrayList<>(windowHandles);

        driver.switchTo().window(li.get(1));
        Thread.sleep(3000);

        WebElement image1 = driver.findElement(By.xpath("(//img[@alt='Image'])[1]"));
        single_images(image1, "Watch");
        Thread.sleep(10000);

        WebElement addtocart = driver.findElement(By.xpath("//div[@class='CTTtEa']//div[@class='OmE16y']//div[@class='asbjxx']//div[@style='transform: translateY(0px) scale(1);']"));
        addtocart.click();
        Thread.sleep(3000);
        addtocart.click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//img[@alt='FLIPKART']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[@role='button']")).click();
        Thread.sleep(3000);

        WebElement searchbar1 = driver.findElement(By.xpath("//form[@action='/search']//input[@name='q']"));
        searchbar1.sendKeys("apple airpods pro 3", Keys.ENTER);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[@title='Apple Airpods Pro With Wireless Charging Case Active noise cancellation enabled Bluetooth']")).click();
        Thread.sleep(3000);

        Set<String> windowHandles1 = driver.getWindowHandles();
        li.clear();
        li.addAll(windowHandles1);
        Thread.sleep(3000);

        driver.switchTo().window(li.get(2));
        Thread.sleep(3000);

        WebElement image2 = driver.findElement(By.xpath("(//img[@alt='Image'])[1]"));
        single_images(image2, "Airpods pro 3");
        Thread.sleep(6000);

        WebElement addtocart1 = driver.findElement(By.xpath("//div[@class='CTTtEa']//div[@class='OmE16y']//div[@class='asbjxx']//div[@style='transform: translateY(0px) scale(1);']"));
        addtocart1.click();
        Thread.sleep(3000);
        addtocart1.click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//img[@alt='FLIPKART']")).click();
        Thread.sleep(3000);

        //driver.findElement(By.xpath("//span[@role='button']")).click();
        //Thread.sleep(3000);

        WebElement searchbar2 = driver.findElement(By.xpath("//form[@action='/search']//input[@title='Search for Products, Brands and More']"));
        searchbar2.sendKeys("shoe dog book by phil knight", Keys.ENTER);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[@title='Shoe Dog  - A Memoir By the Creator of Nike']")).click();
        Thread.sleep(3000);

        Set<String> windowHandles2 = driver.getWindowHandles();
        li.clear();
        li.addAll(windowHandles2);
        Thread.sleep(3000);

        driver.switchTo().window(li.get(3));
        Thread.sleep(3000);

        WebElement image3 = driver.findElement(By.xpath("(//img[@alt='Image'])[1]"));
        single_images(image3, "Shoe Dog");
        Thread.sleep(6000);

        WebElement addtocart2 = driver.findElement(By.xpath("//div[text()='Add to cart']"));
        addtocart2.click();
        Thread.sleep(3000);
        addtocart2.click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[@title='Cart']")).click();
        Thread.sleep(3000);

        WebElement image4 = driver.findElement(By.xpath("//div[@style='background-color: rgb(241, 243, 246);']"));
        single_images(image4, "Total price in cart");
        Thread.sleep(3000);



    }

    public static void main(String[] args) throws IOException, InterruptedException {

        flipkart();


    }
}
