package data;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Helper {

    //Шпаргалка по Css
    //Поиск по атрибуту: тег[атрибут='значение'], input[name='name']


    //Шпаргалка по Xpath
    // Поиск по атрибуту:  тег[contains(@атрибут,’значение’)] ,  input[contains(@value,’Feeling’)] или input[contains(@value=’Feeling’)]
    //  //*[@атрибут='значение'] //*[@id='accountName']
    // * звездочка обозначает все теги, в которые вложен объект, если мы не хотим его обозначать
    // Поиск по тексту:  h1[contains(text(),’ Log in to’)]



    // css локатор для кнопки закрытия рекламы подписки
    @FindBy(css = "span[class='d-icon deco-icon d-icon_cross-big  local-icon-theme-black']")
    private WebElement exitButton;

    // css локатор для кнопки поиска
    @FindBy(css = "button[data-b='16']")
    private WebElement findButton;


    //локатор для ввода почты
    @FindBy(xpath ="/html/body/div[3]/div[1]/div[2]/form/table/tbody/tr[2]/td[2]/input")
    private WebElement mailField;

}
