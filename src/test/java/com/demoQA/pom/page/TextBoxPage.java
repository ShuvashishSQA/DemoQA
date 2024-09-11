package com.demoQA.pom.page;

import com.demoQA.pom.util.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage extends BaseTest {

    @FindBy(id = "userName")
    WebElement elFullName;
    @FindBy (id= "userEmail")
    WebElement elEmail;
    @FindBy (id= "currentAddress")
    WebElement elCurrentAddress;
    @FindBy (xpath = "//input[@id=\"permanentAddress\"]")
    WebElement elPermanentAddress;



    public TextBoxPage(){
        PageFactory.initElements(driver, this);
    }

    public TextBoxPage inputFullName(String fullName){
        elFullName.isDisplayed();
        elFullName.clear();
        elFullName.sendKeys(fullName);
        return this;
    }
    public TextBoxPage inputEmail(String email){
        elEmail.isDisplayed();
        elEmail.clear();
        elEmail.sendKeys(email);
        return this;
    }
    public TextBoxPage inputCurrentAddress(String currentAddress){
        elCurrentAddress.isDisplayed();
        elCurrentAddress.clear();
        elCurrentAddress.sendKeys(currentAddress);
        return this;
    }
    public TextBoxPage inputPermanentAddress(String permanentAddress){
        elPermanentAddress.isDisplayed();
        elPermanentAddress.clear();
        elPermanentAddress.sendKeys(permanentAddress);
        return this;
    }
    public TextBoxPage clickSubmit(){
        elEmail.isDisplayed();
        elEmail.click();
        return this;
    }

}
