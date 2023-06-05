package org.example;

public class Bank {

    public double balance = 0;
    public double deposit(double payment) {
        return balance = balance + payment;
    }
    public double payoff(double paycheck){
        return balance = balance - paycheck;
    }
}
