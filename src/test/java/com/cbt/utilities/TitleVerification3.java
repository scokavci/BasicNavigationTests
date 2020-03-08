package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("https://lulugandgeorgia.com",
                "https://wayfair.com/",
                "https://walmart.com, ",
                "https://westelm.com/");

        for(String eachUrl : urls){
            // since I close browser after first url, I need to create driver object each time.
            // it needs to be inside the loop
             WebDriver driver = BrowserFactory.getDriver("chrome");
              driver.get(eachUrl); // open each url
              String title = driver.getTitle();
              title = title.replace(" ","").toLowerCase();
             if( eachUrl.contains(title) ){
                 System.out.println("PASS");
             }else{
                 System.out.println("FAIL");
             }
              driver.close(); // close each url
              Thread.sleep(3000);
         }

    }
}
