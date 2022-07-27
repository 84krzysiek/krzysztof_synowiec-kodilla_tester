package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTestSuiteTest {


    @Test
    void shouldCalculatedSaldo() {
        Bank bank = new Bank();
        CashMachine one = new CashMachine();
        CashMachine two = new CashMachine();
        CashMachine three = new CashMachine();

        bank.addAtm(one);
        bank.addAtm(two);
        bank.addAtm(three);

        one.addTransactions(50);
        one.addTransactions(-100);
        two.addTransactions(100);
        three.addTransactions(300);


        assertEquals(450, bank.allAtmSaldo(), 00.1);
    }

    @Test
    void shouldCalculateAverageCashOut() {
        CashMachine averageOut = new CashMachine();
        CashMachine one = new CashMachine();
        CashMachine two = new CashMachine();
        CashMachine three = new CashMachine();

        Bank bank = new Bank();

        bank.addAtm(averageOut);
        bank.addAtm(one);
        bank.addAtm(two);
        bank.addAtm(three);

        averageOut.addTransactions(100);
        averageOut.addTransactions(150);
        averageOut.addTransactions(-200);

        one.addTransactions(300);
        one.addTransactions(250);
        one.addTransactions(-150);

        two.addTransactions(150);
        two.addTransactions(-200);
        two.addTransactions(300);

        three.addTransactions(200);
        three.addTransactions(250);
        three.addTransactions(300);

        assertEquals(183.33, bank.averageCashOut(), 0.01);

    }

    @Test
    void shouldCountAverageCashIn() {
        CashMachine atmNrOne = new CashMachine();
        CashMachine atmNrTwo = new CashMachine();
        CashMachine atmNrThree = new CashMachine();

        Bank bank = new Bank();

        bank.addAtm(atmNrOne);
        bank.addAtm(atmNrTwo);
        bank.addAtm(atmNrThree);

        atmNrOne.addTransactions(120);
        atmNrOne.addTransactions(140);
        atmNrOne.addTransactions(230);

        atmNrTwo.addTransactions(230);
        atmNrTwo.addTransactions(-160);
        atmNrTwo.addTransactions(220);

        atmNrThree.addTransactions(180);
        atmNrThree.addTransactions(-120);
        atmNrThree.addTransactions(240);

        assertEquals(194.28, bank.averageCashInNew(), 0.01);
    }

    @Test
    public void shouldAddAtm() {
        Bank addAtms = new Bank();
        CashMachine machineOne = new CashMachine();
        addAtms.addAtm(machineOne);
        assertEquals(1, addAtms.getNumberOfMachines());

    }

    @Test
    void shouldCountTransactionIn() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransactions(100);
        cashMachine.addTransactions(120);
        cashMachine.addTransactions(200);
        cashMachine.addTransactions(300);
        assertEquals(4,cashMachine.transactionCount());
    }

    @Test
    void shouldCountTransactionOut() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransactions(-300);
        cashMachine.addTransactions(-450);
        cashMachine.addTransactions(100);
        cashMachine.addTransactions(300);
        cashMachine.addTransactions(-250);
        assertEquals(3,cashMachine.transactionCountMinus());
    }
}
