package org.example;

public class Bank {

    public double balance = 1000;
    public double getBalance(){
        return balance;
    }
    public double deposit(double payment) {
        return balance = balance + payment;
    }
    public double payoff(double paycheck) {
        if (balance > paycheck){
            System.out.println("Hola Hola Karolu! Nie tym razem!");
        }
        else {
            balance = balance - paycheck;
            System.out.println("Balance: " + balance);
        }
        return balance;
    }
}
