package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\carly\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://18.130.0.89:8080/");
        driver.manage().window();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Jukebox Albums")).click();
        if(driver.getCurrentUrl().equals("http://18.130.0.89:8080/api/albums")){
            System.out.println("Find jukebox albums passed");
        } else {
            System.out.println("Find jukebox albums failed");
        }
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Jukebox Playlist")).click();
        if(driver.getCurrentUrl().equals("http://18.130.0.89:8080/api/playlist")){
            System.out.println("Find jukebox default playlist passed");
        } else {
            System.out.println("Find jukebox default playlist  failed");
        }
    }
}