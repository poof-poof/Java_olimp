package com.poof;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class ZadanieFour {

    public static final int COUNT_PLACES = 6;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int groups;
        int countRows = 0;
        Vector<Integer> countPeople = new Vector<>();
        do {
            System.out.print("Введите количество групп (1 <= n <= 100) : ");
            groups = sc.nextInt();
        }while (groups < 1 || groups > 100);
        System.out.println("Введите количество сотрудников для каждой из групп (1 <= a <= 6) :");
        for (int i = 0; i < groups; i++){
            countPeople.add(sc.nextInt());
        }
        countPeople.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        do {

        }while (!countPeople.isEmpty());
        System.out.println("Минимальное число рядов из 6-ти кресел : " + countRows);
    }

}
