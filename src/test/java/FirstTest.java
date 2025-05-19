import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {
    WebDriver driver = new ChromeDriver();

    @Test
    public void firstTest() {
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//-----------------------------
        pause(3);
        WebElement btnLetCarWork = driver.findElement(By.cssSelector("a[id='1']"));
        btnLetCarWork.click();
        pause(3);
        WebElement btnTermOfUse = driver.findElement(By.cssSelector("*[ng-reflect-router-link='terms-of-use']"));
        btnTermOfUse.click();
        pause(3);
        WebElement btnSignUp = driver.findElement(By.cssSelector("a[href='/registration?url=%2Fterms-of-use']"));
        btnSignUp.click();
        System.out.println(btnSignUp.getText());
        pause(5);
        WebElement inputName = driver.findElement(By.id("name"));
        inputName.sendKeys("Bob");
        pause(2);
        WebElement inputLastName = driver.findElement(By.cssSelector("input[autocomplete='family-name']"));
        inputLastName.sendKeys("Dilan");

    }

    public static void pause(int time) {
        try {
            Thread.sleep(time * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
