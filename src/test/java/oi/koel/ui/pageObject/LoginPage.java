package oi.koel.ui.pageObject;

import oi.koel.ui.core.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import readProperties.ConfigProvider;

/**
 * Класс страницы авторизации
 */
public class LoginPage extends BasePage {
    //Локатор поля ввода логина
    @FindBy(xpath = "//input[@type = 'email']")
    private WebElement emailField;
    //Локатор поля ввода пароля
    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;
    //Локатор кнопки Login
    @FindBy(xpath = ".//button[text() = 'Log In']")
    private WebElement loginButton;
    //Локатор проверки что страница загрузилась
    @FindBy(xpath = "//*[@class='music']")
    private WebElement youMusic;

    public LoginPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }
    //Метод логина
    public void createTicket(String email, String password){
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
    }
    //Проверка загрузки страницы
    public void checkLoadMainPage(){
        Assert.assertTrue(youMusic.isDisplayed());
    }
}