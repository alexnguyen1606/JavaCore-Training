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
public class Bai12 extends BaseArray{
    public static final int max=100;
    public static void main(String[] args) {//đếm số lần xuất hiện của phần tử trong mảng
        
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-- >0){
            int[] array =new int[in.nextInt()];
            add(array, in);
            countElement(array,test);
        }
    }
    public static void countElement(int[] array,int test){
        int[] count=new int[max+1];//khởi tạo mảng lưu trữ, chỉ số tương ứng giá trị phần tử array, giá trị element tương ứng lần xuất hiện
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[i]==array[j])//kiểm tra
                {
                    count[array[i]]++;
                    array[j] = -1;//tránh lặp lại phần tử
                }
            }
        }
        System.out.println("Test "+test+":");
        for(int i=0;i<count.length;i++){
            if(count[i]>0){
                System.out.println(i+" xuat hien "+count[i]+" lan");
            }
            
        }
    }
}
