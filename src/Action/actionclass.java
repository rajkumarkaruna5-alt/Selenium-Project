package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class actionclass {


    public static void flipkart() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='✕']")).click();
        Thread.sleep(2000);

        WebElement sports = driver.findElement(By.xpath("//div[text()='Sports & Fitness']"));
        sports.click();
        Thread.sleep(2000);

        WebElement cricket = driver.findElement(By.xpath("//div[text()='Cricket ']"));
        cricket.click();
        Thread.sleep(2000);

        WebElement sportsbooksmore = driver.findElement(By.xpath("//span[text()='Sports, Books & More']"));

        //mouse over
        Actions actions = new Actions(driver);
        actions.moveToElement(sportsbooksmore).perform();
        Thread.sleep(2000);


        List<WebElement> toptabs = driver.findElements(By.xpath("//span[@class='OqYNhN']"));
        for (WebElement i : toptabs)
        {
            System.out.println(i.getText());
            actions.moveToElement(i).perform();
            Thread.sleep(1000);
        }

        //Move using "OR" |
        List<WebElement> alltoptabs = driver.findElements(By.xpath("//span[@class='OqYNhN']|//a[@class='OqYNhN']"));
        for (WebElement i : alltoptabs)
        {
            System.out.println(i.getText());
            actions.moveToElement(i).perform();
            Thread.sleep(1000);

            if (i.getText().contains("Flights"))
            {
                //click
                //actions.moveToElement(i).click().perform();
                actions.click(i).perform();
                break;
            }
        }

        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);

        //double click
        WebElement text = driver.findElement(By.xpath("//h1[text()='Cricket']"));
        actions.doubleClick(text).perform();
        Thread.sleep(2000);

        //right click
        WebElement flights = driver.findElement(By.xpath("//a[text()='Flights']"));
        actions.contextClick(flights).perform();
        Thread.sleep(2000);

        //click, hold and release
        actions.clickAndHold(text).pause(Duration.ofSeconds(2));

        WebElement searchbar = driver.findElement(By.xpath("//input[@name='q']"));
        actions.moveToElement(searchbar).release().perform();
        Thread.sleep(2000);


    }


    public static void main(String[] args) throws InterruptedException {

        flipkart();


    }
}




