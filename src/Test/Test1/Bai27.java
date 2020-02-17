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
public class Bai27 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-- >0){
            String a = in.next();
            if(checkNumber(a)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
       }
    }
    public static boolean checkNumber(String str){
        int[] arrayNumber = getArrayNumber(str);
        int n = arrayNumber.length;
        for(int i=0;i<n;i++){
            if(!isPrime(arrayNumber[i]) || arrayNumber[i]!=arrayNumber[n-i-1]){
                return false;
            }
        }
        return true;
    }
    
     public static int[] getArrayNumber(String n){
        String[] arrayString = n.trim().split("");
        int[] array = new int[n.length()];
        for(int i=0;i<arrayString.length;i++){
            array[i] = Integer.parseInt(arrayString[i]);
        }
        return array;
    }
     public static boolean isPrime(int n){
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
