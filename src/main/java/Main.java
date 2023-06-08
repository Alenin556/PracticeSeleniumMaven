import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Java Works\\Netology Homeworks\\SeleniumSiteProjectMaven\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://users.bugred.ru");

        WebElement loginButton = driver.findElement(By.linkText("Войти"));
        WebElement input = driver.findElement(By.cssSelector("input[name='login'])"));

    }
}
