package com.wangxiao;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Principal
        System.out.print("Principal: ");
        float principal = scanner.nextFloat();
        // Annual Interest Rate
        System.out.print("Annual Interest Rate(%): ");
        float annualRate = scanner.nextFloat();
        float monthlyRate = annualRate / 100 / 12;
        // Period(Years)
        System.out.print("Period(Years): ");
        byte years = scanner.nextByte();
        int months = years * 12;

        double periodRate = Math.pow(1 + monthlyRate, months);

        double mortgages = principal * monthlyRate * periodRate / (periodRate - 1);

        String mortgagesFormatted = NumberFormat.getCurrencyInstance().format(mortgages);
        System.out.print("Mortgages: " + mortgagesFormatted);
    }
}
