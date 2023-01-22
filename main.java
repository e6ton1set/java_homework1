package homework1;

//Задать одномерный массив и найти в нем минимальный и максимальный элементы

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        randomArray();
    }

    public static void randomArray() {
        int[] randomArray = new int[20];
        int counter = 0;
        Random random = new Random();

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(1, 1001);
        }
        System.out.println("Random array: " + Arrays.toString(randomArray));

        int max = randomArray[0];
        int min = randomArray[0];

        for (int num : randomArray) {
            if (randomArray[counter] > max) {
                max = randomArray[counter];
            }
            if (randomArray[counter] < min){
                min = randomArray[counter];
            }
            counter++;
        }

        System.out.println("Max number in randomArray: " + max);
        System.out.println("Min number in randomArray: " + min);
    }

}

