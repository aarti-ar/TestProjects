package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    //All pages need a driver in order to interact with the browser
    private WebDriver driver;
    private By statusAlert=By.id("flash");

    public SecureAreaPage(WebDriver driver){
        this.driver=driver;
    }
    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }
}

/*
//To check unique element in inspect page press crtlF
and add "#" sign before text like(#flash)
 */