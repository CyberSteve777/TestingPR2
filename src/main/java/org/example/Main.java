package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вы запустили конвертер длин. Он умеет переводить метры, сантиметры и километры " +
                "друг в друга. Можно вводить вещественные числа.");
        System.out.println("Пожалуйста, напишите, сколько конвертаций необходимо будет сделать: ");
        int op = in.nextInt();
        System.out.println("Сейчас Вам потребуется каждый раз вводить тип конвертации в виде натурального числа от 1 до 6.");
        System.out.println("1 - сантиметры в метры.");
        System.out.println("2 - метры в сантиметры.");
        System.out.println("3 - метры в километры.");
        System.out.println("4 - километры в метры.");
        System.out.println("5 - километры в сантиметры.");
        System.out.println("6 - сантиметры в километры.");
        for (int i = 0; i < op; i++) {
            System.out.println("Пожалуйста, введите тип конвертации: ");
            int t = in.nextInt();
            switch (t) {
                case 1:
                    System.out.println("Введите количество сантиметров для конвертации: ");
                    System.out.println("Это соответствует следующему числу метров: " +
                            LengthConverter.centimetresToMetres(in.nextDouble()));
                    break;
                case 2:
                    System.out.println("Введите количество метров для конвертации: ");
                    System.out.println("Это соответствует следующему числу сантиметров: " +
                            LengthConverter.metresToCentimetres(in.nextDouble()));
                    break;
                case 3:
                    System.out.println("Введите количество метров для конвертации: ");
                    System.out.println("Это соответствует следующему числу километров: " +
                            LengthConverter.metresToKilometres(in.nextDouble()));
                    break;
                case 4:
                    System.out.println("Введите количество километров для конвертации: ");
                    System.out.println("Это соответствует следующему числу метров: " +
                            LengthConverter.kilometresToMetres(in.nextDouble()));
                    break;
                case 5:
                    System.out.println("Введите количество километров для конвертации: ");
                    System.out.println("Это соответствует следующему числу сантиметров: " +
                            LengthConverter.kilometresToCentimetres(in.nextDouble()));
                    break;
                case 6:
                    System.out.println("Введите количество сантиметров для конвертации: ");
                    System.out.println("Это соответствует следующему числу километров: " +
                            LengthConverter.centimetresToKilometres(in.nextDouble()));
                    break;
                default:
                    System.out.println("Введен неправильный тип, пропускаю...");
                    break;
            }
        }
    }
}