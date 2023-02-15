package oi.koel.ui.pageObject;

import oi.koel.ui.core.BasePage;
import oi.koel.ui.util.DataGenerator;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

/**
 * Локаторы и методы для страницы Регистрации
 */
public class RegistrationPage  extends BasePage {

    //Поле ввода почты для регистрации
    @FindBy(id = "email")
    private WebElement emailRegistrationField;
    //Кнопка register
    @FindBy(id = "button")
    private WebElement registerButton;
    @FindBy(xpath = "//*[text()='Registration Successful']")
    private WebElement messageRegistrationSuccessful;

    public RegistrationPage(){
        PageFactory.initElements(driver, this);
    }
    //Метод для выполнения регистрации
    public RegistrationPage inputRegistrationData (String email){
        emailRegistrationField.sendKeys(email);
        registerButton.click();
        return new RegistrationPage();
    }
    //Метод проверки что при успешной регистрации видно сообщение Registration Successful
    public void checkRegistration(){
        assertTrue(messageRegistrationSuccessful.isDisplayed());
    }
}
