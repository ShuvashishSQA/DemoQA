package com.demoQA.pom.test;

import com.demoQA.pom.util.BaseTest;
import com.demoQA.pom.page.ElementPage;
import com.demoQA.pom.page.TextBoxPage;
import org.testng.annotations.Test;

public class ElementTest extends BaseTest {

    TextBoxPage textBoxPage ;

    public ElementTest(){
        super();
    }

    @Test
    public void clickTextBoxButton(){
        textBoxPage = new ElementPage()
                .checkTextBoxVisibility()
                .clickTextBox();
    }
}
