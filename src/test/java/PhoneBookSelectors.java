import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;


public class PhoneBookSelectors {
    WebDriver driver = new ChromeDriver();

    @Test
    public void phoneBookTest(){
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        FirstTest.pause(5);
        WebElement btnHome = driver.findElement(By.cssSelector("a[aria-current='page']"));
        btnHome.click();
        WebElement btnAbout = driver.findElement(By.cssSelector("a[href='/about']"));
        btnAbout.click();
        WebElement div = driver.findElement(By.cssSelector("div[class='about_main__2Uv5W']"));
        String divText = div.getText();
        System.out.println(divText);
        WebElement h1 = driver.findElement(By.cssSelector("div[class='about_main__2Uv5W'] h1"));
        System.out.println(h1);
        FirstTest.pause(2);
        WebElement btnLogin = driver.findElement(By.cssSelector("div[class='navbar-component_nav__1X_4m'] a:nth-child(4)"));
        btnLogin.click();
        WebElement inputEmail = driver.findElement(By.cssSelector("*[name='email']"));
        inputEmail.sendKeys("svetlana.alyabjeva@gmail.com");
        WebElement inputPassword = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        inputPassword.sendKeys("Sveta08@");
        WebElement btnLoginForm = driver.findElement(By.cssSelector("button[name='login']"));
        btnLoginForm.click();
        FirstTest.pause(5);
        driver.quit();


    }

}
