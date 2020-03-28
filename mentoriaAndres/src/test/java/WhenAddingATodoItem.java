import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class WhenAddingATodoItem {
    @Test
    public void should_ad_new_item_to_list(){
        System.setProperty("webdriver.chrome.driver", "/Users/andres.celis/Documents/Automation Testing/Automation-Mentoria/chromedriver");
        WebDriver chrome = new ChromeDriver();
        chrome.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        chrome.get("http://todomvc.com/examples/angularjs/#/");
        chrome.findElement(By.tagName("input")).sendKeys("Buy some milk", Keys.RETURN);
        WebElement todolistContents = chrome.findElement(By.className("todo-list"));
        assertThat(todolistContents.getText(), containsString("Buy some milk"));
        chrome.quit();
    }
}
