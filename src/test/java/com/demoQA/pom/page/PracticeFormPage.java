package com.demoQA.pom.page;

import com.demoQA.pom.util.BaseTest;
import org.openqa.selenium.Keys;
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
    @FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--001']")
    WebElement firstDayOfTheMonth;
    @FindBy(id = "subjectsInput")
    WebElement tfSubjectsInput;
    @FindBy(xpath = "//label[text()='Sports']")
    WebElement checkboxHobbiesSports;
    @FindBy(id = "uploadPicture")
    WebElement btnUploadPictures;
    @FindBy(id = "currentAddress")
    WebElement tfCurrentAddress;
    @FindBy(xpath = "//div[text()='Select State']")
    WebElement dropdownState;
    @FindBy(xpath = "//div[text()='Uttar Pradesh']")
    WebElement dropdownState_UttarPradesh;

    @FindBy(xpath = "//div[text()='Select City']")
    WebElement dropdownCity;
    @FindBy(xpath = "//div[text()='Agra']")
    WebElement dropdownCity_Agra;
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
    public PracticeFormPage fillDateOfBirth(){
        calDateOfBirth.isDisplayed();
        scrollAndClick(calDateOfBirth);
        firstDayOfTheMonth.click();

       /* //calDateOfBirth.clear();
        //calDateOfBirth.sendKeys(date);*/
        return this;
    }
    public PracticeFormPage fillSubjects( String subject){
        tfSubjectsInput.isDisplayed();
        tfSubjectsInput.clear();
        tfSubjectsInput.sendKeys(subject);
        tfSubjectsInput.sendKeys(Keys.ENTER);
        return this;
    }
    public PracticeFormPage checkHobbies(){
        checkboxHobbiesSports.isDisplayed();
        scrollAndClick(checkboxHobbiesSports);
        return this;
    }

    public PracticeFormPage uploadImage() {
        btnUploadPictures.isDisplayed();
        btnUploadPictures.sendKeys("C:\\Users\\Mir IT\\Downloads\\Design-1.jpg");
        return this;
    }

    public PracticeFormPage fillCurrentAddress( String currentAddress){
        tfCurrentAddress.isDisplayed();
        tfCurrentAddress.click();
        tfCurrentAddress.sendKeys(currentAddress);
        return this;
    }

    public PracticeFormPage selectState(){
        dropdownState.isDisplayed();
        /*Select state = new Select(dropdownState);             //Select doesn't work for non-select(Custom) dropdown
        state.selectByVisibleText(State);*/
        scrollAndClick(dropdownState);
        scrollAndClick(dropdownState_UttarPradesh);
        return this;
    }

    public PracticeFormPage selectCity(){
        dropdownCity.isDisplayed();
        /*Select city =new Select(dropdownCity);                //Select doesn't work for non-select(Custom) dropdown
        city.selectByVisibleText(City);*/
        scrollAndClick(dropdownCity);
        scrollAndClick(dropdownCity_Agra);
        return this;
    }

    public PracticeFormPage clickSubmit() {
        btnSubmit.isDisplayed();
        btnSubmit.click();
        //btnSubmit.wait(300);
        return this;
    }

}
