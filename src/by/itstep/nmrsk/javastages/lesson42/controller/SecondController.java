package by.itstep.nmrsk.javastages.lesson42.controller;

import by.itstep.nmrsk.javastages.lesson42.model.SecondThread;

public class SecondController {
    public static void main(String[] args) {
        SecondThread threadLogic = new SecondThread();
        Thread thread = new Thread(threadLogic);
        Thread main = Thread.currentThread();
        thread.start();
//        SecondThread threadLogic = new SecondThread();
//        new Thread(threadLogic).start();

//        new Thread(new SecondThread()).start();
        while (true) {
            System.out.printf("\nid = %d, name = %s",
                    main.getId(), main.getName());
        }

    }
}
