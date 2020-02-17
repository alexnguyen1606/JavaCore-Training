/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.Test1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Bai16 {
    public static void main(String[] args) throws Exception {//trộn 2 mảng theo nguyên tắc sen kẽ với điều kiện sắp xếp
        Scanner in = new Scanner(System.in);
//        int[] a = {3,4,1,3,5,7};
//        show(a);
//        bubbleSort(a, "DESC");
//        show(a);
        int test = in.nextInt();
        for(int i=1;i<=test;i++){
            int n =in.nextInt();
            if(n<0 || n>100){
                throw new Exception(n+" wrong");
            }
            int[] arrayA = new int[n];
            int[] arrayB = new int[n];
            add(arrayA, in);
            add(arrayB, in);
            margeArray(arrayA, arrayB, i);
        }
    }
    public static void margeArray(int[] arrayA,int[] arrayB,int test){
        int[] newArray = new int[arrayA.length+arrayB.length];
        selectionSort(arrayA, "ASC");
        selectionSort(arrayB, "DESC");
        for(int i=0;i<arrayA.length;i++){
            if(i==0)
                newArray[i] = arrayA[i];
            else {
                newArray[i+i] = arrayA[i];
            }       
        }
        for(int i=0;i<arrayB.length;i++){
            if(i==0){
                newArray[i+1] = arrayB[i];
            }else{
                newArray[i+i+1] = arrayB[i];
            }
        }
        System.out.println("Test "+test+":");
        show(newArray);
    }
    public static void bubbleSort(int[] array,String order){
        if(order.equals("ASC")){
            for(int i=0;i<array.length;i++){
                for(int j=array.length-1;j>i;j--){
                    if(array[j-1]>array[j]){
                        swap(array, j, j-1);
                    }
                }
            }
        }else if(order.equals("DESC")){
            for(int i=0;i<array.length;i++){
                for(int j=array.length-1;j>i;j--){
                    if(array[j-1]<array[j]){
                        swap(array, j, j-1);
                    }
                }
            }
        }
    }
    public static void selectionSort(int[] array,String order){
        
        if(order.equals("ASC")){
            int max;
            for(int i=0;i<array.length;i++){
            max=i;
            for(int j=i+1;j<array.length;j++){
                if(array[max]>array[j]){
                    max = j;
                }
            }
            swap(array, i, max);
            }
        }
        else if(order.equals("DESC"))
            {
            int min;
            for(int i=0;i<array.length;i++){
            min=i;
            for(int j=i+1;j<array.length;j++){
                if(array[min]<array[j]){
                    min = j;
                }
            }
            swap(array, i, min);
            }    
            }
    }
    public static void insertionSort(int[] array){
        
    }
     public static void show(int[] array){
        for(int i=0;i<array.length;i++){
            if(i==array.length-1){
                System.out.print(array[i]);
            }else{
                System.out.print(array[i]+ " ");
            }
        }
    }
    public static void add(int[] array,Scanner in){
        for(int i=0;i<array.length;i++){
            array[i] =in.nextInt();
        }
    } 
    public static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
