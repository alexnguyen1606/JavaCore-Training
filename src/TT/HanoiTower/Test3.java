/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TT.HanoiTower;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Test3 {//1+ 1/2+1/3+..+1/n
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        float n = in.nextFloat();
        System.out.println(tong(n));
       
    }
    public static float tong(float n){
        if(n==1){
            return 1/n;
        }
        else{
            
            return (1/n+tong(n-1));
        }
    }
}
