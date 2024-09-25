package com.demoQA.pom.test;

import com.demoQA.pom.page.PracticeFormPage;
import com.demoQA.pom.page.TextBoxPage;
import com.demoQA.pom.util.BaseTest;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {
    //TextBoxPage textBoxPage = new TextBoxPage();
    PracticeFormPage practiceFormPage = new PracticeFormPage();
    public TextBoxTest(){
        super();
    }

    @Test
    public void clickSubmitButton(){
    practiceFormPage = new TextBoxPage()
                .inputFullName(getFullName())
                .inputEmail(getEmail())
                .inputCurrentAddress(getFullAddress())
                .inputPermanentAddress(getFullAddress())
                .clickSubmit()
                .clickForms()
                .clickPracticeForm();
    }
}
