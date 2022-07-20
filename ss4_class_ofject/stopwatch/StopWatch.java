package ss4_class_ofject.stopwatch;


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
}
