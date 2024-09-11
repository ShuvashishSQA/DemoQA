package com.demoQA.pom.test;

import com.demoQA.pom.page.HomePage;
import com.demoQA.pom.util.BaseTest;
import com.demoQA.pom.page.ElementPage;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

    ElementPage elementPage;

    public HomeTest(){
        super();
    }

    @Test
    public void clickElement() {
        elementPage = new HomePage()
                .clickElements();
    }
}
