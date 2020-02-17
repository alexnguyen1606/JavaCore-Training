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
public class Bai7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-- >0){
            int lenght = in.nextInt();
            int[] array = new int[lenght];
            for(int i=0;i<lenght-1;i++){
                array[i] = Integer.parseInt(in.next());
            }
            int maxIndex = 0;
            for(int i=1;i<lenght-1;i++){
                if(array[maxIndex]<array[i]){
                    maxIndex=i;
                }
            }
            System.out.println(array[maxIndex]);//Giá trị lớn nhất
            for(int i=0;i<array.length;i++){// vị trí có giá trị lớn nhất
                if(array[i]==array[maxIndex]){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
