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
public class SelectionSort extends BubbleSort{
    public static void main(String[] args) {
         int[] array = {-2,-5,2,5,4,-1,0};
        show(array);
        sort(array);
        show(array);
    }
    public static void sort(int[] array){
        int n = array.length;
        for(int i=0;i<n;i++){
            int check = i;
            for(int j = i;j<n;j++){
                if(array[j]>array[check]){
                    check = j;
                }
            }
            swap(array, i, check);
        }
    }
}
