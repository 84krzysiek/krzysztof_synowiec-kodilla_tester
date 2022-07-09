package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankTestSuiteTest {


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
        assertEquals(50, averageIn.averageCashIn(0), 0.01);
    }
}
