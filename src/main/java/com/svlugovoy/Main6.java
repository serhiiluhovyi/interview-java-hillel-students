package com.svlugovoy;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;

public class Main6 {

  public static void main(String[] args) {

    Worker worker = new Worker();


    printAndCalcTime(worker::completeWork);


  }

  private static void printAndCalcTime(Supplier<String> supplier) {
    long start = System.nanoTime();
    String res = supplier.get();
    long finish = System.nanoTime();
    long delta = (finish - start) / 1_000_000;
    System.out.println(res + "   ===>   " + delta + " ms");
  }

}


class Worker {

  public String completeWork() {

//    String res1 = doWork1();
//    String res2 = doWork2();
//    String res3 = doWork3();

    ExecutorService es = Executors.newFixedThreadPool(2);
    Future<String> f1 = es.submit(() -> doWork1());
    Future<String> f2 = es.submit(() -> doWork2());

    String res3 = doWork3();
    String res1 = null;
    try {
      res1 = f1.get();
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }
    String res2 = null;
    try {
      res2 = f2.get();
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }

    es.shutdown();

//    CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() -> doWork1());
//    CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(() -> doWork2());
//    String res3 = doWork3();
//    String res1 = null;
//    try {
//      res1 = cf1.get();
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    } catch (ExecutionException e) {
//      e.printStackTrace();
//    }
//    String res2 = null;
//    try {
//      res2 = cf2.get();
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    } catch (ExecutionException e) {
//      e.printStackTrace();
//    }

    return res1 + res2 + res3;
  }


  private String doWork1() {
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return "Hello ";
  }

  private String doWork2() {
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return " Hillel ";
  }

  private String doWork3() {
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return " Students!";
  }


}


