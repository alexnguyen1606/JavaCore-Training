/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.Test1;

import java.util.Scanner;

/**
 * @author User
 */
public class Bai6 {//fibonaci

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] array = new long[92];
        array[0] = 0;
        array[1] = 1;
        array[2] = 1;
        for (int i = 3; i <= 91; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        int test = in.nextInt();
        while (test-- > 0) {
            int a = in.nextInt();
            System.out.println(array[a]);
        }
    }

}
