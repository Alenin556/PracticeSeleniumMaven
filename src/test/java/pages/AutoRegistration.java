package pages;

import data.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoRegistration {

    public WebDriver driver;

    public AutoRegistration(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //локатор для кнопки входа или авторизации
    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/a")
    private WebElement loginButton;

    // локатор для ввода имени
    @FindBy(xpath ="/html/body/div[3]/div[1]/div[2]/form/table/tbody/tr[1]/td[2]/input")
    private WebElement nameField;

    //локатор для ввода почты
    @FindBy(xpath ="/html/body/div[3]/div[1]/div[2]/form/table/tbody/tr[2]/td[2]/input")
    private WebElement emailField;

    //локатор для ввода пароля
    @FindBy(xpath ="/html/body/div[3]/div[1]/div[2]/form/table/tbody/tr[3]/td[2]/input")
    private WebElement passwordField;

    // локатор для кнопки регистрации
    @FindBy(xpath = "/html/body/div[3]/div[1]/div[2]/form/table/tbody/tr[4]/td[2]/input")
    private WebElement registrationBtn;

    public AutoRegistration authorization( Data.UserInformation info) {
        loginButton.click();
        nameField.sendKeys(info.getName());
        emailField.sendKeys(info.getEmail());
        passwordField.sendKeys(info.getPassword());
        registrationBtn.click();
        return new AutoRegistration(driver);
    }

}
