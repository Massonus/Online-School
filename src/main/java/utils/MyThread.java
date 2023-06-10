package utils;

import entities.Student;

public class MyThread extends Thread {

    public static void main(String[] args) {


        Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();
        Student student7 = new Student();
        Student student8 = new Student();
        Student student9 = new Student();

        int a = 0;
        int b = 10;

        int random_number1 = a + (int) (Math.random() * b + 1);
        int random_number2 = a + (int) (Math.random() * b) + 1;
        int random_number3 = a + (int) (Math.random() * b) + 1;
        int random_number4 = a + (int) (Math.random() * b) + 1;
        int random_number5 = a + (int) (Math.random() * b) + 1;
        int random_number6 = a + (int) (Math.random() * b) + 1;
        int random_number7 = a + (int) (Math.random() * b) + 1;
        int random_number8 = a + (int) (Math.random() * b) + 1;
        int random_number9 = a + (int) (Math.random() * b) + 1;
        int random_number10 = a + (int) (Math.random() * b) + 1;

        int y = 2000;
        int n = 6000;

        int random_timer1 = y + (int) (Math.random() * n);
        int random_timer2 = y + (int) (Math.random() * n);
        int random_timer3 = y + (int) (Math.random() * n);
        int random_timer4 = y + (int) (Math.random() * n);
        int random_timer5 = y + (int) (Math.random() * n);
        int random_timer6 = y + (int) (Math.random() * n);
        int random_timer7 = y + (int) (Math.random() * n);
        int random_timer8 = y + (int) (Math.random() * n);
        int random_timer9 = y + (int) (Math.random() * n);
        int random_timer10 = y + (int) (Math.random() * n);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    sleep(random_timer1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Student1 have task: " + random_number1);
                if (random_timer1 < 2999) {
                    System.out.println("Student1 was first");
                }
                if (random_timer1 > 5000) {
                    System.out.println("Student1 is noob");
                }
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(random_timer2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Student2 have task: " + random_number2);
                if (random_timer2 < 2999) {
                    System.out.println("Student2 was first");
                }
                if (random_timer2 > 5000) {
                    System.out.println("Student2 is noob");
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    sleep(random_timer3);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Student3 have task: " + random_number3);
                if (random_timer3 < 2999) {
                    System.out.println("Student3 was first");
                }
                if (random_timer3 > 5000) {
                    System.out.println("Student3 is noob");
                }
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    sleep(random_timer4);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Student4 have task: " + random_number4);
                if (random_timer4 < 2999) {
                    System.out.println("Student4 was first");
                }
                if (random_timer4 > 5000) {
                    System.out.println("Student4 is noob");
                }
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    sleep(random_timer5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Student5 have task: " + random_number5);
                if (random_timer5 < 2999) {
                    System.out.println("Student5 was first");
                }
                if (random_timer5 > 5000) {
                    System.out.println("Student5 is noob");
                }
            }
        });
        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    sleep(random_timer6);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Student6 have task: " + random_number6);
                if (random_timer6 < 2999) {
                    System.out.println("Student6 was first");
                }
                if (random_timer6 > 5000) {
                    System.out.println("Student6 is noob");
                }
            }
        });
        Thread thread6 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    sleep(random_timer7);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Student7 have task: " + random_number7);
                if (random_timer7 < 2999) {
                    System.out.println("Student7 was first");
                }
                if (random_timer7 > 5000) {
                    System.out.println("Student7 is noob");
                }
            }
        });
        Thread thread7 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    sleep(random_timer8);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Student8 have task: " + random_number8);
                if (random_timer8 < 2999) {
                    System.out.println("Student8 was first");
                }
                if (random_timer8 > 5000) {
                    System.out.println("Student8 is noob");
                }
            }
        });
        Thread thread8 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    sleep(random_timer9);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Student9 have task: " + random_number9);
                if (random_timer9 < 2999) {
                    System.out.println("Student9 was first");
                }
                if (random_timer9 > 5000) {
                    System.out.println("Student9 is noob");
                }
            }
        });
        Thread thread9 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(random_timer10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Student10 have task: " + random_number10);
                if (random_timer10 < 2999) {
                    System.out.println("Student10 was first");
                }
                if (random_timer10 > 5000) {
                    System.out.println("Student10 is noob");
                }
            }
        });

        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();

    }

}
