package com.kharchenko.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadsExample {
    AtomicInteger counter = new AtomicInteger(1);
    AtomicInteger number = new AtomicInteger(1);
    static final Object lock = new Object();

    public static void main(String[] args) {
        ThreadsExample threadsExample = new ThreadsExample();

        Thread first = new Thread(threadsExample.new ThreadQueue("First Thread", 1));
        Thread second = new Thread(threadsExample.new ThreadQueue("Second Thread", 2));
        Thread third = new Thread(threadsExample.new ThreadQueue("Third Thread", 3));

        first.run();
        second.start();
        third.start();
    }

    class ThreadQueue implements Runnable {
        private int threadNumber;
        private String name;

        public ThreadQueue(String name, int threadNumber) {
            this.threadNumber = threadNumber;
            this.name = name;
        }

        @Override
        public void run() {
            while (number.get() <= 100) {
                synchronized (lock) {
                    if (threadNumber == counter.get()) {
                        System.out.println(name + " - " + number.get());
                        number.set(number.get() + 1);
                        if (counter.get() == 3) {
                            counter.set(1);
                        } else {
                            counter.set(counter.get() + 1);
                        }
                    }
                    lock.notifyAll();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}