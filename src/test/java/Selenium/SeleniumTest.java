package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {


    public static void main(String[] args) throws InterruptedException {


        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("http://localhost:9001/");
        driver.manage().window();
        driver.findElement(By.linkText("Jukebox Albums")).click();
        if(driver.getCurrentUrl().equals("http://localhost:9001/api/albums")){
            System.out.println("Find jukebox albums passed");
        } else {
            System.out.println("Find jukebox albums failed");
        }
        driver.navigate().back();
        driver.findElement(By.linkText("Jukebox Playlist")).click();
        if(driver.getCurrentUrl().equals("http://localhost:9001/api/playlist")){
            System.out.println("Find jukebox default playlist passed");
        } else {
            System.out.println("Find jukebox default playlist failed");
        }
        driver.navigate().back();
        driver.findElement(By.id("songTrack")).sendKeys("Girls Got Rhythm");
        driver.findElement(By.xpath("//button[contains(text(), 'Search for Song')]")).click();
        if (driver.getCurrentUrl().equals("http://localhost:8080/api/trackSearch?songTrack=Girls+Got+Rhythm")) {
            System.out.println("Search for track passed");
        } else {
            System.out.println("Search for track failed");
        }
        driver.quit();
    }
}