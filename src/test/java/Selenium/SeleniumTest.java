package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\carly\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("process.env.SELENIUM_URI");
        driver.manage().window();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Jukebox Albums")).click();
        if(driver.getCurrentUrl().equals("http://localhost:8080/api/albums")){
            System.out.println("Find jukebox albums passed");
        } else {
            System.out.println("Find jukebox albums failed");
        }
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Jukebox Playlist")).click();
        if(driver.getCurrentUrl().equals("http://localhost:8080/api/playlist")){
            System.out.println("Find jukebox default playlist passed");
        } else {
            System.out.println("Find jukebox default playlist  failed");
        }
    }
}