public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte a = 20;
        System.out.println("Значение переменной а с типом byte равно " + a);
        short b = 20000;
        System.out.println("Значение переменной b с типом short равно " + b);
        int c = 300000;
        System.out.println("Значение переменной c с типом int равно " + c);
        long d = 4444444;
        System.out.println("Значение переменной d с типом long равно " + d);
        float f = 1.5f;
        System.out.println("Значение переменной f с типом float равно " + f);
        double e = 2.5;
        System.out.println("Значение переменной e с типом double равно " + e);
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte a = 67;
        System.out.println("Значение переменной а с типом byte равно " + a);
        short b = 569;
        System.out.println("Значение переменной b с типом short равно " + b);
        int c = 27897;
        System.out.println("Значение переменной c с типом int равно " + c);
        long d = 987678965549L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float f = 2.789f;
        System.out.println("Значение переменной f с типом float равно " + f);
        double e = 27.12;
        System.out.println("Значение переменной e с типом double равно " + e);
        int g = -159;
        System.out.println("Значение переменной g с типом int равно " + g);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int class1 = 23;
        int class2 = 27;
        int class3 = 30;
        int paper = 480;
        int allClass = class1 + class2 + class3;
        int paperForStudent = paper / allClass;
        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int oneMinute = 16 / 2;
        int twentyMinutes = oneMinute * 20;
        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок");
        int oneDay = oneMinute * 60 * 24;
        System.out.println("За один день машина произвела " + oneDay + " штук бутылок");
        int threeDays = oneDay * 3;
        System.out.println("За три дня машина произвела " + threeDays + " штук бутылок");
        int month = oneDay * 30;
        System.out.println("За 30 дней машина произвела " + month + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int allCans = 120;
        int classes = allCans / (2 + 4);
        int whitePaint = classes * 2;
        int brounPaint = classes * 4;
        System.out.println("В школе, где " + classes + " классов, нужно " + whitePaint + " банок белой краски и " + brounPaint + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        int banana = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;
        int cocktail = banana * 5 + milk * 2 + iceCream * 2 + egg * 4;
        System.out.println(" Вес спортзавтрака составляет " + cocktail + " грамм");
        float cocktail1 = (cocktail / 1000.0f);
        System.out.println(" Вес спортзавтрака составляет " + cocktail1 + " кг");

    }

    public static void task7() {
        System.out.println("Задача 7");
        int min = 250;
        int max = 500;
        int weight = 7000;
        int minDays = weight / min;
        System.out.println("Чтобы похудеть на 7 кг при сбросе веса в день 250 грамм, нужно " + minDays + " дней");
        int maxDays = weight / max;
        System.out.println("Чтобы похудеть на 7 кг при сбросе веса в день 500 грамм, нужно " + maxDays + " дней");
        int meanDays = (maxDays + minDays) / 2;
        System.out.println("Чтобы похудеть на 7 кг при среднем сбросе веса , нужно " + meanDays + " день");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int masha = 67760;
        int masha2 = masha * 10 / 100 + masha;
        int mashaYear = (masha2 - masha) * 12;
        System.out.println("Маша теперь получает " + masha2 + " рублей. Годовой доход вырос на " + mashaYear + " рублей.");

        int denis = 83690;
        int denis2 = denis * 10 / 100 + denis;
        int denisYear = (denis2 - denis) * 12;
        System.out.println("Денис теперь получает " + denis2 + " рублей. Годовой доход вырос на " + denisYear + " рублей.");
        int kris = 76230;
        int kris2 = kris * 10 / 100 + kris;
        int krisYear = (kris2 - kris) * 12;
        System.out.println("Кристина теперь получает " + kris2 + " рублей. Годовой доход вырос на " + krisYear + " рублей.");
    }
}