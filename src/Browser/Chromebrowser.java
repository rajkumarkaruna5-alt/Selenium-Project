package Browser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Chromebrowser {


    public static void main(String[] args) throws InterruptedException {


        //launch driver
        /*ChromeDriver driver=new ChromeDriver();

        //get URL
        driver.get("https://www.youtube.com");

        //Maximize
        driver.manage().window().maximize();

        //Minimize
        //driver.manage().window().maximize();

        //get title
        String title= driver.getTitle();
        System.out.println("Title of webpage: "+title);

        //get URL
        String currentURL= driver.getCurrentUrl();
        System.out.println("Current URL: "+currentURL);
        Thread.sleep(5000);

        //close browser
        driver.close();*/


        //Edge Browser
        EdgeDriver driver=new EdgeDriver();

        driver.get("https://www.amazon.in");

        driver.manage().window().maximize();

        String title= driver.getTitle();
        System.out.println("Title of the webpage: "+title);

        String currentURL= driver.getCurrentUrl();
        System.out.println("Current URL: "+currentURL);
        Thread.sleep(5000);

        driver.close();


    }

}
