package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
/*
https://testautomationu.applitools.com/selenium-webdriver-tutorial-java/
 */

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;       //created protected variable

    public static void main(String args[]){
        BaseTests test= new BaseTests();
        test.setUp();
    }


    public void setUp(){

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        homePage=new HomePage(driver);
//        JavascriptExecutor js = ((JavascriptExecutor) driver);
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

       // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//        //driver.manage().window().setSize(new Dimension(375,812));           //For Mobile look
//        System.out.println(driver.getTitle());
          //driver.close();


    }

    }
