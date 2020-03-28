import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class WhenALookingForAPetStore {
    @Test
    public void should_find_pet_store(){
        System.setProperty("webdriver.chrome.driver", "/Users/andres.celis/Documents/Automation-Mentoria/chromedriver");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://duckduckgo.com/");
        chrome.findElement(By.id("search_form_input_homepage")).sendKeys("pet store");
        chrome.findElement(By.id("search_button_homepage")).click();
        assertThat(chrome.getTitle(), equalTo("pet store at DuckDuckGo"));
        chrome.quit();
    }
}
