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
public class Bai13 extends BaseArray{//đếm số lần xuất hiện của số nguyên tố
    public static final int max =100;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for(int k=1;k<=test;k++){
            int[] array = new int[in.nextInt()];
            add(array, in);
            countElement(array, k);
        }
    }
    public static void countElement(int[] array,int test){
        int[] count=new int[max];
        for(int i=0;i<array.length;i++){
            if(isPrime(array[i])){
                for(int j=0;j<array.length;j++){
                    if(array[i]==array[j]){
                         count[array[i]]++;
                         array[j]=-1;
                    }
                }
            }
        }
         System.out.println("Test "+test+":");
        for(int i=0;i<count.length;i++){
            if(count[i]>0){
                System.out.println(i+" xuat hien "+count[i]+" lan");
            }
            
        }
            
    }
    public static boolean isPrime(int n){//check số nguyên tố
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
