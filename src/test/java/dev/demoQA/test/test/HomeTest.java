package dev.demoQA.test.test;

import dev.demoQA.test.baseDemoQATest;
import dev.demoQA.test.page.ElementPage;
import dev.demoQA.test.page.HomePage;
import org.testng.annotations.Test;

public class HomeTest extends baseDemoQATest {

    HomePage homePage = new HomePage();
    ElementPage elementPage = new ElementPage();

    public HomeTest(){
        super();
    }

    @Test
    public void clickElements() {
        elementPage= homePage
                .clickElements();
    }
}
