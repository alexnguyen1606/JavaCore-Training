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
public class Test2 {// 1+2+...+n
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result1 = (n*n+n)/2;
        System.out.println(result1);
        System.out.println(tong(n));
    }
    public static int tong(int n){
        if(n==1){
            return n;
        }
        else{
            return n+tong(n-1);
        }
    }
}
