package day6;

public class ThreadAThreadBMain {
    public static void main(String[] args) throws InterruptedException {

        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();

        t1.start();     
        t1.join();   

        t2.start(); 
        t2.join();
    }
}

