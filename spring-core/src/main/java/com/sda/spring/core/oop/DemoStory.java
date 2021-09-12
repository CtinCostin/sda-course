package com.sda.spring.core.oop;

import com.sda.spring.core.oop.pitzi.Pitzi;
import com.sda.spring.core.oop.pitzi.Pony;
import com.sda.spring.core.oop.woman.FinancialSecurity;
import com.sda.spring.core.oop.woman.Love;

public class DemoStory {

    public static void main(String[] args) {
        Love love = new Love();
        FinancialSecurity financialSecurity = new FinancialSecurity();

        Pitzi andreea = new Pitzi(love, financialSecurity);

        Pony pony = null;

        andreea.giveMeAPony(pony);

        Pony realPony = new Pony("Vasilica");

        andreea.giveMeAPony(realPony);

        andreea.feedPony();

        Geek ioana = new Geek(love, financialSecurity);
        ioana.writeCode();


    }
}
