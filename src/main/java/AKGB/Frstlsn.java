package AKGB;

public class Frstlsn<w> {
    public static void main(String[] args) {
        System.out.println("Привет");
        byte byte1 = (byte) 123; //-128...127
        short short1 = (short) 100;
        int integr1 = 230;
        long long1 = 1300;
        float a = 111.2f;
        float b = 113.2f;
        float c = 131.2f;
        float d = 611.2f;
        double double1 = 11.5;
        char char1 = 'a';
        char char2 = 'g';
        boolean boolean1 = true;
        boolean boolean2 = false;
        String string1 = "Постигнуть не постигнутое";


        System.out.println(byte1);
        System.out.println(short1);
        System.out.println(integr1);
        System.out.println(long1);
        System.out.println(a + b + c + d);
        System.out.println(double1);
        System.out.println(char1 + char2);
        System.out.println(boolean1);
        System.out.println(boolean2);
        System.out.println(string1);

        float r = equation(a, b, c, d);
        System.out.println(r);

        boolean boolean3 = beetwen(1, 7);
        System.out.println(boolean3);

        int x3 = -2;
        isPositiveOrNegative(x3);

        boolean boolean4 = isNegative(-3);
        System.out.println(boolean4);

        greetings("Андрей");

        int yearx = 2500;
        leapyear(yearx);


    }

    //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float
    public static float equation(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    //Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
//в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean beetwen(int x1, int x2) {

        int sum = x1 + x2;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }
//Написать метод, которому в качестве параметра передается целое число, метод должен
//напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль
//считаем положительным числом.

    public static void isPositiveOrNegative(int x3) {

        if (x3 < 0) {
            System.out.println("Число " + x3 + " отрицательное");
        } else {
            System.out.println("Число " + x3 + " положительное");
        }

    }

//Написать метод, которому в качестве параметра передается целое число. Метод должен
//вернуть true, если число отрицательное, и вернуть false если положительное.

    public static boolean isNegative(int x4) {
        if (x4 < 0) {
            return true;
        }
        return false;

    }

    //Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    //Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

    public static void greetings(String name) {
        System.out.println("Привет, " + name + "!");
    }

    //Написать метод, который определяет, является ли год високосным, и выводит сообщение в
    //консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –
    //високосный.

public static void leapyear(int year) {

    if ((year % 4 != 0) || (year % 400 != 0) && (year % 100 == 0)) {
        System.out.println(year + " год не високосный");
    } else {
        System.out.println(year + " год високосный");
    }

}

}


