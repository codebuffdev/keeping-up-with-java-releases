package in.codebuffdev.release.java8.features.lambda.syntax;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
* resource:devoxxVenkatsubramaniam*/

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Child Thread");
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("runnable child thread ");
    }
}

class ThreadCreation {
    public static void main(String[] args) {
        //Thread creation
//        MyThread thread = new MyThread();
//        thread.start();
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        System.out.println("Main thread");
    }
}

public class LambdaExploring {
    public static void main(String[] args) {
        //Thread in lambda
        /**
         Runnable runnableLambda = ()->{
         System.out.println("Runnable lambda child-Thread ");
         };
         Thread thread = new Thread(runnableLambda);
         thread.start();
         System.out.println("main thread");
         */
        /**
         //more concise code
         Thread thread = new Thread(()->
         System.out.println("Runnable lambda child-Thread "));
         thread.start();
         System.out.println("main thread");
         */
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80);

        /** //Iteration
         //external Iteration - familiar loop
         for (int i=0;i<list.size();i++){
         System.out.println(list.get(i));
         }
         System.out.println();
         //for-each  - external Iteration
         for (Integer i: list) {
         System.out.println(i);
         }*/

        /**internal Iterator*/
        //anonymous ic
        Consumer consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        Consumer<List<Integer>> listConsumer = new Consumer<List<Integer>>() {
            @Override
            public void accept(List<Integer> integers) {
                for (Integer i :
                        integers) {
                    System.out.println(i);
                }
            }
        };

        consumer.accept(10);
        listConsumer.accept(list);
        /*list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {

            }
        });*/
    }
}
