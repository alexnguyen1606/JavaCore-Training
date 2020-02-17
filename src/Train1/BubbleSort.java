/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Train1;

/**
 *
 * @author User
 */
public class BubbleSort {
    
    public static void main(String[] args){
        int[] a = {1,2,3,1,2,5,4,9};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Trước:");
        bubbleSort.show(a);
        bubbleSort.sort(a);
        System.out.println("Sau:");
        bubbleSort.show(a);
    }
    private void sort(int[] array){
        int n = array.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n-1;j++){
                if(array[j]<=array[j-1]){
                    swap(array, j, j-1);
                }
            }
        }
    }
    public static void swap(int[] array,int x,int y){
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
    public static void show(int[] array){
        for(int i : array){
            System.out.print(i+" ");
        }
    }
}
