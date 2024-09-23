package com.demoQA.pom.test;

import com.demoQA.pom.page.PracticeFormPage;
import com.demoQA.pom.util.BaseTest;
import org.testng.annotations.Test;

public class PracticeFormTest extends BaseTest {
    public PracticeFormTest(){
        super();
    }

    @Test
    public void submitPracticeForm(){
        new PracticeFormPage()
                .fillFirstName(getFirstName())
                .fillLastName(getLastName())
                .fillEmail(getEmail())
                .checkGender()
                .fillMobileNo(getMobileNo())
                .fillDateOfBirth(getBirthDate())
                .fillSubjects("Math")
                .checkHobbies()
                .uploadImage()
                .fillCurrentAddress(getCurrentAddress())
                .selectState(getState())
                .selectCity(getCity())
                .clickSubmit();

    }
}
