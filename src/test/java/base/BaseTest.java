package base;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseTest {
	
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();//instantiation
        goHome();
        homePage = new HomePage(driver);
    }
    @BeforeMethod
    public void goHome() {
        driver.get("https://the-internet.herokuapp.com/");//is used to launch the browser and load a url

    }
    @AfterClass
    public void tearDown() {
    	driver.quit();
    }
}
