package org.arpit.java2blog;
 
public class CapitalizeFirstLetterMain {
    public static void main(String[] args) {
 
        // create a string
        String name = "java2blog";
        System.out.println("Original String: " + name);
        // get First letter of the string
        String firstLetStr = name.substring(0, 1);
        // Get remaining letter using substring
        String remLetStr = name.substring(1);
 
        // convert the first letter of String to uppercase
        firstLetStr = firstLetStr.toUpperCase();
 
        // concantenate the first letter and remaining string
        String firstLetterCapitalizedName = firstLetStr + remLetStr;
        System.out.println("String with first letter as Capital: " + firstLetterCapitalizedName);
 
    }
}
