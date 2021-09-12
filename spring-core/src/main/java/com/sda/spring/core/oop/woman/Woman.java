package com.sda.spring.core.oop.woman;

public abstract class Woman {

    private Love love;
    private FinancialSecurity financialSecurity;

    protected Woman(Love love, FinancialSecurity financialSecurity) {
        this.love = love;
        this.financialSecurity = financialSecurity;
    }


    public abstract void feel();


    public abstract void dream();


    public abstract void relax();
}
