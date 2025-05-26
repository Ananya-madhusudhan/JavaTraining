package com.atria.day9.Interface.Bank;

public class BankApplication {

    public static void main(String[] args) {
        Bank bank = new BankImp1();
        Account acc = new Account(111, "Apoorva", 20000, bank);
        
        acc.deposit(2000);
        System.out.println(acc);

        acc.withdraw(1899);
        System.out.println(acc);
    }
}
