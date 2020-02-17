/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Train1;

import java.util.Scanner;

/**
 *
 * @author User
 */
//Chuyển số tự nhiên n thanh sô cơ số b
public class vd1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        while(i-- >0){
            int a = in.nextInt();
            int k = in.nextInt();
           // int b = in.nextInt();
            response(a,k);
        }
       
    }
    public static void response(int a,int k){
        StringBuilder response = new StringBuilder("");
        int b = a;
        while(a!=0){
            if(a%k==0){
                response.append("0");
            }else{
                response.append(type(a%k));
            }
            a = a/k;
        }
        System.out.println(b+" "+k+" "+response.reverse().toString());
    }
    public static String type(int a){
        String response;
        switch(a){
            case 1:
                response = "1";
                break;
             case 3:
                response = "3";
                break;
             case 2:
                response = "2";
                break;    
             case 4:
                response = "4";
                break;
             case 5:
                response = "5";
                break;
             case 6:
                response = "6";
                break;    
             case 7:
                response = "7";
                break;
             case 8:
                response = "8";
                break;
             case 9:
                response = "9";
                break;    
              case 10:
                response = "A";
                break;
             case 11:
                response = "B";
                break;
             case 12:
                response = "C";
                break;    
              case 13:
                response = "D";
                break;
             case 14:
                response = "E";
                break;
             case 15:
                response = "F";
                break;    
             case 16:
                response = "G";
                break;
             case 17:
                response = "H";
                break;
             case 18:
                response = "I";
                break;    
             case 19:
                response = "J";
                break;
             case 20:
                response = "K";
                break;
             case 21:
                response = "L";
                break;    
              case 22:
                response = "M";
                break;
             case 23:
                response = "N";
                break;
             case 24:
                response = "O";
                break;    
             case 25:
                response = "P";
                break;
             case 26:
                response = "Q";
                break;
             case 27:
                response = "R";
                break;        
             case 28:
                response = "S";
                break;
             case 29:
                response = "T";
                break;    
              case 30:
                response = "U";
                break;
             case 31:
                response = "V";
                break;
            default:
                response = "";
                break;
        }
        return response;
    }
}
