package app2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 29.11.2016.
 */

public class kras {
    public static void main(String[] args) {
      int x = 0;
      int []arr = {20};
      System.out.println(x + " " + arr[0]);
      int xer = f(x,arr);
      System.out.println(x + " " + arr[0]);
      System.out.println("xer = " + xer);
      g(x,arr);
      System.out.println(x + " " + arr[0]);
          }
  static int  f(int x, int arr []){
    x += 30;
    arr [0] = 40;
    return x;

  }
  static void g(int x, int arr []){
    x += 50;
    arr  = new int []{60};

  }
}

