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
public class Bai9 {
    public static void main(String[] args) {
        int[] array = {2,4,3,4,5,6,3,4,7,9};
        check(array);
    }
     public static void show(int[] array){
         for(int i:array){
            System.out.print(i+" ");
        }
         System.out.println("");
    }
    public static void check(int[] array){
        int[] arrayB = new int[array.length];
        int x=0;
        int[] arrayS = new int[array.length];
        for(int i=0;i<array.length-1;i++){
            if(array[i]<=array[i+1]){
                x++;
            }else{
                arrayS[i]=x;
                x=0;
            }
        }
        show(arrayS);
        show(arrayB);
    } 
}
