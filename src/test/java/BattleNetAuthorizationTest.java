import data.Data;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BattleNetPage;

import java.util.concurrent.TimeUnit;

public class BattleNetAuthorizationTest {
    private static WebDriver driver;
    private static BattleNetPage battleNetPage;


    @BeforeAll // перед запуском подключаем драйвер для взаимодействия с браузером
    static void setUpAll() {
        System.setProperty("webdriver.chrome.driver", "C:\\Java Works\\Netology Homeworks\\SeleniumSiteProjectMaven\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.getWindowHandle();
        battleNetPage = new BattleNetPage(driver);

    }

    @BeforeEach
    void connect() {
        driver.get("https://eu.account.battle.net/login/ru/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void authorization() {
        battleNetPage.inputEmail("aleninmailbox@gmail.com");
        battleNetPage.inputPassword("Stuffrecd123");
        battleNetPage.clickAuthorizationButton();
    }


/*
    @AfterEach
        // выходим из драйвера
    void tearsDown() {
        driver.quit();
    }

    @AfterAll
    static void tearsDownAll() {
        driver = null;
    }

 */


}
