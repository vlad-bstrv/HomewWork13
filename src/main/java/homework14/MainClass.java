package homework14;

/*
    Task1
    Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
    Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов,
    идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку, иначе в методе
    необходимо выбросить RuntimeException.
    Написать набор тестов для этого метода (по 3-4 варианта входных данных).
    Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].

    Task2
    Написать метод, который проверяет состав массива из чисел 1 и 4.
    Если в нем нет хоть одной четверки или единицы, то метод вернет false;
    Написать набор тестов для этого метода (по 3-4 варианта входных данных).
    [ 1 1 1 4 4 1 4 4 ] -> true
    [ 1 1 1 1 1 1 ] -> false
    [ 4 4 4 4 ] -> false
    [ 1 4 4 1 1 4 3 ] -> false

     */

import java.util.Arrays;

public class MainClass {


    //Task1
    public int[] getElementsBeforeLastNumberFour(int[] arr) {

        if(arr == null) {
            throw new NullPointerException("Array is null");
        }

        int indexBeforeFour = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                indexBeforeFour = i + 1;
            }
        }

        if (indexBeforeFour == -1) {
            throw new RuntimeException("array not contain element 4");
        } else {
            return Arrays.copyOfRange(arr, indexBeforeFour, arr.length);
        }
    }

    //Task2

    public boolean checkArrayContainOnlyOneAndFour(int[] arr) {

        if(arr == null) {
            throw new NullPointerException("Array is null");
        }

        boolean e1 = false;
        boolean e2 = false;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                e1 = true;
            } else if (arr[i] == 4) {
                e2 = true;
            } else {
                return false;
            }
        }
        return e1 && e2;
    }

}
