package com.globant.web.driver;



public class BankAccount {

    //Scenario 1: Create an Account

    @Test
    public  void createAccount(){
        log.info("Create your bank account");
    }


    //Scenario 2: Login

    @Test
    public void loginIntoAccount(){
        log.info("Login into your bank account");
    }

    //Scenario 3: Cancel Account

    @Test
    public void cancelAccount(){
        Logger.info("Cancel your account");
    }


}
