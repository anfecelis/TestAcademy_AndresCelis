import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WhenPlanningATrip {
    @Test
    public  void should_be_able_to_plan_a_trip(){
        System.setProperty("webdriver.chrome.driver", "/Users/andres.celis/Documents/Automation Testing/Automation-Mentoria/chromedriver");
        WebDriver chrome = new ChromeDriver();
        chrome.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        chrome.get("https://transportnsw.info/");
        chrome.findElement(By.id("tniFromTripLocation")).sendKeys("Town Hall");
        chrome.findElement(By.id("tniToTripLocation")).sendKeys("Parramata");
        chrome.findElement(By.className("go-btn")).click();
    }
}
