package day6;

public class PriorityThreadMain {
    public static void main(String[] args) {

        PriorityThread t1 = new PriorityThread("Low Priority Thread");
        PriorityThread t2 = new PriorityThread("High Priority Thread");

        t1.setPriority(Thread.MIN_PRIORITY); // Priority = 1
        t2.setPriority(Thread.MAX_PRIORITY); // Priority = 10

        t1.start();
        t2.start();
    }
}

