package by.itstep.nmrsk.javastages.lesson42.controller;

import by.itstep.nmrsk.javastages.lesson42.model.FirstThread;

public class FirstController {
    public static void main(String[] args) {
        FirstThread thread = new FirstThread();
        thread.start();

//        new FirstThread().start();
        Thread main = Thread.currentThread();

        while (true) {
            System.out.printf("\nid = %d, name = %s",
                    main.getId(), main.getName());
        }
    }
}
