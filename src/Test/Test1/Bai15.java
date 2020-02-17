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
public class Bai15 {
    public static void main(String[] args) {//số lần xuất hiện nhiều nhất
        Scanner in= new Scanner(System.in);
        int test = in.nextInt();
        while(test-- >0){
            int[] array = new int[in.nextInt()];
            for(int i=0;i<array.length;i++){
                array[i] = in.nextInt();
            }
            countElement(array);
        }
    }
    public static void countElement(int[] array){
        int[] count = new int[100];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[j]==array[i] && array[j]!=-1){
                    count[array[i]]++;
                    array[j]=-1;
                }
            }
        }
        int max=0;
        for(int i=0;i<count.length;i++){
            if(count[i]>max && count[i]>0 ){
                max=count[i];
            }
        }
        for(int i=0;i<count.length;i++){
            if(count[i]==max)
                System.out.print(i+" " );
        }
    }
}
