/*
 *        1
 *        1 2
 *        1 2 3 
 *        1 2 3 4
 *        1 2 3 4 5
 */

import java.util.*;
public class NumberIncreasingPyramidPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of pyramid : ");
    int size = sc.nextInt();
    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}