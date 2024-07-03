package dev.demoQA.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;



public abstract class baseDemoQATest {
    private Properties properties;
    public static WebDriver driver;


    public baseDemoQATest() {
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

    @BeforeMethod
    public void setBrowser() {
        String browser = getBrowser();
        //System.out.println(browser);

        if (browser.equals("Chrome")) {
/*
            WebDriverManager.chromedriver().setup();
            System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");  // Path to ChromeDriver
            ChromeOptions options = new ChromeOptions();
            options.setCapability("browserVersion", "125.0.6422.112");
            options.setBinary("/usr/bin/google-chrome"); // Set the correct path to Chrome binary
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
*/

            //WebDriverManager.chromedriver().setup();
            WebDriverManager.chromedriver().clearDriverCache().setup();
            WebDriverManager.chromedriver().clearResolutionCache().setup();
            driver = new ChromeDriver();

        } else if (browser.equals("Firefox")) {

            /* FirefoxOptions options = new FirefoxOptions();
             options.setProfile(new FirefoxProfile(new File("/usr/bin/firefox /etc/firefox /snap/bin/firefox")));  // Set the correct path to your custom Firefox profile
            driver = new FirefoxDriver();
                        Set Firefox options
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("-profile");
            options.addArguments("/usr/bin/firefox /etc/firefox /snap/bin/firefox");*/

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

        //System.out.println(driver);
    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
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

}
