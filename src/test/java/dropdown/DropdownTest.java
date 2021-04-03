package dropdown;

import base.BaseTests;
import pages.HomePage;

public class DropdownTest extends BaseTests {

    public void testSelectionOption(){
        var dropDownPage=homePage.clickDropDown();
        dropDownPage.selectFromDropdown("Option 1");


    }

}
