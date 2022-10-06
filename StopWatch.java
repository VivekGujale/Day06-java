//Simulate Stopwatch Program
//Program for measuring the time that elapses between the start and end clicks

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        long startTime, stopTime;
        Scanner obj = new Scanner(System.in);
        System.out.println("Press 1 to start the stopwatch ");
        int start = obj.nextInt();
        startTime = System.currentTimeMillis();
        System.out.println("startTime is " + startTime);
        System.out.println("Press 2 to stop the stopwatch ");
        int stop = obj.nextInt();
        stopTime = System.currentTimeMillis();
        System.out.println("stopTime is " + stopTime);
        double elapseTime = (stopTime - startTime) / 1000;
        System.out.println("Elapsed time is " + elapseTime + " seconds ");
    }
}
