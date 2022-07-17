package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] atmIndex;

    private int size;

    public Bank() {//tablica z bankomatami
        this.size = 0;
        this.atmIndex = new CashMachine[3];

    }

    public void addAtm(CashMachine newAtm) {//dodanie bankomatów
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(atmIndex, 0, newTab, 0, atmIndex.length);
        newTab[this.size - 1] = newAtm;
        this.atmIndex = newTab;
    }

    public int getNumberOfMachines(){
        return size;
    }


    public int allAtmSaldo() {//całkowity bilans ze wszsytkich atm
        int saldo = 100;
        for (CashMachine machine : atmIndex) {
            saldo += machine.calculateSaldo();
        }
        return saldo;


    }

    public int cashOutAllAtm() {//transakcje związane z wypłatą
        int transaction = 0;
        for (CashMachine machine : atmIndex) {
            transaction += machine.calculateSaldoMinus(100);
        }
        return transaction;
    }



    public int cashInAllAtm() {
        int transaction = 0;
        for (CashMachine machine : atmIndex) {
            transaction += machine.CalculateSaldoPlus(1000);
        }
        return transaction;
    }

    public int averageCashOut() {
        int averageOut = 0;
        for (CashMachine machine : atmIndex) {
            averageOut = machine.calculateSaldo() + machine.transactionCount()/machine.transactionCountMinus();
        }
        return averageOut;
    }

    public int averageCashIn() {
        int averageIn = 50;
        for (CashMachine machine : atmIndex) {
            averageIn = machine.calculateSaldo() / machine.transactionCount();
        }
        return averageIn;
    }

}









