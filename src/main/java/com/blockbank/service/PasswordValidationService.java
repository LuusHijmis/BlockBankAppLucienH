package com.blockbank.service;

/**
 * @author hannahvd
 * Serviceclass that checks new passwords created by user on given requirements.
 * Method isValid(String password) returns true only if every requirement is met.
 */

//TODO: tweede password check

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class PasswordValidationService {

    private static final String EMPTY_OR_NULL_PASSWORD = "Password can not be empty.";
    private final String ERROR_LENGTH = String.format("Password must be between %d and %d characters long.", MIN_PASSWORD_LENGTH, MAX_PASSWORD_LENGTH); //128 is a bit long? db-wise?
    private static final String ERROR_CASE = "Password must include both upper and lowercase letters.";
    private static final String ERROR_LETTER_AND_DIGIT = "Password must contain both a letter and a digit between 0-9.";
    private static final String ERROR_SPECIAL_SYMBOL = "Password must contain a symbol: @,#$%!^*().";
    private static final int MIN_PASSWORD_LENGTH = 12;
    private static final int MAX_PASSWORD_LENGTH = 24;

    //String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
    private static final Pattern casePattern = Pattern.compile("[A-Z][a-z]");
    private static final Pattern letterAndDigitPattern = Pattern.compile("(?=.*[a-z])(?=.*[0-9])");
    private static final Pattern symbolPattern = Pattern.compile("(.*[@,#$%!^*().].*$)");

    protected boolean passwordNotIdentical(String password1, String password2) {
        return !password1.equals(password2);
    }

    protected boolean isValid(String password) {
        if (checkEmpty(password)) {
            return false;
        }
        if (checkIncorrectLength(password)) {
            return false;
        }
        if (checkNoUpperCase(password)) {
            return false;
        }
        if (checkNoLetterAndDigit(password)) {
            return false;
        }
        if (checkNoSymbol(password)) {
            return false;
        }
        return true;
    }

    private boolean checkEmpty(String password) {
        if (password == null || password.equals("")) {
            System.out.println(EMPTY_OR_NULL_PASSWORD);
            return true;
        }
        return false;
    }

    private boolean checkIncorrectLength(String password) {
        if (password.length() < MIN_PASSWORD_LENGTH || password.length() > MAX_PASSWORD_LENGTH) {
            System.out.println(ERROR_LENGTH);
            return true;
        }
        return false;
    }

    private boolean checkNoUpperCase(String password) {
        Matcher matcher = casePattern.matcher(password);
        if (!matcher.find()) {
            System.out.println(ERROR_CASE);
            return true;
        }
        return false;
    }

    private boolean checkNoLetterAndDigit(String password) {
        Matcher matcher = letterAndDigitPattern.matcher(password);
        if (!matcher.find()) {
            System.out.println(ERROR_LETTER_AND_DIGIT);
            return true;
        }
        return false;
    }

    private boolean checkNoSymbol(String password) {
        Matcher matcher = symbolPattern.matcher(password);
        if (!matcher.find()) {
            System.out.println(ERROR_SPECIAL_SYMBOL);
            return true;
        }
        return false;
    }

    //TODO: populaire wachtwoorden check
      //drie opties:

    //1. via API / extern ?
    private boolean checkPopularPasswordsExtern(String password) {
        return false;
    }

    //2. via resource File (import/update via extern?)
    private boolean checkPopularPasswordsFile(String password) {
        try {
            File passwordsFile = new File("passwordsFile.txt"); //file bestaat nog niet
            Scanner readPasswords = new Scanner(passwordsFile);
            while (readPasswords.hasNextLine()) {
                //bla
            }
        } catch (FileNotFoundException exception) {
            System.out.println("An error occurred.");
            exception.printStackTrace();
        }
        return false;
    }

    //3. via List (ain't the way imo)
    private boolean checkPopularPasswordsList(String password) {
        ArrayList<String> popularPasswords = new ArrayList<>();
        popularPasswords.add("Welkom12345.");
        popularPasswords.add("Welcome12345.");
        popularPasswords.add("Wachtwoord12345.");
        popularPasswords.add("Password12345.");
        for (int i = 0; i < popularPasswords.size(); i++) {
            if (popularPasswords.contains(password)) {
                System.out.println("Commonly used password.");
                return true;
            }
        }
        return false;
    }
}