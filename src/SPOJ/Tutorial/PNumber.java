/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SPOJ.Tutorial;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        show(num1, num2);
    }
    public static void show(int num1,int numb2){
        for(int i=num1;i<=numb2;i++){
            if(isPrime(i)){
                System.out.println(i);
            }    
        }
     }
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        if(n==2)
            return true;
        if(n%2==0)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
