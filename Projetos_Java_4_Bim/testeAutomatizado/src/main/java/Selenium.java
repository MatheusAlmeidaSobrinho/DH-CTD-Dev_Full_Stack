import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//<version>4.3.0</version>

public class Selenium {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); // incluindo que o teste vai ser no navegador Edge
        driver.get("https://www.saucedemo.com");

        WebElement campoLogin = driver.findElement(By.id("user-name"));
        campoLogin.sendKeys("standard_user");

        WebElement campoSenha = driver.findElement(By.id("password"));
        campoSenha.sendKeys("secret_sauce");

        WebElement botaoParaLogar = driver.findElement(By.id("login-button"));
        botaoParaLogar.click();


    }
}
