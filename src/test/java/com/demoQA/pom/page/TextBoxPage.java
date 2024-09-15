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
    @FindBy (id= "permanentAddress")
    WebElement elPermanentAddress;
    @FindBy (id= "submit")
    WebElement btnSubmit;
    @FindBy(xpath = "//span[text()='Practice Form']")
    WebElement btnPracticeForm;
    @FindBy(id = "firstName")
    WebElement elFirstName;



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
        btnSubmit.isDisplayed();
        btnSubmit.click();
        return this;
    }

    public TextBoxPage clickPracticeForm(){
        btnPracticeForm.isDisplayed();
        btnPracticeForm.click();
        return this;
    }

    public TextBoxPage insertFirstName(){
        elFirstName.isDisplayed();
        elFirstName.clear();
        elFirstName.sendKeys("Shuvo");
        return this;
    }

}
