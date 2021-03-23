/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Train1;

/** @author User */
public class InsertionSort extends BubbleSort {
  public static void main(String[] args) {
    int[] array = {1, 11, 2, 7,5,2,4,9,0};
    //        show(array);
    sort(array);
//    show(array);
  }

  public static void sort(int[] array) {
    int n = array.length;
    for (int i = 1; i < n; i++) {
      int value = array[i];
      int j = i - 1;
      while (j >= 0 && array[j] > value) {
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = value;
    }
  }
}
