package com.poof;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class ZadanieTree {

    public static final String YES = "Y";
    public static final String NO = "N";
    public static final String FILE = "zadanie3.txt";
    public static final String RESULT_FILE = "result.txt";
    public static Vector<String[]> flights = new Vector<>();
    public static String answer;
    public static final Scanner userAnswers = new Scanner(System.in);

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new FileInputStream(FILE));
             PrintStream ps = new PrintStream(new FileOutputStream(RESULT_FILE))) {
            while (sc.hasNextLine()){
                flights.add(sc.nextLine().split(" "));
            }
            flights.sort(new Comparator<String[]>() {
                @Override
                public int compare(String[] o1, String[] o2) {
                    return o1[0].compareTo(o2[0]);
                }
            });
            for (int i = 0; i < flights.size(); i++){
                ps.println(masToString(flights.get(i)));
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        for (int i = 0; i < flights.size(); i++){
            System.out.println(Arrays.toString(flights.get(i)));
        }
        System.out.print("Искать рейсы (Y/N)? : ");
        answer = userAnswers.next();
        if (answer.toUpperCase().equals(YES)){
            System.out.print("Введите необходимый пункт назначения : ");
            answer = userAnswers.next();
            System.out.print("Найденые рейсы:\n" + searchFlight(answer));
        }else {
            System.out.println("Досвидания!");
        }
    }

    static String masToString(String [] mas){
        String resultString = "";
        for (int i = 0; i < mas.length; i++){
            resultString += mas[i] +((i == mas.length - 1) ? "":" ");
        }
        return resultString;
    }

    static String searchFlight(String location){
        String flight = "";
        for (int i = 0; i < flights.size(); i++){
            if (masToString(flights.get(i)).toUpperCase().contains(location.toUpperCase()))
                flight += masToString(flights.get(i)) + "\n";
        }
        return flight;
    }

}
