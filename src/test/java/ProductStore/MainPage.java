package ProductStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public WebDriver driver;

    public MainPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (css = "a[id='signin2']")
    private WebElement singUpIcon;

    @FindBy (css = "input[id='sign-username']")
    private WebElement singUpNameField;

    @FindBy (css = "input[id='sign-password']")
    private WebElement singUpPasswordField;

    @FindBy (css = "button[onclick='register()']")
    private WebElement singUp;


    //метод для ввода имени
    public void inputUsername(String username) {
        singUpNameField.sendKeys(username);
    }

    //метод для ввода пароля
    public void inputPassword(String password) {
        singUpPasswordField.sendKeys(password);
    }

    //метод для выбора иконки с регистрацией
    public void singUpIcon() {
        singUpIcon.click();
    }

    //метод для подтверждения регистрации
    public void singUp() {
        singUp.click();
    }



}
