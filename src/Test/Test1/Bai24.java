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
public class Bai24 {//đếm từ
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int test =in.nextInt();
       while(test-- >0){
           String a = in.nextLine();
           countWord(a);
       }
    }
    public static void countWord(String str){
        String[] n = str.trim().split(" ");
        System.out.println(n.length);
        
    }
}
