import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class PhoneBookIlCarroXPath {
    WebDriver driver = new ChromeDriver();

    @Test
    public void xpathTest() {
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement div = driver.findElement(By.xpath("//div[@id='root']"));
        System.out.println(div.getText());
        WebElement btnAbout = driver.findElement(By.xpath("//a[text()='ABOUT']"));
        String str = btnAbout.getAttribute("href");
        System.out.println(str);
        WebElement btnLogin = driver.findElement(By.xpath("//a[@href='/login']"));
        btnLogin.click();
        WebElement inputEmail = driver.findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys("svetlana.alyabjeva@gmail.com");
        WebElement inputPassword = driver.findElement(By.xpath("//*[@name='password']"));
        inputPassword.sendKeys("Sveta08@");
        WebElement btnRegistration = driver.findElement(By.xpath("//*[text()='Registration']"));
        btnRegistration.click();
        FirstTest.pause(5);
        driver.quit();
    }

    @Test
    public void ilCarroXpath() {
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement btnSignUp = driver.findElement(By.xpath("//a[text()=' Sign up ']"));
        btnSignUp.click();
        WebElement inputName = driver.findElement(By.xpath("//input[@id='name']"));
        inputName.sendKeys("Bilbo1");
        WebElement inputLastName = driver.findElement(By.xpath("//input[@formcontrolname='lastName']"));
        inputLastName.sendKeys("Baggins1");
        WebElement inputEmail = driver.findElement(By.xpath("//form/div[3]/input"));
        inputEmail.sendKeys("email1@mail.ru");
        WebElement inputPassword = driver.findElement(By.xpath("//form/div[4]/input"));
        inputPassword.sendKeys("ema31il@Mail.ru");
        WebElement checkBox = driver.findElement(By.xpath("//label[@for='terms-of-use']"));
        checkBox.click();
        driver.navigate().back();
        WebElement yalla = driver.findElement(By.xpath("//button[@type='submit']"));
        yalla.click();
    }

    @Test
    public void IlCarroLoginXpath() {
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement btnLoginn = driver.findElement(By.xpath("//a[text()=' Log in ']"));
        btnLoginn.click();
        WebElement inpLogin = driver.findElement(By.xpath("//input[@autocomplete='username']"));
        inpLogin.sendKeys("email1@mail.ru");
        WebElement inpPassword = driver.findElement(By.xpath("//input[@id='password']"));
        inpPassword.sendKeys("ema31il@Mail.ru");
        WebElement btnYallA = driver.findElement(By.xpath("//button[@type='submit']"));
        btnYallA.click();
        FirstTest.pause(10);
        driver.quit();

    }

    @Test
    public void phoneXPath() {
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement btnLogin = driver.findElement(By.xpath("//a[@href='/login']"));
        btnLogin.click();
        WebElement inputEmail = driver.findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys("svetlana.alyabjeva@gmail.com");
        WebElement inputPassword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        inputPassword.sendKeys("Sveta08@");
        WebElement btnLogIn = driver.findElement(By.xpath("//button[text()='Login']"));
        FirstTest.pause(5);
        btnLogIn.click();
        FirstTest.pause(10);
        driver.quit();
    }
}




