package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {

    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("https://lulugandgeorgia.com",
                                          "https://wayfair.com/",
                                          "https://walmart.com, ",
                                          "https://westelm.com/");

        WebDriver driver = BrowserFactory.getDriver("chrome");
        //Ignore spaces and casein comparison.

        for( String eachurl : urls ) {
            driver.get("CURRENT URL: "+ eachurl);
            System.out.println(eachurl);
            String title = driver.getTitle();
            System.out.println("Title of the website:"+ title);

            title = title.replace(" ","").toLowerCase();

            if( eachurl.contains(title) ){
                System.out.println("PASS");
            }else{
                System.out.println("FAIL");
            }
        }
        driver.quit();
    }
}
