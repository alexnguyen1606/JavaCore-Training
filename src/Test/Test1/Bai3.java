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
public class Bai3 {
    public static void main(String[] args) throws Exception{
          Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-- >0){
            int num1 = in.nextInt();
            if(num1 <0){
                throw new Exception("Number wrong");
            }
            if(isPrime(num1)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    public static boolean isPrime(int n){//kiểm tra số nguyên tố
        if(n<2){
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
