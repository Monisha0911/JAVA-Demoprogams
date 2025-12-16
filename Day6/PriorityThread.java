package day6;

class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(
            "Thread Name: " + getName() +
            ", Priority: " + getPriority()
        );
    }
}
