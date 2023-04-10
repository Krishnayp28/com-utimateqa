package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        // Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //Open the URL into Browser
        driver.get(baseUrl);
        // Maximise the Browser
        driver.manage().window().maximize();
        //We give implicit  wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Get the Tittle of the page
        String tittle = driver.getTitle();
        System.out.println(tittle);
        // Get the Current Url
        System.out.println("Current URL :" + driver.getCurrentUrl());
        // Get page source
        System.out.println("Page Source :" + driver.getPageSource());
        // Find the Email field element and type the Email
        driver.findElement(By.id("user[email]")).sendKeys("jignayp@yahoo.co.uk");
       // Find the Password field element and type the Password
        driver.findElement(By.name("user[password]")).sendKeys("Jigna123");
       // lose the Browser
        driver.close();
    }
}
