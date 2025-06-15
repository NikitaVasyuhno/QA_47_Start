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
        //
        FirstTest.pause(5);

        WebElement headerHome = driver.findElement(By.cssSelector("a[href='/home']"));
        headerHome.click();
        pause(2);

        WebElement headerAbout = driver.findElement(By.cssSelector("a[href='/about']"));
        headerAbout.click();
        pause(2);

        WebElement div = driver.findElement(By.cssSelector("div[class=\"about_main__2Uv5W\"]"));
        String divText = div.getText();
        System.out.println(divText);
        WebElement h1 = driver.findElement(By.cssSelector("div[class='about_main__2Uv5W']>h1"));
        System.out.println("h1-->" + h1.getText());


        WebElement headerLogin = driver.findElement(By.cssSelector("a[href='/login']"));
       // WebElement btnLogin = driver.findElement(By.cssSelector("div[class=\"navbar-component_nav__1X_4m\"]a:nth-child(4)"));
        headerLogin.click();
        headerLogin.getText();
        System.out.println(headerLogin.getText());
        pause(2);

        WebElement inputEmail = driver.findElement(By.cssSelector("input[name=\"email\"]"));
        inputEmail.sendKeys("PurPur@mail.ru");
        pause(3);

        WebElement inputPassword = driver.findElement(By.cssSelector("input[name='password']"));
        inputPassword.sendKeys("123456.j");
        pause(3);








    }

    public static void pause(int time)  {
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
