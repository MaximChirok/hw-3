package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        System.out.println("Zadanie 1");
        System.out.println("");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Ustanovite versiyu dlya Android");
        }
        if (clientOS == 0) {
            System.out.println("Ustanovite versiyu dlya iOS");
        }
        System.out.println("");


        // Задание 2
        System.out.println("Zadanie 2");
        System.out.println("");

        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Ustanovite versiyu dlya Android");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Ustanovite oblegchennuyu versiyu dlya Android");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Ustanovite versiyu dlya iOS");
        }
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Ustanovite oblegchennuyu versiyu dlya iOS");
        }
        System.out.println("");

        // Задание 3
        System.out.println("Zadanie 3");
        System.out.println("");
        int year = 1205;
        if (year % 4 ==0) {
            System.out.println("Eto visokosnyi god");
        } else {
            System.out.println("Eto nevisokosnyi god");
        }
        System.out.println("");

        // Задание 4
        System.out.println("Zadanie 4");
        System.out.println("");
        int deliveryDistance = 55;
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Dostavka zaimet " + deliveryDays + " den");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Dostavka zaimet " + (deliveryDays + 1) + " dnya");
        } else if (deliveryDistance > 60 && deliveryDistance <=100) {
            System.out.println("Dostavka zaimet " + (deliveryDays + 2) + " dnya");
        } else {
            System.out.println("V vash raion dostavka ne osushestvlyaetsya");
        }
        System.out.println("");

        // Задание 5
        System.out.println("Zadanie 5");
        System.out.println("");
        int monthNumber = 123;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Seichas zima");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Seichas vesna");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Seichas leto");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Seichas osen");
                break;
            default:
                System.out.println("Ne igrai so mnoi");
        }


    }
}