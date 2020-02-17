/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.Test1;

/**
 *
 * @author User
 */
public class Bai10_1 {
    public static void main(String[] args) {//thêm 1 phần tử vào vị trí xác định của mảng
        int[] a = {8,3,1,312,4};
       // insertElement(a, 10, 2);
        removeElement(a, 2);
    }
    public static void insertElement(int[] array,int a,int position){
        int[] newArray = new int[array.length+1];
        newArray[position] = a;
        for(int i=0;i<array.length;i++){
            if(i>=position){
                newArray[i+1] =array[i]; 
            }else
                 newArray[i] =array[i]; 
        }
        show(newArray);
    }
    public static void removeElement(int[] array,int position){
        int[] newArray = new int[array.length-1];
        for(int i=0;i<array.length-1;i++){
            if(i>=position ){
                newArray[i] = array[i+1];
            }else
                newArray[i] = array[i];
                 
        }
        show(newArray);
    }
    public static void show(int[] array){
         for(int i:array){
            System.out.print(i+" ");
        }
         System.out.println("");
    }
}
