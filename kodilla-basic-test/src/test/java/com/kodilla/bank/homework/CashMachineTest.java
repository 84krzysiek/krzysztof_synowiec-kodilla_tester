package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTest {

    @Test
    public void addTransactionTest() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransactions(100);
        cashMachine.addTransactions(200);
        cashMachine.addTransactions(-70);
        assertEquals(230, cashMachine.calculateSaldo());
    }
       }







