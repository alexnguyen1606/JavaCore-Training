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
public class HanoiTowerImpl {
    public static void main(String[] args) {
        int n;
        char a='A',b='B',c='C';
        Scanner in = new Scanner(System.in);
        n = in.nextInt();//nhập số đĩa
        hanoiTower(n, a, b, c);
    }
    public static void chuyen(int n,char a,char b){ // move index a to b
        System.out.println(" chuyen dia thu n:"+n+" từ coc "+a+" sang coc "+ b );
    }
    public static void hanoiTower(int n,char a,char b,char c){
         if(n==1){
            chuyen(1, a, c);
        }
         else
         {
             hanoiTower(n-1, a, c, b);
             chuyen(n, a, c);
             hanoiTower(n-1, b, a, c);
          }
    }
    
}
