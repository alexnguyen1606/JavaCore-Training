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
public class Bai2 {
    public static void main(String[] args) throws Exception{
         Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-- >0){
            int num1 = in.nextInt();
            
            if(num1<10 || num1 >99999999 ){
                throw new Exception("Number : %d is wrong "+num1);
            }
            int total = 0;//tổng các số của chữ số
            while(num1!=0){
                total+=num1%10;
                num1= num1/10;
            }
            if(total%10==0){//kiểm tra có chia hết 10 hay k
                System.out.println("YES");
            }else System.out.println("NO");
            
        }
    }
}
