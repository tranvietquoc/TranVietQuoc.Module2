package ss3_array_method;

import java.util.Scanner;

public class Addelement {
    public static void main(String[] args) {
        // Tạo mảng và truyền phần tử
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter array[" + i + "]: ");
            array[i] = sc.nextInt();
        }
        // Thêm phần tử vào mảng
        System.out.println("Enter a index: ");
        int index = sc.nextInt();
        System.out.println("Enter a value: ");
        int value = sc.nextInt();
        int[] result = new int[size + 1];
        if (index < 0 || index > size + 1) {
            System.out.println("Can't Insert");
        } else {
            for (int i = 0; i < index; i++) {
                result[i] = array[i];
            }
            result[index] = value;
            for (int i = index + 1; i < size + 1; i++) {
                result[i] = array[i - 1];
            }
        }
        for (int x : result) {
            System.out.print(x + "\t");
        }
    }
}
