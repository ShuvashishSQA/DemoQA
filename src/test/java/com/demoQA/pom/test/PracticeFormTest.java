package com.demoQA.pom.test;

import com.demoQA.pom.page.PracticeFormPage;
import com.demoQA.pom.util.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.awt.*;
import java.security.Key;

public class PracticeFormTest extends BaseTest {
    public PracticeFormTest(){
        super();
    }

    @Test
    public void submitPracticeForm() throws InterruptedException{
        new PracticeFormPage()
                .fillFirstName(getFirstName())
                .fillLastName(getLastName())
                .fillEmail(getEmail())
                .checkGender()
                .fillMobileNo(getMobileNo())
                .fillDateOfBirth()
                .fillSubjects("Math")
                .checkHobbies()
                .uploadImage()
                .fillCurrentAddress(getCurrentAddress())
                .selectState()
                .selectCity()
                .clickSubmit();
    }
}
