public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        short clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию для IOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задача 1 Вариант 2");
        char clientOS2 = 'i';
        switch (clientOS2) {
            case 'i':
                System.out.println("Установите версию приложения для IOS по ссылке");
                break;
            case 'a':
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
        System.out.println("Задача 2");
        int clientDeviceYear = 2014;
        short OS = 1;
        //0-android, 1-ios
        if (clientDeviceYear >= 2015 && OS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        } else if (clientDeviceYear < 2015 && OS == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && OS == 1) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientDeviceYear < 2015 && OS == 1) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке ");
        }

        System.out.println("Задача 3");
        int year = 2024;
        if (year%400 == 0 || year%4 == 0 && year%100 !=0 && year > 1584) {
            System.out.println("Год високосный");
        }
        else {
            System.out.println("Год не високосный");
        }

        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка займет сутки");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Доставка займет двое суток");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Доставка займет трое суток");
        } else if (deliveryDistance >= 100) {
            System.out.println("Доставка не осуществляется");
        }
        System.out.println("Задача 4 Вариант 2");
        int deliveryDistance1 = 100;
        boolean a = deliveryDistance1 < 20;
        boolean b = (deliveryDistance1 >= 20 && deliveryDistance1 < 60);
        boolean c = (deliveryDistance1 >= 60 && deliveryDistance1 < 100);
        boolean d = deliveryDistance1 >= 100;
        if (a) {
            System.out.println("Потребуется один день для доставки");
        }
        if (b) {
            System.out.println("Потребуется двое суток для доставки");
        }
        if (c) {
            System.out.println("Потребуется трое суток для доставки");
        }
        if (d) {
            System.out.println("Доставка не производится, слишком далеко");
        }

        System.out.println("Задача 5");
        int numberOfMonth = 13;
        boolean winter = numberOfMonth == 1 || numberOfMonth == 2 || numberOfMonth == 12;
        boolean spring = numberOfMonth == 3 || numberOfMonth == 4 || numberOfMonth == 5;
        boolean summer = numberOfMonth == 6 || numberOfMonth == 7 || numberOfMonth == 8;
        boolean autumn = numberOfMonth == 9 || numberOfMonth == 10 || numberOfMonth == 11;
        if(winter) {
            System.out.println("Сейчас зима");
        }
        if(spring) {
            System.out.println("Сейчас весна");
        }
        if(summer) {
            System.out.println("Сейчас лето");
        }
        if(autumn) {
            System.out.println("Сейчас осень");
        }
        else {
            System.out.println("Такого месяца нет :P");

            System.out.println("Задача 5 Вариант 2");
            int numberOfMonth1 = 4;
            switch (numberOfMonth1) {
                case 1,2,12:
                    System.out.println("Сейчас зима");
                    break;
                case 3,4,5:
                    System.out.println("Сейчас весна");
                    break;
                case 6,7,8:
                    System.out.println("Сейчас лето");
                    break;
                case 9,10,11:
                    System.out.println("Сейчас зима");
                    break;
                default:
                    System.out.println("Такого месяца нет, не ври :|");
            }
        }
    }
}



