package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.deposit(500);
        System.out.println("Witaj w banku!");
        System.out.println("Jak masz na imie?");
        Scanner scanneruser = new Scanner(System.in);
        String user = scanneruser.nextLine();
        System.out.println("Witaj!" + user);
        System.out.println("Ile chcesz wyplacic?");
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        bank.deposit(1000);
        bank.payoff(500);
        System.out.println("Balance: " + bank.getBalance());
    }
}