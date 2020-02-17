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
public class Bai10 extends BaseArray{
    public static void main(String[] args) {//trèn mảng B vào vị trí xác đinh ở mảng B
        int[] array1 ;
        int[] array2;
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        
        while(test-- >0){
        array1 = new int[in.nextInt()];
        array2 = new int[in.nextInt()];
        int position = in.nextInt();//nhập vị trí
            add(array1, in);//nhập mảng
            add(array2, in);
         mergeArray(array1, array2, position);
        }
       
    //    show(array2);
    }
   
  
    public static void mergeArray(int[] array1,int[] array2,int position){
        int[] newArray = new int[array1.length+array2.length];//khới tạo mảng độ dài bằng 2 mảng
        int s = 0;
        for(int i=0;i<array1.length;i++){ //điền mảng A vào mảng mới
            if(i>=position){
                newArray[position+array2.length+s] = array1[i];
                s++;//biến đếm phần tử điền vào mảng mới khi ngắt 
            }else
                newArray[i] = array1[i];
        }
        for(int i=0;i<array2.length;i++){//điền mảng B vào mảng mới
            newArray[i+position] =array2[i] ;
        }
        
        show(newArray);
    }
}
