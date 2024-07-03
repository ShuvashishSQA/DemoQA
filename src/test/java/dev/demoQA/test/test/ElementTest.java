package dev.demoQA.test.test;

import dev.demoQA.test.baseDemoQATest;
import dev.demoQA.test.page.ElementPage;
import dev.demoQA.test.page.TextBoxPage;
import org.testng.annotations.Test;

public class ElementTest extends baseDemoQATest {

    ElementPage elementPage = new ElementPage() ;
    TextBoxPage textBoxPage = new TextBoxPage();

    public ElementTest(){
        super();
    }

    @Test
    public void clickTextBox(){
        textBoxPage = elementPage.
                checkTextBoxVisibility().
                clickTextBox();

    }
}
