package com.poof;

import java.util.Scanner;

public class ZadanieTwo {

    public static final String YES = "Y";
    public static final String NO = "N";
    public static final String ERROR_INPUT_MSG = "Ошибка!!! Некорректный ввод!!! Повторите ввод!!!";
    public static final String MSG = "Выбирите тип фигуры:\n1 - квадрат;\n2 - треугольник 1;\n" +
            "3 - треугольник 2;\n4 - треугольник 3;\n5 - треугольник 4.";
    public static final int SQUARE = 1;
    public static final int TRIANGLE_ONE = 2;
    public static final int TRIANGLE_TWO = 3;
    public static final int TRIANGLE_TREE = 4;
    public static final int TRIANGLE_FOUR = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String symbol;
        int size;
        int type;
        do {
            System.out.println(MSG);
            System.out.print("Выбор : ");
            type = sc.nextInt();
            System.out.print("Введите сивол для отрисовки фигуры : ");
            symbol = sc.next();
            System.out.print("Введите размер фигуры : ");
            size = sc.nextInt();
            switch (type){
                case SQUARE:{
                    for (int i = 0; i < size; i++){
                        for (int j = 0; j < size; j++){
                            System.out.print(symbol);
                        }
                        System.out.println();
                    }
                }break;
                case TRIANGLE_ONE:{
                    for (int i = 0; i < size; i++){
                        for (int j = 0; j < size; j++){
                            if (i == j || i > j)
                            System.out.print(symbol);
                        }
                        System.out.println();
                    }
                }break;
                case TRIANGLE_TWO:{
                    for (int i = 0; i < size; i++){
                        for (int j = 0; j < size; j++){
                            if (i == j || i < j)
                            System.out.print(symbol);
                        }
                        System.out.println();
                    }
                }break;
                case TRIANGLE_TREE:{
                    for (int i = 0; i < size; i++){
                        for (int j = 0; j < size; j++){
                            if (i == j || j > i) {
                                System.out.print(symbol);
                            }else System.out.print(" ");
                        }
                        System.out.println();
                    }
                }break;
                case TRIANGLE_FOUR:{
                    for (int i = 0; i < size; i++){
                        for (int j = 0; j < size; j++){
                            if (i + j == size - 1 || i + j > size - 1) {
                                System.out.print(symbol);
                            }else System.out.print(" ");
                        }
                        System.out.println();
                    }
                }break;
                default:{
                    System.out.println(ERROR_INPUT_MSG);
                    continue;
                }
            }
            System.out.print("Продолжить (Y/N)? : ");
            symbol = sc.next();
            if (symbol.toUpperCase().equals(YES)){
                continue;
            }else if (symbol.toUpperCase().equals(NO)){
                break;
            }else continue;
        }while (true);
    }

}
