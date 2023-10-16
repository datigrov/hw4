public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Задача № 1//
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age
                    + " то он не достиг совершеннолетия, нужно немного подождать");
        }


        // Задача № 2//
        int temperature = 6;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }


        // Задача № 3 //
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то прийдется заплатить штраф");
        } else if (speed < 60) {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }


        // Задача № 4 //
        int peopleAge = 5;
        if (peopleAge > 2 && peopleAge < 6) {
            System.out.println("Если возраст человека равен " + peopleAge +
                    " то ему нужно ходить в детский сад");
        } else if  (peopleAge >= 7 && peopleAge <= 17) {
            System.out.println("Если возраст человека равен " + peopleAge + " то ему нужно ходить в школу");
        } else if (peopleAge >= 18 && peopleAge <= 24) {
            System.out.println("Если возраст человека равен " + peopleAge + " то его место в университете");
        } else if (peopleAge > 24) {
            System.out.println("Если возраст человека равен " + peopleAge + " то ему пора ходить на работу");
        }


        // Задача № 5 //
        int babyAge = 4;
        if (babyAge < 5) {
            System.out.println("Если возраст ребенка равен " + babyAge
                    + " то он не может кататься на атракционе");
        } else if (babyAge > 5 && babyAge < 14) {
            System.out.println("Если возраст ребенка равен " + babyAge
                    + " лет, то он может кататься только в сопровождении взрослого."
                    + " Если взрослого нет, то кататься нельзя.");
        } else if (babyAge > 14) {
            System.out.println("Если возраст ребенка равен " + babyAge
                    + " лет, то он может кататься без сопровождения взрослого");
        }


        // Задача № 6 //
        int passengers = 53;
        int standingPlaceInTheCarriage = 102 - passengers;
        int sitPlaceInTheCarriage = 60 - passengers;
        if (sitPlaceInTheCarriage > 0) {
            System.out.println("Сидячих мест в вагоне " + sitPlaceInTheCarriage);
        } else if (standingPlaceInTheCarriage > 0) {
            System.out.println("Стоячих мест в вагоне " + standingPlaceInTheCarriage);
        } else {
            System.out.println("Вагон заполнен, свободных мест нет");
        }


        // Задача № 7
        int one = 5;
        int two = 6;
        int three = 7;
        if (three > one && three >two) {
            System.out.println("Число " + three + " больше числа " + two + " и " + one);
        } else if (two > one) {
            System.out.println("Число " + two + " больше числа " + one);
        } else {
            System.out.println("Число " + one +" наименьшее");
        }

// Домашняя работа по уроку 2 "Условный оператор" //

        // Задача № 1 //
        int clientIOS = 1;
        int clientAndroid = 0;
        if (clientIOS == 0) {
            System.out.println("Скачайте приложение для iOS");
        } else if (clientIOS == 1) {
            System.out.println("Скачайте приложение для android");
        }

        // Задача № 2 //
        int clientDeviceYear = 2017;
        int iOS = 0;
        if (iOS == 0) {
            if (clientAndroid >= 2015) {
                System.out.println("Скачайте приложение для ios");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (iOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Операционная система не поддерживается");
            }
        }

        // Задача № 3 //
        int leapYear = 2015;
        if ((leapYear % 4 == 0 && 100 != 0 || leapYear % 400 == 0) && leapYear > 1584) {
            System.out.println(leapYear + " год является високосным");
         } else {
            System.out.println(leapYear + " год не является високосным");
        }

        // Задача № 4 //
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется один день");
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется два дня");
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется три дня");
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }

        // Задача № 5//
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 3:
                System.out.println("Зимний месяц");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Весенний месяц");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Летний месяц");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }

    }
}