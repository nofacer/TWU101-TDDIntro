package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class AccountTests {
    private  Account account ;

    @Before
    public void init(){
        account=new Account(5);
    }

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){

    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){

    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){

    }
}
