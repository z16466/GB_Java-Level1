package Lesson1;

public class HomeWork1 {

    //1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args) {

        //Вывод 1-го задания
        System.out.println("1. Hello, World!");

        //Вывод 2-го задания
        makeVar();

        //Вывод 3-го задания
        byte a1 = 2;
        short b1 = 1;
        int c1 = 15;
        long d1 = 5L;
        System.out.println("3. " + calcFormula(a1, b1, c1, d1));

        //Вывод 4-го задания
        System.out.println("4. " + choice(a1, c1));

        //Вывод 5-го задания
        detectNumber(5);
        detectNumber(-5);

        //Вывод 6-го задания
        System.out.println("6. " + negativeNumber(c1));
        c1=-15;
        System.out.println("6. " + negativeNumber(c1));

        //Вывод 7-го задания
        System.out.print("7. ");
        String name="Владимир";
        greetingName(name);

        //Вывод 8-го задания
        int yearL=2020;
        int yearNL=2019;
        System.out.print("8. ");
        checkLeapYear(yearNL);
        checkLeapYear(yearL);
    }

    //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
    public static void makeVar() {
        byte a = 126;
        System.out.println("2. " + a);
        short b = 4567;
        System.out.println(b);
        int c = 65535;
        System.out.println(c);
        long d = 1_000_000L;
        System.out.println(d);
        float e = 284.4f;
        System.out.println(e);
        double f = 34.15;
        System.out.println(f);
        char g = 'J';
        char h = '@';
        System.out.println(g);
        System.out.println(h);
        boolean i = true;
        boolean j = false;
        System.out.println("i=" + i + "  j=" + j);
        System.out.println("i|j=" + (i | j));
        System.out.println("i&j=" + (i & j));
        String k="String Variable";
        System.out.println(k);
    }

    /*3. Написать метод вычисляющий выражение a * (b + (c / d))
    и возвращающий результат,где a, b, c, d – входные параметры этого метода;*/
    public static double calcFormula(double a, double b, double c, double d) {
        return a * (b + c / d);
    }

    /*4. Написать метод, принимающий на вход два числа,
    и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    если да – вернуть true, в противном случае – false;*/
    public static boolean choice (double a, double b) {
        return a + b >= 10 && a + b <= 20;
    }

    /*5. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль положительное ли число передали, или отрицательное;
    Замечание: ноль считаем положительным числом.*/
    public static void detectNumber (int num) {
        String str = "Число положительное.";
        if (num < 0 ) str = "Число отрицательное.";
        System.out.println("5. " + str);
    }

    /*6. Написать метод, которому в качестве параметра передается целое число,
    метод должен вернуть true, если число отрицательное;.*/
    public static boolean negativeNumber (int num) {
        return num < 0;
    }

    /*7. Написать метод, которому в качестве параметра передается строка,
    обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;*/
    public static void greetingName(String name) {
        System.out.println("Привет, " + name + "!");
    }

    /*8. * Написать метод, который определяет является ли год високосным,
    и выводит сообщение в консоль. Каждый 4-й год является високосным,
    кроме каждого 100-го, при этом каждый 400-й – високосный.*/
    public static void checkLeapYear(int year) {
        if (((year % 4) == 0) && !((year % 100) == 0)) {
            System.out.println(year + " год - високосный!");
        } else if ((year % 400) == 0) {
            System.out.println(year + " год - високосный!");
        }
    }
}