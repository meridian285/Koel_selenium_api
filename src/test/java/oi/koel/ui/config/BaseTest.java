package oi.koel.ui.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import oi.koel.ui.core.BasePage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Базовый класс инициализации и настройки веб драйвера
 */
public abstract class BaseTest {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        BasePage.setDriver(driver);
    }
    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
