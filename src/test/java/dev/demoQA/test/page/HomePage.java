package dev.demoQA.test.page;

import dev.demoQA.test.baseDemoQATest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends baseDemoQATest {

    @FindBy(xpath = "//h5[text()= \"Elements\"]")
    WebElement btnElements;


    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public ElementPage clickElements(){
        btnElements.isDisplayed();
        btnElements.click();
        return new ElementPage();
    }

}
