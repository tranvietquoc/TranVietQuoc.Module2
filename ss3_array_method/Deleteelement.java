package ss3_array_method;

import java.util.Scanner;

public class Deleteelement {
    public static void main(String[] args) {
        // Tạo mảng và truyền phần tử vào
        System.out.println("Enter a size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i =0; i< size; i++){
            System.out.println("Value of array["+i+"] is: ");
            array[i] = sc.nextInt();
        }
        // Xóa phần tử trong mảng
        System.out.println("Enter a index: ");
        int index = sc.nextInt();
        for (int i = index; i < size-1; i++){
            array[i] = array[i+1];
        }
        array[size-1] = 0;
        for (int x: array){
            System.out.println(x);
        }
    }
}
