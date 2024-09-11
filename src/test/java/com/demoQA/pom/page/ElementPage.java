package com.demoQA.pom.page;

import com.demoQA.pom.util.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ElementPage extends BaseTest {

    @FindBy (xpath = "//span[text()=\"Text Box\"]")
    WebElement btnTextBox;

    public ElementPage(){
        PageFactory.initElements(driver, this);
    }

    public ElementPage checkTextBoxVisibility(){
        System.out.println(btnTextBox);
        btnTextBox.isDisplayed();
        return this;
    }

    public TextBoxPage clickTextBox(){
        System.out.println(btnTextBox);
        btnTextBox.click();
        return new TextBoxPage();
    }

}
