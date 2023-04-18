package top.yushif.test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] temArr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random random = new Random();
        for (int i = 0; i < temArr.length; i++) {
            int index = random.nextInt(temArr.length);

            int temp = temArr[i];
            temArr[i] = temArr[index];
            temArr[index]=temp;
        }
        for (int i = 0; i < temArr.length; i++) {
            System.out.println(temArr[i]);
        }

        int[][] data = new int[4][4];
        for (int i = 0; i < temArr.length; i++) {
            data[i/4][i%4] = temArr[i];
        }

    }
}
