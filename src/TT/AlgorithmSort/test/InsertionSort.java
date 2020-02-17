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
public class InsertionSort extends SortBase implements Sort{
    public static void main(String[] args) {
         int[] array={3,5,3,1,8};
         InsertionSort insertionSort = new InsertionSort();
         insertionSort.show(array);
         insertionSort.sort(array, array.length);
         insertionSort.show(array);
         
    }
    @Override
    public void sort(int[] array, int n) {
        for(int i=1;i<n;i++){
            int value = array[i];
            int j = i-1;
            while(j>=0 && array[j]>value){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = value;
        }
    }
    
}
