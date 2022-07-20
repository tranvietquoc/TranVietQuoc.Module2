package ss4_class_ofject.stopwatch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StopWatch.start();
        int[] arr = randomArr(100000);
        Arrays.sort(arr);
        StopWatch.end();
        System.out.println(StopWatch.getElapsedTime());

    }

    public static int[] randomArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) Math.round(Math.random() * n);
        }
        return arr;
    }
}
