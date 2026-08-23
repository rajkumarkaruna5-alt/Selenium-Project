package Javascript.Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolltypes {


    public static void randy_orton() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.get("https://en.wikipedia.org/wiki/Randy_Orton");
        Thread.sleep(4000);

        JavascriptExecutor js = (JavascriptExecutor)driver;

        //ScrollIntoView
        WebElement wwe_champion = driver.findElement(By.xpath("//h4[@id='WWE_Champion_(2007–2008)']"));
        js.executeScript("arguments[0].scrollIntoView()", wwe_champion);
        Thread.sleep(2000);

        //Scrollbywindow
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);

        js.executeScript("window.scrollBy(0,-2000)");
        Thread.sleep(3000);

        //scrollTo
        js.executeScript("window.scrollTo(0,0)");


    }

    public static void main(String[] args) throws InterruptedException {



        randy_orton();

    }


}
