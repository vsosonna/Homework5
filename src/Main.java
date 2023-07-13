public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        int clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию для iOS");
        } else {
            System.out.println("Установите версию для андроид");
        }
    }

    public static void task2() {
        int clientOS = 0;
        int clientDeviceYear = 2020;

        if (clientOS == 0) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите версию для iOS облегченную");
            } else {
                System.out.println("Установите версию для iOS");
            }
        } else if (clientOS == 1)
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите версию для Android облегченную");
            } else {
                System.out.println("Установите версию для Android");
            }
    }

    public static void task3() {

        int year = 2021;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("год " + year + " являетса высокосным");
        } else {
            System.out.println("год " + year + " не являетса высокосным");
        }
    }

    public static void task4() {
        int deliveryDistance = 95;
        int km = 20;
        int km2 = 60;
        int km3 = 100;

        if (deliveryDistance <= km) {
            System.out.println("Доставка 1 день");
        } else if (deliveryDistance <= km2) {
            System.out.println("Доставка 2 день");
        } else  if( deliveryDistance <= km3) {
            System.out.println("Доставка 3 день");
        } else {
            System.out.println("Доставка 0 день");
        }
        return;


    }


    public static void task5() {
        int montNumber = 5;

        switch (montNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("неверный номер");
        }
    }
}
