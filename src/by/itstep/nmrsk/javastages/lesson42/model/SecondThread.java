package by.itstep.nmrsk.javastages.lesson42.model;

public class SecondThread implements Runnable {

    @Override
    public void run() {
        while (true) {
            Thread thread = Thread.currentThread();
            System.out.printf("\nid = %d, name = %s",
                    thread.getId(), thread.getName());
        }
    }
}
