package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 34, 0, 45, 7};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
        int[] arrayForSelection = {0, -2, 45, 0, 45};
        selectionSort(arrayForSelection);
        System.out.println(Arrays.toString(arrayForSelection));
        int[] arrayForIns = {0, -2, 45, 0, 45};
        insertionSort(arrayForIns);
        System.out.println(Arrays.toString(arrayForIns));
    }

    static void insertionSort(int[] arr) {
        int temp, j;
        for (int index = arr.length - 2; index >= 0; index--) {
            if (arr[index] > arr[index + 1]) {
                temp = arr[index + 1];
                arr[index + 1] = arr[index];
                j = index;
                while (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
        }
    }

    static void selectionSort(int array[]) {
        for (int barrier = array.length - 1; barrier > 0; barrier--) {
            int maxElement = array[barrier];
            int indexOfMax = barrier;
            for (int j = barrier - 1; j >= 0; j--) {
                if (array[j] > maxElement) {
                    maxElement = array[j];
                    indexOfMax = j;
                }
            }
            if (barrier != indexOfMax) {
                swap(array, barrier, indexOfMax);
            }
        }
    }

    static void bubbleSort(int array[]) {
        for (int barrier = array.length - 1; barrier >= 1; barrier--) {
            for (int index = barrier - 1; index >= 0; index--) {
                if (array[index] > array[barrier]) {
                    swap(array, index, barrier);
                }
            }
        }
    }


    static void swap(int array[], int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}

