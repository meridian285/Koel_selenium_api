package oi.koel.ui.pageObjectTest;


import io.qameta.allure.junit4.DisplayName;
import oi.koel.ui.config.BaseTest;
import oi.koel.ui.pageObject.LoginPage;
import org.junit.BeforeClass;
import org.junit.Test;

import readProperties.ConfigProvider;

/**
 * Тесты страницы авторизации
 */
public class LoginPageTests extends BaseTest {

    @Test
    @DisplayName("Тест на вход с валидными данными")
    public void checkLogIn(){
        LoginPage loginPage = new LoginPage();
        loginPage.createTicket(ConfigProvider.USER_LOGIN, ConfigProvider.USER_PASSWORD)
                .checkLoadMainPage();
    }
}