/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TT.HanoiTower;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Recursion {//A.K.A Đệ Quy
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       // int result = 0;
        //result=recursionInt(n);
        //System.out.println(result);
       // System.out.println(recursionInt(n));
        recursionFor(n);
    }
    public static void recursionInt(int n){
        if(n==0){
           // System.out.print("1");;
        }
        else{
            System.out.print(n+"*");
            recursionInt(n-1);
        }
       
    } 
    public static void recursionFor(int n){
        int result = 1;
        for(int i=n;i>0;i--){
            result *=  i*(i-1);
        }
        System.out.println(result);
    }
}
