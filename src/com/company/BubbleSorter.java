package com.company;

import java.util.Arrays;


public class BubbleSorter {
    int[] numbers = new int[]{16, 2, 20, 7, -3, 5, 12, 4, 40, -275, 49, 67, 1, 0};
    int index;
    int comp1;
    int comp2;

    public void bubbleSorter() {

        while(true) {
            boolean checkPoint = true;
            for (index = 0; index < (numbers.length) - 1; index++) {
                comp1 = numbers[index];
                comp2 = numbers[index+1];
                if (comp1 > comp2) {
                    swap();
                    checkPoint = false;
                }
            }
            if(checkPoint){
                break;
            }
        }

        System.out.println(Arrays.toString(numbers));
    }

    public void swap() {
        numbers[index] = comp2;
        numbers[index+1] = comp1;
    }

}
