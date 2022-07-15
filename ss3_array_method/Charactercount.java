package ss3_array_method;

import java.util.Scanner;

public class Charactercount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Mời nhập vào chuỗi : ");
        String str = scn.nextLine();
        System.out.println("Mời nhập vào kí tự mà muốn kiểm tra");
        char c = scn.next().charAt(0);
        System.out.println("Số lần suất hiện của " + c+ " là : " +countChar(str , c));
    }
    private static int countChar(String string , char c) {
        int count = 0;

        for (int i = 0 ; i < string.length() ; i++) {
            if (string.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
