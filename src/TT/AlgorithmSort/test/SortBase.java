/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TT.AlgorithmSort.test;

/**
 *
 * @author User
 */
public class SortBase {
     public  void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
     public void show(int[] array) {
       for(int i=0;i<array.length;i++){
           System.out.print(array[i]+" ");
       }
         System.out.println("");
    }
}
