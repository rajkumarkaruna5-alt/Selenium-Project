package Javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class arguments {

    public static void wikipedia() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor)driver;

        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        Thread.sleep(2000);

        //sendkeys
        WebElement searchbar = driver.findElement(By.xpath("//input[@accesskey='f']"));
        js.executeScript("arguments[0].value='Keerthy suresh'", searchbar);
        Thread.sleep(1000);

        //click
        WebElement searchbutton = driver.findElement(By.xpath("(//button[text()='Search'])[1]"));
        js.executeScript("arguments[0].click()",searchbutton);
        Thread.sleep(2000);

        //scroll
        WebElement films = driver.findElement(By.xpath("//h2[@id='Filmography']"));
        js.executeScript("arguments[0].scrollIntoView()", films);
        Thread.sleep(2000);


    }

    public static void main(String[] args) throws InterruptedException {

        wikipedia();

    }

}
