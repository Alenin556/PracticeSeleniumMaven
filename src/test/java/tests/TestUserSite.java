package tests;

import data.Data;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import UserBudget.AutoUserRegistration;
import UserBudget.RegistrationPage;

public class TestUserSite {
    private static WebDriver driver;
    private static RegistrationPage registrationPage;
    private static AutoUserRegistration autoUserRegistration;


    @BeforeAll
    // Перед началом написания тестов, инициализируем драйвер для взаимодействия с браузером.
    // Инициализация (от англ. initialization, инициирование) — создание, подключение, активация, подготовка к работе, определение параметров.
    static void setUpAll() {
        System.setProperty("webdriver.chrome.driver", "C:\\Java Works\\Netology Homeworks\\SeleniumPracticeMaven1\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options); //добавляем драйверу опции и методы по взаимодействию с объектами
        driver.getWindowHandle(); // опция для проведения тестов в открытом окне браузера

        // добавляем страницам возможность работать с объектами
        registrationPage = new RegistrationPage(driver);
        autoUserRegistration = new AutoUserRegistration(driver);

    }

    @BeforeEach
    void connect() {
        driver.get("http://users.bugred.ru/");
    }

    @Test
    void registrationTestCSS() {
        driver.get("http://users.bugred.ru/");
        driver.findElement(By.cssSelector("[href = '/user/login/index.html']")).click();
        driver.findElement(By.name("name")).sendKeys("Андрей");
        driver.findElement(By.name("email")).sendKeys("alenin34@gmail.com");
        driver.findElement(By.cssSelector("input[type=password]")).sendKeys("AndrewCss");
        // тест по факту пройден, но в окне браузера остается не заполненным поле пароля
        driver.findElement(By.name("act_register_now")).click();
    }


    @Test
    void registrationTestXpath() {
        driver.findElement(By.xpath("//*[contains(text(),'Войти')]")).click();
        driver.findElement(By.xpath("//*[(@name='name')]")).sendKeys("Андрей23");
        driver.findElement(By.xpath("//*[(@name='email')]")).sendKeys("alenin12356@gmail.com");
        driver.findElement(By.xpath("//*[(@name='password')]")).sendKeys("AndrewXpath11");
        driver.findElement(By.xpath("//*[(@value='Авторизоваться')]")).click();
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
        autoUserRegistration.authorization(userInfo);

    }
    @AfterEach
        // выходим из драйвера
    void tearsDown() {
        driver.quit();
        driver = null;
    }



}
