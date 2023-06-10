import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.YandexMusicPage;


public class TestXpathContains {
    private static WebDriver driver;
    private static YandexMusicPage yandexMusicPage;



    @BeforeAll // перед запуском подключаем драйвер для взаимодействия с браузером
    static void setUpAll() {
        System.setProperty("webdriver.chrome.driver", "C:\\Java Works\\Netology Homeworks\\SeleniumSiteProjectMaven\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.getWindowHandle();
        yandexMusicPage = new YandexMusicPage(driver);


    }

    @BeforeEach
    void connect() {
        driver.get("https://music.yandex.ru/");
    }

    @Test
    void yandexMusicFindMusicFieldTest(){
        yandexMusicPage.clickFindButton();

    }

    @AfterEach
        // выходим из драйвера
    void tearsDown() {
        driver.quit();
    }

    @AfterAll
    static void tearsDownAll() {
        driver=null;
    }



}
