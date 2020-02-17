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
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {-2,-5,2,5,4,-1,0};
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println("");
        selectionSort(array, array.length);
        for(int i:array){
            System.out.print(i+" ");
        }
    }
    public static void selectionSort(int[] array,int n){
        int indexMin;
        for(int i=0;i<n;i++){
            indexMin = i;
            for(int j=i+1;j<n;j++){
                if(array[j]<array[indexMin])
                    indexMin = j;
            }
            swap(array,i,indexMin);
            
        }
    }
    public static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
