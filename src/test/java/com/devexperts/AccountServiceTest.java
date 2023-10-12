package com.devexperts;

import com.devexperts.service.AccountService;
import com.devexperts.service.AccountServiceImpl;
import org.junit.Before;
import org.junit.Test;

public class AccountServiceTest {

    private AccountService accountService;

    @Before
    public void before() {
        // Initiate accountService
        accountService = new AccountServiceImpl();
    }

    @Test
    public void givenAnAccount_tryToCreateThenGet_shouldReturnAccountAsExpectation() {
        //Write your test here
    }
}
