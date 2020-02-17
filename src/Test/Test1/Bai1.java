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
public class Bai1 {
    public static void main(String[] args) {//kiểm tra số đầu và số cuối 
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n >0){
            int num1 = in.nextInt();
           int first = num1%10;
           int second = 0;
           while(num1 !=0){
               second = num1%10;
               num1 = num1/10;
           }
           if(first==second){
               System.out.println("YES");
           }else{
               System.out.println("NO");
           }
            n--;
        }
    }
  
}
