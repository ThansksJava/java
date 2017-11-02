package com.jie.share;//: concurrency/EvenGenerator.java
// When threads collide.

import java.util.*;

public class EvenGenerator extends IntGenerator {
  private int currentEvenValue = 0;
  public  int next() {
    ++currentEvenValue; // Danger point here!
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    ++currentEvenValue;
    return currentEvenValue;
  }
  public static void main(String[] args) {
    // EvenChecker.test(new EvenGenerator());
    // Map<String,String> hashMap = new HashMap<>();
    // hashMap.put("2","1");
    // hashMap.put("1","4");
    // for(Map.Entry<String,String> entry:hashMap.entrySet()){
    //   System.out.println(entry.getKey()+"--->"+entry.getValue());
    //
    // }
    // System.out.println(hashMap);
/*    for(Map.Entry<String,String> entry:System.getenv().entrySet()){
      System.out.println(entry.getKey()+"--->"+entry.getValue());

    }*/
    // Collections.shuffle();
  }
} /* Output: (Sample)
Press Control-C to exit
89476993 not even!
89476993 not even!
*///:~
