package com.myfirstservlet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateForm {
    private static Pattern userNamePattern = Pattern.compile("^[A-Z][a-z]{2,}$");
    private static Pattern emailPatter = Pattern.compile("^[\\w-_\\.?+]{2,}[\\w]\\@([\\w]+\\.)+[\\w]+[\\w]$");
    private static Pattern phoneNumberPatter = Pattern.compile("^[1-9][0-9]{9}$");
    private static Pattern passwordsPattern = Pattern.compile("((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})");
    public static boolean isValidName(String userName,String lastName,String firstName){
        Matcher matcherObject1 = userNamePattern.matcher(userName);
        Matcher matcherObject2 = userNamePattern.matcher(lastName);
        Matcher matcherObject3 = userNamePattern.matcher(firstName);
        return matcherObject1.matches()&&matcherObject2.matches()&&matcherObject3.matches();
    }
    public static boolean isValidPassword(String password){
        Matcher matcherObject = passwordsPattern.matcher(password);
        return matcherObject.matches();
    }
    public static boolean isValidEmail(String email){
        Matcher matcherObject = emailPatter.matcher(email);
        return matcherObject.matches();
    }
    public static boolean isValidPhoneNo(String phoneNo){
        Matcher matcherObject = phoneNumberPatter.matcher(phoneNo);
        return matcherObject.matches();
    }
}
