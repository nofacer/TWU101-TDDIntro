package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    private  Account account ;

    @Before
    public void init(){
        account=new Account(100);
    }

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        account.deposite(50);
        assertThat(account.getBalance(),is(150));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){

    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){

    }
}
