/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TT.AlgorithmSort;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class BubbleSort {
  
    public static void main(String[] args) {
        int[] array={3,5,3,1,8};
        Scanner in = new Scanner(System.in);
    //    int n = in.nextInt();
       // array = new int[n];
        //for(int i=0;i<n;i++){
          //  array[i] = in.nextInt();
        //}
        bubbleSort(array,array.length);
        for(int item : array){
            System.out.print(item+" ");
        }
    }
    public static void bubbleSort(int[] array,int n){
        for(int i=0;i<n-1;i++){
            for(int j=n-1 ;j>i;j--){
               if(array[j]<array[j-1]){
                   swaps(array,j,j-1);
               } 
            }
        }
    }

    public static void swaps(int[] array, int i, int j) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    
}
