/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.Test1;

import java.util.Scanner;

/**
 * @author User
 */
public class Bai5 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        if (n >= 10 || n <= 1) {
            throw new Exception(n + " wrong");
        }
        long number1 = number(n) - 1;//lấy số kết thúc
        long number2 = number(n - 1);//số bắt đầu
        System.out.println(number1 + " " + number2);
        while (number1 >= number2) {
            int lenght = (int) n;
            long[] array = new long[lenght];
            getArray(number2, array);//chuyển chữ số thành mảng
            if (checkSymertry(array) && checkDecimal(array, lenght)) {//kiểm tra
                System.out.print(number2 + " ");
            }
            number2++;
        }

    }

    public static boolean checkDecimal(long[] array, int lenght) {//kiểm tra tổng số chữ số chia hết 10
        int result = 0;
        for (int i = 0; i < lenght; i++) {
            result += array[i];
        }
        if (result % 10 == 0) {
            return true;
        }
        return false;
    }

    public static boolean checkSymertry(long[] array) {//kiểm tra mảng chữ số đối xứng
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void getArray(long number2, long[] array) {//chuyển các số của chữ số thành mảng
        for (int i = 0; i < array.length; i++) {
            array[i] = number2 % 10;
            number2 = number2 / 10;
        }
    }

    public static long number(long n) {
        long result = 0;
        for (long i = n; i > 0; i--) {
            if (i == n)
                result = 10 * 10;
            else
                result *= 10;
        }
        return result / 10;
    }
}
