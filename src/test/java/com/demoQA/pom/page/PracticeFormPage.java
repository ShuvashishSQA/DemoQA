package com.demoQA.pom.page;

import com.demoQA.pom.util.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeFormPage extends BaseTest {
    @FindBy(xpath = "//h1[text()='Practice Form']")
    WebElement elPracticeFormHeader;
    @FindBy(id = "firstName")
    WebElement tfFirstName;
    @FindBy(id = "lastName")
    WebElement tfLastName;
    @FindBy(id = "userEmail")
    WebElement tfEmail;
    @FindBy(xpath = "//label[text()='Male']")
    WebElement radioGender_Male;
    @FindBy(id = "userNumber")
    WebElement tfMobileNumber;
    @FindBy(id = "dateOfBirthInput")
    WebElement calDateOfBirth;
    @FindBy(id = "subjectsInput")
    WebElement tfSubjectsInput;
    @FindBy(id = "hobbies-checkbox-1")
    WebElement checkboxHobbiesSports;
    @FindBy(id = "uploadPicture")
    WebElement btnUploadPictures;
    @FindBy(id = "currentAddress")
    WebElement tfCurrentAddress;
    @FindBy(xpath = "//div[text()='Select State']")
    WebElement dropdownState;
    @FindBy(xpath = "//div[text()='Select City']")
    WebElement dropdownCity;
    @FindBy(id = "submit")
    WebElement btnSubmit;

    public PracticeFormPage(){
        PageFactory.initElements(driver, this);
    }

    public PracticeFormPage fillFirstName(String firstName){
        tfFirstName.isDisplayed();
        tfFirstName.clear();
        tfFirstName.sendKeys(firstName);
        return this;
    }
    public PracticeFormPage fillLastName(String lastName){
        tfLastName.isDisplayed();
        tfLastName.clear();
        tfLastName.sendKeys(lastName);
        return this;
    }
    public PracticeFormPage fillEmail(String email){
        tfEmail.isDisplayed();
        tfEmail.clear();
        tfEmail.sendKeys(email);
        return this;
    }
    public PracticeFormPage checkGender(){
        radioGender_Male.isDisplayed();
        radioGender_Male.click();
        return this;
    }
    public PracticeFormPage fillMobileNo(String mobile){
        tfMobileNumber.isDisplayed();
        tfMobileNumber.clear();
        tfMobileNumber.sendKeys(mobile);
        return this;
    }
    public PracticeFormPage fillDateOfBirth(String date){
        calDateOfBirth.isDisplayed();
        calDateOfBirth.clear();
        calDateOfBirth.sendKeys(date);
        return this;
    }
    public PracticeFormPage fillSubjects( String subject){
        tfSubjectsInput.isDisplayed();
        tfSubjectsInput.clear();
        tfSubjectsInput.sendKeys(subject);
        return this;
    }
    public PracticeFormPage checkHobbies(){
        checkboxHobbiesSports.isDisplayed();
        checkboxHobbiesSports.click();
        return this;
    }

    public PracticeFormPage uploadImage(){

        return this;
    }



}
