package com.poof;

import java.util.Scanner;

public class ZadanieOne {
    public static final int BORDER = 13;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Введите значение N > " + BORDER +" : ");
            n = sc.nextInt();
        }while(n <= BORDER);
        for (int i = 0; i < n; i++){
            if (primeNumber(i) && primeNumber(i + 2))
                System.out.println("Близнецы : " + i + " и " + (i + 2) + ";");
        }
    }

    static boolean primeNumber(int number){
        for (int i = 2; i < number; i++){
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
