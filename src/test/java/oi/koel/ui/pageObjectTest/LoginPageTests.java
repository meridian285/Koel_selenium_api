package oi.koel.ui.pageObjectTest;


import oi.koel.ui.config.BaseTest;
import oi.koel.ui.pageObject.LoginPage;
import org.junit.Test;

import readProperties.ConfigProvider;

/**
 * Тесты страницы авторизации
 */
public class LoginPageTests extends BaseTest {

    @Test
    public void checkLogIn(){
        LoginPage mainPage = new LoginPage();
        mainPage.createTicket(ConfigProvider.USER_LOGIN, ConfigProvider.USER_PASSWORD);
        mainPage.checkLoadMainPage();
    }
}