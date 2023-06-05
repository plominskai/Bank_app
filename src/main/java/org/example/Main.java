package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        bank.deposit(money);
        System.out.println("After payment: " + bank.deposit(1000));
        bank.payoff(500);
        System.out.println("After paycheck: " + bank.payoff(100));
    }
}