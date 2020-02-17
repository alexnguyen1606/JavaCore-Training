/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TT.AlgorithmSort;

/**
 *
 * @author User
 */
public class InsertionSort {
    public static void main(String[] args) {
         int[] array = {1,0,2,7};
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println("");
        int n = array.length;
        insertionSort(array,n);
        for(int i:array){
            System.out.print(i+" ");
        }
    }

    public static void insertionSort(int[] array, int n) {
        for(int i=1;i<n;i++){
            int temp = array[i];
            int j=i-1;
            while(j>=0 && temp > array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }
    
}
