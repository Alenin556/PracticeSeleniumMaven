package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YandexMusicPage {

    public WebDriver driver;
    public YandexMusicPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //Шпаргалка по Css
    //Поиск по атрибуту: тег[атрибут='значение'], input[name='name']


    //Шпаргалка по Xpath
    // Поиск по атрибуту:  тег[contains(@атрибут,’значение’)] ,  input[contains(@value,’Feeling’)] или input[contains(@value=’Feeling’)]
    // Поиск по тексту:  h1[contains(text(),’ Log in to’)]



    // css локатор для кнопки поиска
    @FindBy(css = "span[class='d-icon deco-icon d-icon_cross-big  local-icon-theme-black']")
    private WebElement exitButton;

    // css локатор для кнопки поиска
    @FindBy(css = "button[data-b='16']")
    private WebElement findButton;













    // локатор для ввода имени
    @FindBy(xpath ="//input[contains(@name=’name’)]")
    private WebElement nameField;

    //локатор для ввода почты
    @FindBy(xpath ="/html/body/div[3]/div[1]/div[2]/form/table/tbody/tr[2]/td[2]/input")
    private WebElement mailField;

    //локатор для ввода пароля
    @FindBy(xpath ="/html/body/div[3]/div[1]/div[2]/form/table/tbody/tr[3]/td[2]/input")
    private WebElement passwordField;

    // локатор для кнопки регистрации
    @FindBy(xpath = "/html/body/div[3]/div[1]/div[2]/form/table/tbody/tr[4]/td[2]/input")
    private WebElement registrationBtn;

    //метод для ввода имени
    public void inputName(String name) {
        nameField.sendKeys(name); }

    //метод для ввода почты
    public void inputMail(String mail) {
        mailField.sendKeys(mail); }

    //метод для ввода пароля
    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    //метод для нажатия кнопки входа
    public void clickFindButton() {
        findButton.click(); }

    //метод для нажатия кнопки регистрации
    public void clickRegistrationBtn() {
        registrationBtn.click(); }

}

