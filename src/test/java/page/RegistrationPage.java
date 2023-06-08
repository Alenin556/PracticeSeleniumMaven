package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    public WebDriver driver;
    public RegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //локатор для кнопки входа или авторизации
    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/a")
    private WebElement loginBtn;
    // локатор для ввода имени
    @FindBy(xpath ="/html/body/div[3]/div[1]/div[2]/form/table/tbody/tr[1]/td[2]/input")
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

    public void inputName(String name) {
        nameField.sendKeys(name); }

    public void inputMail(String mail) {
        mailField.sendKeys(mail); }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginBtn() {
        loginBtn.click(); }

    public void clickRegistrationBtn() {
        registrationBtn.click(); }
}

