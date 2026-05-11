package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(" домашнее задание №3 ");


        System.out.println(" Задача № 1  ");
        byte a = 7;
        short b = 10525;
        int c = 2500780;
        long d = 4631758L;
        float f = -5.2489f;
        double x = 7.9613549146;
        System.out.println("byte = " + a);
        System.out.println("short = " + b);
        System.out.println("int = " + c);
        System.out.println("float =  " + f);
        System.out.println("double =  " + x);


        System.out.println(" адача №2 ");
        float g = 27.12f;
        long r = 987678965549L;
        float h = 2.786f;
        short s = 569;
        short q = -159;
        short w = 27897;
        byte m = 67;
        System.out.println("float = " + g);
        System.out.println("long = " + r);
        System.out.println("float = " + h);
        System.out.println("short = " + s);
        System.out.println("short = " + q);
        System.out.println("short = " + w);
        System.out.println("byte = " + m);


        System.out.println(" Задача №3");
        int teacher1 = 23;
        int teacher2 = 27;
        int teacher3 = 30;
        int paper = 480;
        int student = 0;
        student = paper / (teacher1 + teacher2 + teacher3);
        System.out.println(" На каждого ученика расчитанно  " + student + "  листов  бумаги ");


        System.out.println("задача №4 ");
        int car = 16 / 2;
        int minute = car * 20;
        int day = car * 1440;
        int day3 = (car * day) * 3;
        int month = (car * day) * 30;
        System.out.println(" за 20 минут машина произвела " + minute + " шт бутылок");
        System.out.println("За сутки машина произвела " + day + " шт бутылок ");
        System.out.println("За 3 суток  машина произвела " + day3 + " шт бутылок");
        System.out.println("За месяц машина произвела " + month + " шт бутылок");


        System.out.println(" Задача № 5 ");
        int storage = 120;
        int brown = 4;
        int white = 2;
        int class1 = brown + white;
        int numberClasses = storage / class1;
        white = white * numberClasses;
        brown = brown * numberClasses;
        System.out.println("в школе где " + numberClasses + " классов,нужно " + white + " банок белой краски и " + brown + " банок коричневой краски .");


        System.out.println("Задача № 6 ");
        int banana = 80;
        int milk = 105;
        int IceCreamSndae = 100;
        int eggs = 70;
        banana = banana * 5;
        milk = milk * 2;
        IceCreamSndae = IceCreamSndae * 2;
        eggs = eggs * 4;
        float breakfastWeight = banana + milk + IceCreamSndae + eggs;
        float kg = breakfastWeight / 1000;
        System.out.println(("вес завтрака " + breakfastWeight) + " грам =  " + kg + " килограмм ");


        System.out.println("задача № 7 ");
        int loseWeight = 7;
        float method1 = 0.250f;
        float method2 = 0.500f;
        method1 = loseWeight / method1;
        method2 = loseWeight / method2;
        System.out.println(" 1 метод потребуется " + method1 + " дней. " + " на 2 метод потребуется " + method2 + "дней.");
        int average = (int) ((method1 + method2) / 2);
        System.out.println(" В среднем потребуется " + average + " дней .");


        System.out.println(" задача № 8");
        double Masha = 67760;
        double Denis = 83690;
        double Kristina = 76230;
        int yearm = (int) Masha * 12;
        int yeard = (int) Denis * 12;
        int yeark = (int) Kristina * 12;
        Masha = Masha * 0.1 + Masha;
        Denis = Denis * 0.1 + Denis;
        Kristina = Kristina * 0.1 + Kristina;
        int yearM = (int) Masha * 12;
        int yearD = (int) Denis * 12;
        int yearK = (int) Kristina * 12;
        int wageDifferenceM = yearM - yearm;
        int wageDifferenceD = yearD - yeard;
        int wageDifferenceK = yearK - yeark;
        System.out.println("Маша теперь получает " + Masha + " рублей " + "Годовой доход вырос " + wageDifferenceM);
        System.out.println("Денис теперь получает " + Denis + " рублей " + "Годовой доход вырос " + wageDifferenceD);
        System.out.println("Кристина теперь получает " + Kristina + " рублей " + "Годовой доход вырос. " + wageDifferenceK);

        System.out.println("Подскажите где не правильно написан код*??????");
    }
}
