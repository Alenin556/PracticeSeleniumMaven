package tests;

import ProductStore.MainPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ProductStoreTest {

    private static WebDriver driver;
    private static MainPage mainPage;


    @BeforeAll
    // Перед началом написания тестов, инициализируем драйвер для взаимодействия с браузером.
    // Инициализация (от англ. initialization, инициирование) — создание, подключение, активация, подготовка к работе, определение параметров.
    static void setUpAll() {
        System.setProperty("webdriver.chrome.driver", "C:\\Java Works\\Netology Homeworks\\SeleniumPracticeMaven1\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options); //добавляем драйверу опции и методы по взаимодействию с объектами
        driver.getWindowHandle(); // опция для проведения тестов в открытом окне браузера

        // присваиваем переменной mainPage, объект класса MainPage, для взаимодействия с вебэлементами класса
        mainPage = new MainPage(driver);

    }

    @BeforeEach
    void connect() {
        driver.get("https://www.demoblaze.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void RegistrationCssTest() {
        driver.findElement(By.cssSelector("a[id='signin2']")).click();
        driver.findElement(By.cssSelector("input[id='sign-username']")).sendKeys("Andrew1");
        driver.findElement(By.cssSelector("input[id='sign-password']")).sendKeys("Password1");
        driver.findElement(By.cssSelector("button[onclick='register()']")).click();
    }

    @Test
    void LoginCssTest() {
        driver.findElement(By.cssSelector("a[id='login2']")).click();
        driver.findElement(By.cssSelector("input[id='loginusername']")).sendKeys("Andrew1");
        driver.findElement(By.cssSelector("input[id='loginpassword'")).sendKeys("Password1");
        driver.findElement(By.cssSelector("button[onclick='logIn()']")).click();
    }

    @Test
    void PageObjectLoginTest1() {
        mainPage.singUpIcon();
        mainPage.inputUsername("Andrew2");
        mainPage.inputPassword("Password2");
        mainPage.singUp();
    }

    @Test
    void AddPhoneToCartCssTest() {
        driver.findElement(By.cssSelector("a[id='login2']")).click();
        driver.findElement(By.cssSelector("input[id='loginusername']")).sendKeys("Andrew1");
        driver.findElement(By.cssSelector("input[id='loginpassword'")).sendKeys("Password1");
        driver.findElement(By.cssSelector("button[onclick='logIn()']")).click();
        driver.findElement(By.xpath("//a[@onclick=\"byCat('phone')\"]")).click();
        driver.findElement(By.cssSelector("a[href='prod.html?idp_=1']")).click();


    }

    // Метод, который будет выполняться после каждого теста
    @AfterEach
        // выходим из драйвера
    void tearsDown() {
        driver.quit();
        driver = null;
    }



}
