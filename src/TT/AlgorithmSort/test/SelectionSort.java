/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TT.AlgorithmSort.test;

import javafx.scene.chart.BubbleChart;

/**
 *
 * @author User
 */
public class SelectionSort extends SortBase implements Sort {
    public static void main(String[] args) {
         int[] array={3,5,3,1,8};
         SelectionSort selectionSort = new SelectionSort();
         selectionSort.show(array);
         selectionSort.sort(array, array.length);
         selectionSort.show(array);
         
    }
    @Override
    public void sort(int[] array, int n) {
       for(int i=0;i<n;i++){
           int minIndex = i;
           for(int j=i+1;j<n;j++){
               if(array[j]<array[minIndex]){
                   minIndex = j;
               }
           }
           swap(array, minIndex, i);
                  
       }
    }
    
}
