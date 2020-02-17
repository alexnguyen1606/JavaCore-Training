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
public class BubbleSort extends SortBase implements Sort{
    public static void main(String[] args) {
         int[] array={3,5,3,1,8};
         BubbleSort bubbleSort = new BubbleSort();
         bubbleSort.show(array);
         bubbleSort.sort(array, array.length);
         bubbleSort.show(array);
    }
    @Override
    public void sort(int[] array, int n) {
       for(int i=0;i<n;i++){
           for(int j = n-1;j>i;j-- ){
               if(array[j]>array[j-1])
                   swap(array, j, j-1);
           }
       }
    }

}
