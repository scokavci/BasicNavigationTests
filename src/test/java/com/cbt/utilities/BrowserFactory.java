package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    /** This method takes browser and create
     *  a WebDriver object based on browser
     *
     * @param browserName
     * @return WebDriver
     */
    public static WebDriver getDriver(String browserName) {
        String operSystem = System.getProperty("os.name");
        switch (browserName) {
            case "edge":
                if (operSystem.contains("mac")) {
                    return null;
                } else {
                    WebDriverManager.edgedriver().setup();
                    return new EdgeDriver();
                }
            case "safari":
                if (operSystem.contains("windows")) {
                    return null;
                } else {
                    System.out.println("I don't have safaridriver method in WebDriverManager class");
                }
            case "chrome":
                WebDriverManager.chromedriver().version("79").setup();
                return new ChromeDriver();
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
        }
        return null;

    }

}
