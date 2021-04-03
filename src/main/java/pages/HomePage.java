package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    //All pages need a driver in order to interact with the browser
    private WebDriver driver;

    //Used "Private" here because it is a Authentication fields and also practicing Encapsulation
    //private By formAuthenticationLink =By.linkText("Form Authentication");

    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    /*
        So when we click on that Form Authentication field , we actually returned to the Login Page(new page),
        So here we have used 'public LoginPage(return type)rather than VOID '
         */
    public LoginPage clickFormAuthentication(){
       // driver.findElement(formAuthenticationLink).click();
        clickLink("Form Authentication");       //  used generic 'clickLink' method
        return new LoginPage(driver);
    }
    public DropDownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }
    //Creating Generic Method will be using for all links on that Home Page and it will not return
    private void clickLink(String linkText){    //we can make it public as well
        driver.findElement(By.linkText(linkText)).click();
    }
}
