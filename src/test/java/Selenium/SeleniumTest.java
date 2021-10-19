package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {


    public static void main(String[] args) throws InterruptedException {

//        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\carly\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/");
        driver.manage().window();

        driver.findElement(By.linkText("Jukebox Albums")).click();
        if(driver.getCurrentUrl().equals("http://localhost:8080/api/albums")){
            System.out.println("Find jukebox albums passed");
        } else {
            System.out.println("Find jukebox albums failed");
        }
        driver.navigate().back();

        driver.findElement(By.linkText("Jukebox Playlist")).click();
        if(driver.getCurrentUrl().equals("http://localhost:8080/api/playlist")){
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
        driver.close();
    }
}