package org.ex13;

import java.util.Scanner;

public class compoundinterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("What is the principal amount? ");
        float p = scanner.nextFloat();
        System.out.print("What is the rate?(Enter as percentage) ");
        float r = scanner.nextFloat();
        System.out.print("What is the number of years? ");
        int years = scanner.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        int comp_time = scanner.nextInt();

        double rate = r/100;
        double amount = p * Math.pow(1 + (rate/comp_time), (years * comp_time));
        double roundOff = (double) Math.round(amount * 100) / 100;

        System.out.println("$" + p + " invested at " + r + "% for " + years + " years compounded " + comp_time + " times per year is $" + roundOff);
    }
}
