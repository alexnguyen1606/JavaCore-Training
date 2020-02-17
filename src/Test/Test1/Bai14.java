/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.Test1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Bai14 {
    public static void main(String[] args) {//đếm cặp số liền kề trong mảng có bằng nhau
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-- >0){
            int[] array = new int[in.nextInt()];
            for(int i=0;i<array.length;i++){
                array[i] = in.nextInt();
            }
            coupleNumber(array);
        }
    }
    public static void coupleNumber(int[] array){
        int count=0;
        for(int i=1;i<array.length;i++){
            if(array[i]==array[i-1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
