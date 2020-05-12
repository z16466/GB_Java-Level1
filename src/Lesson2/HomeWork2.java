package Lesson2;

import java.util.Arrays;

public class HomeWork2 {

    public static void main(String[] args) {

        //Вывод 1го задания
        replaceArrayIndex();

        //Вывод 2го задания
        fillArray();

        //Вывод 3го задания
        changeArray();

        //Вывод 4го задания
        int squareSize = 9;
        fillSquareArray(squareSize);

        //Вывод 5го задания
        int[] array = {4, 7, 11, 0, -128, 127, 2147483647, 9, -5, -8};
        minMaxArrayIndex(array);

        //Вывод 6го задания
        int[] array1 = {4, 7, 11, 0, -128, 127, 2147483647, 9, -5, -8};
        System.out.println(checkBalance(array1));
        int[] array2 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(array2));
        int[] array3 = {1, 1, 1, 2, 1};
        System.out.println(checkBalance(array3));
        int[] array4 = {1, 1, 2};
        System.out.println(checkBalance(array4));
        int[] array5 = {3, 3};
        System.out.println(checkBalance(array5));
        int[] array6 = {7};
        System.out.println(checkBalance(array6));

        //Вывод 7го задания
        int[] array7 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int offset = 3;
        moveArrayIndex(array7, offset);
        offset = -3;
        moveArrayIndex(array7, offset);
        offset = 0;
        moveArrayIndex(array7, offset);
        offset = 9;
        moveArrayIndex(array7, offset);
        offset = 22;
        moveArrayIndex(array7, offset);
        offset = -22;
        moveArrayIndex(array7, offset);
    }

    /*1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
    public static void replaceArrayIndex() {
        System.out.println("Задание 1");
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходный массив:   " + Arrays.toString(array1));
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 1) array1[i] = 0;
            else array1[i] = 1;
        }
        System.out.println("Изменённый массив: " + Arrays.toString(array1));
    }

    /*2. Задать пустой целочисленный массив размером 8.
    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;*/
    public static void fillArray() {
        System.out.println("Задание 2");
        int[] array2 = new int[8];
        System.out.println("Исходный массив:    " + Arrays.toString(array2));
        int value = 0;
        for (int i = 0; i < array2.length; i++) {
            array2[i] = value;
            value += 3;
        }
        System.out.println("Заполненный массив: " + Arrays.toString(array2));
    }

    /*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    пройти по нему циклом, и числа меньшие 6 умножить на 2;*/
    public static void changeArray() {
        System.out.println("Задание 3");
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив:   " + Arrays.toString(array3));
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) array3[i] *= 2;
        }
        System.out.println("Изменённый массив: " + Arrays.toString(array3));
    }

    /*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;*/
    public static void fillSquareArray(int a) {
        System.out.println("Задание 4");
        int[][] array4 = new int [a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i == j) || (i == (a - (j + 1)))) array4[i][j] = 1;
                System.out.print(array4[i][j] + " ");
            }
            System.out.println();
        }
    }

    //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static void minMaxArrayIndex(int[] array5) {
        System.out.println("Задание 5");
        int min = array5[0];
        int max = array5[0];
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] >= max) max = array5[i];
            if (array5[i] <= min) min = array5[i];
        }
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }

    /*6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) > true, checkBalance([1, 1, 1, || 2, 1]) > true,
    граница показана символами ||, эти символы в массив не входят.*/
    public static boolean checkBalance(int[] array6) {
        System.out.println("Задание 6");
        System.out.println("Исходный массив:   " + Arrays.toString(array6));
        long leftSum;
        long rightSum;
        if (array6.length != 1) {
            for (int i = 1; i < array6.length; i++) {
                leftSum = 0;
                rightSum = 0;
                int j;
                for (j = 0; j < i; j++) {
                    leftSum += array6[j];
                }
                for (int k = array6.length - 1; k >= j; k--) {
                    rightSum += array6[k];
                }
                if (leftSum == rightSum) {
                    System.out.println("Сумма " + j + " левых элементов массива: " + leftSum + ".");
                    System.out.println("Сумма " + (array6.length - j) + " правых элементов массива: " + rightSum + ".");
                    return true;
                }
            }
        } else {
            leftSum = rightSum = array6[0];
            System.out.println("Сумма 1 левых элементов массива: " + leftSum + ".");
            System.out.println("Сумма 1 правых элементов массива: " + rightSum + ".");
            return true;
        }
        System.out.println("В массиве нет места, в котором сумма левой и правой части массива равны.");
        return false;
    }

    /*7. **** Написать метод, которому на вход подается одномерный массив
    и число n (может быть положительным, или отрицательным),
    при этом метод должен сместить все элементы массива на n позиций.
    Для усложнения задачи нельзя пользоваться вспомогательными массивами.*/
    public static void moveArrayIndex(int[] array7, int n) {
        System.out.println("Задание 7");
        System.out.println("Исходный массив: " + Arrays.toString(array7));
        int offset, buffer;

        //Выбор действий в зависимости от числа n.
        if (n == 0) {
            //Число n=0, сдвига нет.
            System.out.println("Сдвига нет - n=" + n + ".");
        } else if (n > 0) {
            //Число n - положительное, сдвиг элементов массива на n позиций слева направо.
            System.out.println("Cдвиг элементов массива на " + n + " позиций слева направо - n=" + n + ".");
            offset = n % array7.length;
            for (int i = 1; i <= offset; i++) {
                buffer = array7[0];
                array7[0] = array7[array7.length - 1];
                for (int j = array7.length - 1; j > 1; j--) {
                    array7[j] = array7[j - 1];
                }
                array7[1] = buffer;
            }
        } else {
            //Число n - отрицательное, сдвиг элементов массива на n позиций справа налево.
                System.out.println("Cдвиг элементов массива на " + -n + " позиций справа налево - n=" + n + ".");
                offset = (n * (-1)) % array7.length;
                for (int i = 1; i <= offset; i++) {
                    buffer = array7[array7.length - 1];
                    array7[array7.length - 1] = array7[0];
                    for (int j = 0; j < (array7.length - 2); j++) {
                        array7[j] = array7[j + 1];
                    }
                    array7[array7.length - 2] = buffer;
                }
        }
        System.out.println("Смещённый массив: " + Arrays.toString(array7));
    }
}