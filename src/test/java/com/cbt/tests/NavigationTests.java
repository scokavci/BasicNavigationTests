package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
  static WebDriver driver;

    public static void main(String[] args) {
      chromeTest();

    }
    public static void chromeTest(){
        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("http://google.com");
        String title1 = driver.getTitle();

        driver.navigate().to(" https://etsy.com");
        String title2 = driver.getTitle();

        driver.navigate().back();
        String title3 = driver.getTitle();
        StringUtility.verifyEquals(title1,title3);

        driver.navigate().forward();
        String title4 = driver.getTitle();
        StringUtility.verifyEquals(title2,title4);

        driver.close();

    }

}
