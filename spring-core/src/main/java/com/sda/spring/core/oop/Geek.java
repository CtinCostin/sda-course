package com.sda.spring.core.oop;

import com.sda.spring.core.oop.skills.Developer;
import com.sda.spring.core.oop.woman.FinancialSecurity;
import com.sda.spring.core.oop.woman.Love;
import com.sda.spring.core.oop.woman.Woman;

public class Geek extends Woman implements Developer {


    public Geek(Love love, FinancialSecurity financialSecurity) {
        super(love, financialSecurity);
    }

    public void newStuff(){
        System.out.println("new stuff");
    }

    @Override
    public void feel() {

    }

    @Override
    public void dream() {

    }

    @Override
    public void relax() {

    }

    @Override
    public void writeCode() {

    }
}
