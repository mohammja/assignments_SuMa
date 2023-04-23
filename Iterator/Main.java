package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Iterator<Integer> iter1 = list.iterator();
        Iterator<Integer> iter2 = list.iterator();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                while (iter1.hasNext()) {
                    System.out.println(Thread.currentThread().getName() + " - " + iter1.next());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                while (iter2.hasNext()) {
                    System.out.println(Thread.currentThread().getName() + " - " + iter2.next());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        //The problem is that the iterator is not thread safe. So using same iterator in multiple threads is not safe. but sometimes it works fine.
    }
}
