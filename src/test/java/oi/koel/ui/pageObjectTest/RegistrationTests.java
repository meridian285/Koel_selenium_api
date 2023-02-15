package oi.koel.ui.pageObjectTest;

import io.qameta.allure.junit4.DisplayName;
import oi.koel.ui.config.BaseTest;
import oi.koel.ui.pageObject.LoginPage;
import oi.koel.ui.pageObject.MainPage;
import oi.koel.ui.util.DataGenerator;
import org.junit.Test;

/**
 * Тесты регистрацию
 */

public class RegistrationTests extends BaseTest {

    @Test
    @DisplayName("Тест на создание нового пользователя, проверка только через UI")
    public void checkRegistration(){
        LoginPage loginPage = new LoginPage();
        loginPage.clickRegistrationLink()
                .inputRegistrationData(new DataGenerator().dataGenerator())
                .checkRegistration();
    }
}
