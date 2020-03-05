package com.cbt.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                                          "http://practice.cybertekschool.com/dropdown",
                                           "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com");
        String text = driver.findElement(By.className("nav-link")).getText();
        StringUtility.verifyEquals(text,"Home");

        Thread.sleep(2000);

        driver.get("http://practice.cybertekschool.com/dropdown");
        String text1 =  driver.findElement(By.tagName("h3")).getText();
        StringUtility.verifyEquals(text1,"Dropdown List");


        driver.get("http://practice.cybertekschool.com/login");
        Thread.sleep(2000);

        String text2 = driver.findElement(By.tagName("h2")).getText();
        StringUtility.verifyEquals(text2,"Login Page");

        for(String  eachurl : urls){
             if(eachurl.startsWith("http://practice.cybertekschool.com") ){
                 System.out.println("SAME URL BEGINS");
             }else{
                 System.out.println("DIFFERENT URL BEGINS");
             }
        }
        driver.close();
    }
}
