package ss3_array_method;

import java.util.Arrays;

public class Smallestvalue {
    public static void main(String[] args) {
        int[] arr = {3,5,7,2,9,6};
        System.out.println("arr = "+Arrays.toString(arr));
        int min = arr[0];
        for (int i=1; i< arr.length; i++ ){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Phần tử nhỏ nhất trong mảng: "+ min);
    }
}
