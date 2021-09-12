package com.sda.spring.core.oop.pitzi;

import com.sda.spring.core.oop.skills.Developer;
import com.sda.spring.core.oop.skills.Polyglot;
import com.sda.spring.core.oop.woman.FinancialSecurity;
import com.sda.spring.core.oop.woman.Love;
import com.sda.spring.core.oop.woman.Woman;

public class Pitzi extends Woman implements Polyglot, Developer {

    private Pony pony;


    public Pitzi(Love love, FinancialSecurity financialSecurity) {
        super(love, financialSecurity);
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
    public void speakEnglish() {

    }

    @Override
    public void speakSpanish() {

    }

    @Override
    public void writeCode() {

    }

    public Pony giveMeAPony(Pony pony) {
        if (pony != null) {
            this.pony = pony;
        } else {
            System.out.println("cries");
        }
        return this.pony;

    }

    public void feedPony() {
        this.pony.eat();

    }
}
