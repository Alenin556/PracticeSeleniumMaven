package UserBudget;

import data.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoUserRegistration {

    // Настройки необходимые для работы с веб-элементами
    public WebDriver driver;

    public AutoUserRegistration(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    //локатор для кнопки входа или авторизации
    @FindBy(xpath = "//*[contains(text(),'Войти')]")
    private WebElement loginButton;

    // локатор для ввода имени
    @FindBy(xpath = "//*[(@name='name')]")
    private WebElement nameField;

    //локатор для ввода почты
    @FindBy(xpath = "//*[(@name='email')]")
    private WebElement emailField;

    //локатор для ввода пароля
    @FindBy(xpath = "//*[(@name='password')]")
    private WebElement passwordField;

    // локатор для кнопки регистрации
    @FindBy(xpath = "//*[(@value='Авторизоваться')]")
    private WebElement registrationBtn;

    public AutoUserRegistration authorization(Data.UserInformation info) {
        loginButton.click();
        nameField.sendKeys(info.getName());
        emailField.sendKeys(info.getEmail());
        passwordField.sendKeys(info.getPassword());
        registrationBtn.click();
        return new AutoUserRegistration(driver);
    }

}
