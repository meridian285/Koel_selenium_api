package oi.koel.ui.pageObject;

import oi.koel.ui.core.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {
    @FindBy(xpath = "//*[@class='music']")
    private WebElement youMusic;

    public MainPage(){
        PageFactory.initElements(driver, this);
    }

    //Локатор проверки что страница загрузилась
    public void checkLoadMainPage(){
        Assert.assertTrue(youMusic.isDisplayed());
    }
}
