package com.demoQA.pom.test;

import com.demoQA.pom.page.TextBoxPage;
import com.demoQA.pom.util.BaseTest;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {
    TextBoxPage textBoxPage ;

    public TextBoxTest(){
        super();
    }

    @Test
    public void clickSubmitButton(){
        textBoxPage.
                inputFullName(getFullName()).
                inputEmail(getEmail()).
                inputCurrentAddress(getFullAddress()).
                inputPermanentAddress(getFullAddress()).
                clickSubmit();
    }
}
