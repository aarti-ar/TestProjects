package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    //All pages need a driver in order to interact with the browser
    private WebDriver driver;

    private By usernameField= By.id("username");
    private  By passwordField=By.id("password");
    private  By loginButton=By.cssSelector("#login button");


    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    /*
    Here Used 'SecureAreaPage' return type because when we will click on 'Login Button',
     we will be return (land) on the on this page
     */
    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);

    }
}
