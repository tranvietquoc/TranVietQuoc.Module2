package ss4_class_ofject;


import java.util.Arrays;

public class StopWatch {
    private static double Startime;
    private static double Endtime;

    public StopWatch() {
    }

    public double getStartime() {
        return Startime;
    }

    public double getEndtime() {
        return Endtime;
    }

    public static void start() {
        Startime = System.currentTimeMillis();
    }

    public static void end() {
        Endtime = System.currentTimeMillis();
    }

    public static double getElapsedTime() {
        return Endtime - Startime;
    }
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
