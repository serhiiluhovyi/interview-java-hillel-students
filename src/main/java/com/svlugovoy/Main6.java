package com.svlugovoy;

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

    String res1 = doWork1();
    String res2 = doWork2();
    String res3 = doWork3();

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


