package com.kodilla.bank.homework;

public class CashMachine {
    private int[] operations;
    private int size;

    public  CashMachine() {
        this.size = 0;
        this.operations = new int[0];
    }



    public void addTransactions(int transaction) {//zrealizowane transakcje
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(operations, 0, newTab, 0, operations.length);
        newTab[this.size - 1] = transaction;
        this.operations = newTab;
    }

    public int calculateSaldo() {//metoda która liczy saldo
        int saldo = 0;
        for (int operation : operations) {
            saldo += operation;
        }
        return saldo;
    }

    public int calculateSaldoMinus() {//metoda która liczy saldo po wypłacie
        int saldoMinus = 0;
        for (int operation : operations) {
            if (operation < 0) {
                saldoMinus += operation;
            }
        }
        return saldoMinus * -1;
    }

    public int calculateSaldoPlus() {
        int saldoPlus = 0;
        for (int operation : operations) {
            if (operation > 0) {
                saldoPlus += operation;
            }

        }
        return saldoPlus;
    }

    public int transactionCount() {//metoda zwracająca liczbę transakcji
        int countTransaction = 0;
        for (int transaction1 : operations) {
            if (transaction1 > 0) {
                countTransaction++;
            }
        }
        return countTransaction;
    }



    public int transactionCountMinus() {//metoda zwracająca liczbę transakcji
        int countTransactionMinus = 0;
        for (int transaction1 : operations) {
            if (transaction1 < 0) {
                countTransactionMinus++;
            }
        }
        return countTransactionMinus;
    }

    public int getAverage(){
        int sum = 0;
        for ( int i = 0 ; i < this.operations.length; i++){
            sum+= this.operations[i];
        }
        return sum/this.operations.length;
    }

}














