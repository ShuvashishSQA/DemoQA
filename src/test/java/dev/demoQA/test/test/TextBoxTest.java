package dev.demoQA.test.test;

import dev.demoQA.test.baseDemoQATest;
import dev.demoQA.test.page.TextBoxPage;
import org.testng.annotations.Test;

public class TextBoxTest extends baseDemoQATest {
    TextBoxPage textBoxPage = new TextBoxPage();

    public TextBoxTest(){
        super();
    }

    @Test
    public void clickSubmit(){
        textBoxPage.
                inputFullName(getFullName()).
                inputEmail(getEmail()).
                inputCurrentAddress(getFullAddress()).
                inputPermanentAddress(getFullAddress()).
                clickSubmit();
    }
}
