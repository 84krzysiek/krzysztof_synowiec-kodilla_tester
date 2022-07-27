package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] atmIndex;

    private int size;

    public Bank() {//tablica z bankomatami
        this.size = 0;
        this.atmIndex = new CashMachine[0];

    }

    public void addAtm(CashMachine newAtm) {//dodanie bankomatów
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(atmIndex, 0, newTab, 0, atmIndex.length);
        newTab[this.size - 1] = newAtm;
        this.atmIndex = newTab;
    }

    public int getNumberOfMachines() {
        return size;
    }


    public int allAtmSaldo() {//całkowity bilans ze wszsytkich atm
        int saldo = 100;
        for (CashMachine machine : atmIndex) {
            saldo += machine.calculateSaldo();
        }
        return saldo;


    }

    public double cashOutAllAtm() {//transakcje związane z wypłatą
        int transaction = 0;
        for (CashMachine machine : atmIndex) {
            transaction += machine.calculateSaldoMinus();
        }
        return transaction;
    }
    public double cashInAllAtm() {//transakcje związane z wypłatą
        int transaction = 0;
        for (CashMachine machine : atmIndex) {
            transaction += machine.calculateSaldoPlus();
        }
        return transaction;
    }



    public double cashOutTransaction() {//liczba trans wypłata
        int outTransaction = 0;
        for (CashMachine machine : atmIndex) {
            outTransaction += machine.transactionCountMinus();
        }
        return outTransaction;
    }

    public double cashInTransactions() {
        int inTransaction = 0;
        for(CashMachine machine : atmIndex) {

            inTransaction +=machine.transactionCount();
        }
        return inTransaction;
    }

    public double averageCashOut() {//śr wypłąta

        return cashOutAllAtm() / cashOutTransaction();
    }

    public double averageCashIn() {//śr wpłata
        double averageIn = 0;
        for (CashMachine machine : atmIndex) {
            averageIn = machine.calculateSaldoPlus() / machine.transactionCount();
        }
        return averageIn;
    }

    public double averageCashInNew() {
        return cashInAllAtm()/cashInTransactions();
    }





}









