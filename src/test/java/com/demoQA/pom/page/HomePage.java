package com.demoQA.pom.page;

import com.demoQA.pom.util.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {

    @FindBy(xpath = "//div[@class=\"card-body\"]//h5[text()=\"Elements\"]\n")
    WebElement btnElement;


    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public ElementPage clickElements(){
        btnElement.isDisplayed();
        btnElement.click();
        return new ElementPage();
    }

}
