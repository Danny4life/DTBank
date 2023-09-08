package com.osiki.demobankapp.utils;

import java.time.Year;

public class AccountUtils {

    public final static String ACCOUNT_EXISTS_CODE = "001";
    public final static String ACCOUNT_EXISTS_MESSAGE = "User already have an account!";
    public final static String ACCOUNT_CREATION_SUCCESS = "002";
    public final static String ACCOUNT_CREATION_MESSAGE = "Account has been created successfully!";

    public final static String ACCOUNT_NOT_EXISTS_CODE = "003";

    public final static String ACCOUNT_NOT_EXISTS_MESSAGE = "Account number not found";

    public final static String ACCOUNT_FOUND_CODE = "004";

    public final static String ACCOUNT_FOUND_SUCCESS = "User Account Found";

    public final static String ACCOUNT_CREDITED_SUCCESS_CODE = "005";
    public final static String ACCOUNT_CREDITED_SUCCESS_MESSAGE = "User Account Credited";

    public final static String INSUFFICIENT_BALANCE_CODE = "006";

    public final static String INSUFFICIENT_BALANCE_MESSAGE = "Insufficient Balance";

    public final static String ACCOUNT_DEBITED_MESSAGE_CODE = "007";

    public final static String ACCOUNT_DEBITED_MESSAGE = "Account has been successfully debited";

    public final static String TRANSFER_SUCCESSFUL_CODE = "008";

    public final static String TRANSFER_SUCCESSFUL_MESSAGE = "Transfer Successful";



    public static String generateAccountNumber(){
        //the account number should be a combination
        //of the current year and any random six digits

        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;

        //generate a random number between min and max;
        int randomNum = (int) Math.floor(Math.random() * (max - min - 1) + min);

        //then convert the current year and random number to a string and concatenate them
        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randomNum);

        StringBuilder accountNumber = new StringBuilder();

        return accountNumber.append(year).append(randomNumber).toString();

    }

}
