package com.example.aopdemo.dao;

import com.example.aopdemo.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{
    @Override
    public void addAccount(Account theAccount , boolean vipFlag) {
        System.out.println(getClass()+": DOING MY DB WORK : ADDING A ACCOUNT");
    }

    @Override
    public boolean doWork()
    {
        System.out.println(getClass()+": doWork()");
        return false;
    }
}
