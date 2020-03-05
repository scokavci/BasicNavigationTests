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
        for(String eachurl : urls){
            driver.get(eachurl);
        }

        for( String eachurl : urls ){
             String currenturl = driver.getCurrentUrl();
             if(currenturl.contains(driver.getTitle())){
                 System.out.println("PASS");
             }else{
                 System.out.println("FAIL");
             }
        }
        driver.close();
    }
}
