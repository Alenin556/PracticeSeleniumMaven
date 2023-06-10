package pages;

import data.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BattleNetPage {

    public WebDriver driver;

    Data data = new Data();

    public BattleNetPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //локатор для ввода почты
    @FindBy(xpath ="//*[@id='accountName']")
    private WebElement emailField;

    //локатор для ввода пароля
    @FindBy(xpath ="//*[@id='password']")
    private WebElement passwordField;

    // локатор для кнопки авторизации
    @FindBy(xpath = "//*[@id='submit']")
    private WebElement authorizationButton;

    //локатор для регистрации
    @FindBy(xpath ="//*[@id='signup']")
    private WebElement registrationButton;

    //локатор для поля дата рождения
    @FindBy(xpath ="//*[@name='dob-plain']")
    private WebElement birthDayDateField;

    //локатор для кнопки далее, на странице ввода даты рождения
    @FindBy(xpath ="//*[@id='flow-form-submit-btn']")
    private WebElement nextButton;

    //метод для ввода почты
    public void inputEmail(String mail) {
        emailField.sendKeys(mail); }

    //метод для ввода пароля
    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    //метод для ввода даты рождения
    public void inputBirthDayDate(String date) {
        birthDayDateField.sendKeys(date); }



    //метод для выбора поля даты рождения
    public void clickNextButton() {
        nextButton.click(); }




    //метод для авторизации
    public void clickAuthorizationButton() {
        authorizationButton.click();
    }

    //метод для регистрации
    public void clickRegistrationButton() {
        registrationButton.click(); }


/*
    // локатор для ввода имени
    @FindBy(xpath ="//input[contains(@name=’name’)]")
    private WebElement nameField;



    // локатор для кнопки регистрации
    @FindBy(xpath = "/html/body/div[3]/div[1]/div[2]/form/table/tbody/tr[4]/td[2]/input")
    private WebElement registrationBtn;

    //метод для ввода имени
    public void inputName(String name) {
        nameField.sendKeys(name); }


    //метод для нажатия кнопки
    public void clickFindButton() {
        findButton.click(); }

    //метод для нажатия кнопки регистрации
    public void clickRegistrationBtn() {
        registrationBtn.click(); }



 */

}

