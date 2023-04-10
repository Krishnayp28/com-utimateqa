package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {

    static String browser = "Edge";
    static WebDriver driver;
    static String baseUrl ="https://courses.ultimateqa.com/users/sign_in";

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        }else {
            System.out.println("Wrong Browser Name");
        }
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println(driver.getTitle());
        // We give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Get the Current URl
        System.out.println("Current URL :" + driver.getCurrentUrl());
        // Get Page Source
        System.out.println("Page source :" + driver.getPageSource());
        // Find the Email field element and type the Email
        driver.findElement(By.id("user[email]")).sendKeys("jignayp@yahoo.co.uk");
        // Find the Password field element and type the Password
        driver.findElement(By.name("user[password]")).sendKeys("Jigna123");
        // Close the Browser
        driver.close();
    }





}
