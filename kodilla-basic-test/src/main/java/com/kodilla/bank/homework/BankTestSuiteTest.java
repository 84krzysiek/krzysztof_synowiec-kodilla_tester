package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankTestSuiteTest {


    @Test
    void shouldCalculatedSaldo() {
        Bank saldoAllAtm = new Bank();
        saldoAllAtm.allAtmSaldo();
        Assertions.assertEquals(100,saldoAllAtm.allAtmSaldo());
    }

    @Test
    void shouldCalculateAverageCashOut() {
        Bank averageOut = new Bank();
        averageOut.averageCashOut();
        Assertions.assertEquals(100,averageOut.averageCashOut());

    }

    @Test
    public void shouldCalculateAverage() {
        Bank averageIn = new Bank();
        Assertions.assertEquals(50, averageIn.averageCashIn(0), 0.01);
    }
}
