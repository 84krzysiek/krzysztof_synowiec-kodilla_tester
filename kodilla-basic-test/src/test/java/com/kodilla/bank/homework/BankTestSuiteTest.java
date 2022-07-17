package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankTestSuiteTest {

    @Test
    void shouldCalculateAverageTransactionOut() {
        Bank bank = new Bank();
        CashMachine one = new CashMachine();
        CashMachine two = new CashMachine();
        CashMachine three = new CashMachine();

        one.calculateSaldoMinus(300);
        one.calculateSaldoMinus(-300);
        two.calculateSaldoMinus(500);
        two.calculateSaldoMinus(-500);
        three.calculateSaldoMinus(150);

        assertEquals(-300,bank.averageCashOut(),00.1);

    }


    @Test
    void shouldCalculatedSaldo() {
        Bank saldoAllAtm = new Bank();
        saldoAllAtm.allAtmSaldo();
        assertEquals(100,saldoAllAtm.allAtmSaldo());
    }

    @Test
    void shouldCalculateAverageCashOut() {
        Bank averageOut = new Bank();
        averageOut.averageCashOut();
        assertEquals(100,averageOut.averageCashOut());

    }

    @Test
    public void shouldCalculateAverage() {
        Bank averageIn = new Bank();
        assertEquals(100, averageIn.averageCashIn(), 0.01);
    }

    @Test
    public void shouldAddAtm() {
        Bank addAtms = new Bank();
        CashMachine machineOne = new CashMachine();
        addAtms.addAtm(machineOne);
        addAtms.getNumberOfMachines();
        assertEquals(1,addAtms.getNumberOfMachines());

    }
}
