package Javascript.Scroll;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollyoutube {



    public static void scroll_by_Element() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.youtube.com/");
        Thread.sleep(3000);

        WebElement searchbar = driver.findElement(By.xpath("//input[@name='search_query']"));
        searchbar.sendKeys("Forza horizon 6", Keys.ENTER);
        Thread.sleep(4000);


        WebElement nextvideo = null;

        for (int i=1; i<=10; i++) {


            Thread.sleep(2000);
            driver.findElement(By.xpath("(//ytd-video-renderer[@class='style-scope ytd-item-section-renderer'])["+i+"]"));

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView()", nextvideo);

        }

    }

    public static void main(String[] args) throws InterruptedException {

        scroll_by_Element();


    }


}
