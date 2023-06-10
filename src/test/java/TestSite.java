import data.Data;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.AutoRegistration;
import pages.RegistrationPage;

public class TestSite {
    private static WebDriver driver;
    private static RegistrationPage registrationPage;
    private static AutoRegistration autoRegistration;



    @BeforeAll // перед запуском подключаем драйвер для взаимодействия с браузером
    static void setUpAll() {
        System.setProperty("webdriver.chrome.driver", "C:\\Java Works\\Netology Homeworks\\SeleniumSiteProjectMaven\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.getWindowHandle();
        registrationPage = new RegistrationPage(driver);
        autoRegistration = new AutoRegistration(driver);

    }

    @BeforeEach
    void connect() {
        driver.get("http://users.bugred.ru/");
    }

  /*  @Test
    void registrationTestCSS() {
        driver.get("http://users.bugred.ru/");
        driver.findElement(By.cssSelector("[href = '/user/login/index.html']")).click();
        driver.findElement(By.name("name")).sendKeys("Андрей");
        driver.findElement(By.name("email")).sendKeys("alenin34@gmail.com");
        driver.findElement(By.cssSelector("input[type=password]")).sendKeys("AndrewCss");
        driver.findElement(By.name("act_register_now")).click();

    }

   */


    @Test
    void registrationTestXpath() {
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Андрей23");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("alenin12356@gmail.com");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("AndrewXpath11");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/form/table/tbody/tr[4]/td[2]/input")).click();

    }



    @Test
    void registrationTestPageObject1() {
        registrationPage.clickLoginBtn();
        registrationPage.inputName("Андрей3344");
        registrationPage.inputMail("aleninmail1345@icloud.com");
        registrationPage.inputPassword("Andrew1123");
        registrationPage.clickRegistrationBtn();

    }
    @Test
    void registrationTestPageObject2() {
        var userInfo = Data.validUserInformation();
        autoRegistration.authorization(userInfo);


    }
/*
    @AfterEach
        // выходим из драйвера
    void tearsDown() {
        driver.quit();
        driver = null;
    }

 */

}
