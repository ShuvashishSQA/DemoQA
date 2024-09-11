package com.demoQA.pom.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


public abstract class BaseTest {
    private Properties properties;

    public static WebDriver driver;


    public BaseTest() {
        String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\configuration";        // C:\Users\Mir IT\IdeaProjects\DemoQA\src\test\resources\configuration
        properties = new Properties();

        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            try {
                properties.load(fileInputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @BeforeTest
    public void setBrowser() {
        String browser = getBrowser();

        if (browser.equals("Chrome")) {
            //WebDriverManager.chromedriver().setup();
            WebDriverManager.chromedriver().clearDriverCache().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equals("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }


        driver.get(getBaseUrl());

        //before sending NoSuchElementException driver will wait at least 30 seconds by default.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //window will open in remaining space of the screen considering all the available window
        driver.manage().window().maximize();
    }

    public String getBaseUrl() {
        return properties.getProperty("baseURL");
    }
    public String getBrowser() {
        return properties.getProperty("browser");
    }
    public String getFullName() {
        return properties.getProperty("fullName");
    }
    public String getEmail() {
        return properties.getProperty("email");
    }
    public String getFullAddress() {
        return properties.getProperty("currentAddress");
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
