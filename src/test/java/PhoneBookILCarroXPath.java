import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class PhoneBookILCarroXPath {

    WebDriver driver = new ChromeDriver();



    @Test
    public void xpathTest(){
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement div = driver.findElement(By.xpath("//div[@id='root']"));//css div[id=root]
        System.out.println(div.getText());

        WebElement btnAbout = driver.findElement(By.xpath("//a[text()='ABOUT']"));
        String str = btnAbout.getAttribute("href");
        System.out.println(str);

        WebElement btnLogin = driver.findElement(By.xpath("//a[@href='/login']"));
        btnLogin.click();

        WebElement btnemail = driver.findElement(By.xpath("//input[@name=\"email\"]"));
        btnemail.sendKeys("jhgjhgjg@mail.ru");

        WebElement inputPassword = driver.findElement(By.xpath("//*[@name=\"password\"]"));
        inputPassword.sendKeys("123456ghj");

        WebElement btnRegistration = driver.findElement(By.xpath("//*[text()='Registration']"));
        //btnRegistration.click();

        driver.quit();


    }

    @Test
    public void ilCarroXpath(){
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         WebElement btnSignUp = driver.findElement(By.xpath("//a[text()=' Sign up ']"));
         btnSignUp.click();
         WebElement inputName = driver.findElement(By.xpath("//input[@id='name']"));
         inputName.sendKeys("Bilbo");
         WebElement inputLastName = driver.findElement(By.xpath("//input[@formcontrolname=\"lastName\"]"));
         inputLastName.sendKeys("Baggins");
         WebElement inputEmail = driver.findElement(By.xpath("//form/div[3]/input"));
         inputEmail.sendKeys("gggg@mail.com");
         WebElement inputPassword = driver.findElement(By.xpath("//form/div[4]/input"));
         inputPassword.sendKeys("123456Nm.");
         WebElement checkBox = driver.findElement(By.xpath("//label[@for='terms-of-use']"));
         checkBox.click();
    }

    @Test
    public void loginPhoneBookPositiveTest(){
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement btnLoginHeader = driver.findElement(By.xpath("//a[text()='LOGIN']"));
        btnLoginHeader.click();
        WebElement inputEmail = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement inputPassword = driver.findElement(By.xpath("//*[@placeholder=\"Password\"]"));
        inputEmail.sendKeys("jhgjhgjg@mail.ru");
        inputPassword.sendKeys("123456ghj");
        WebElement btnLoginForm = driver.findElement(By.xpath("//form/button[1]"));
        btnLoginForm.click();


    }
    @Test
    public void loginILCarroPositiveTest(){
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement btnLoginHeader = driver.findElement(By.xpath("//a[text()=' Log in ']"));
        btnLoginHeader.click();
        //driver.close();// закрывает текущее окно
        //driver.quit();// закрывает все окна
        WebElement inputEmail = driver.findElement(By.xpath("//input[@id=\"email\"]"));
       // WebElement inputEmail_1 = driver.findElement(By.id("email"));
        WebElement inputPassword = driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
        inputEmail.sendKeys("gggg@mail.com");
        inputPassword.sendKeys("123456Nm.");
        WebElement btnLoginForm = driver.findElement(By.xpath("//form/button"));
        btnLoginForm.click();
        driver.close();

    }
}
