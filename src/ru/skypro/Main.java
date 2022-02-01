package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Task1

        int clientOS = 0;
        if (clientOS==0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS==1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Task2;

        int clientDeviceYear = 2015;
        if (clientOS==0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS==0 && clientDeviceYear >=2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if(clientOS==1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if(clientOS==1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Task3

        int year = 2021;
        int a = year % 4;
        int b = year % 400;
        int c = year % 100;

        if (c != 0 && a == 0 || c !=0 && b == 0) {
            System.out.println(year + " год является високосным.");
        }
        else  {
            System.out.println(year + " год не является високосным.");
        }

        //Task4

        int deliveryDistance= 95;
        if (deliveryDistance <  20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (20 <= deliveryDistance && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (60 <= deliveryDistance && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);
        }

        // Task5

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сезон - Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон - Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон - Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон - Осень");
                break;

        }

    }
}
