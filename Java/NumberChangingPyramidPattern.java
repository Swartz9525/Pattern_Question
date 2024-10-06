/*
 *       1
 *       2 3
 *       4 5 6
 *       7 8 9 10
 *       11 12 13 14 15
 */

import java.util.*;
public class NumberChangingPyramidPattern {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of pyramid : ");
    int size = scanner.nextInt();
    int count = 1;
    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(count + " ");
        count++;
      }
      System.out.println();
    }
    scanner.close();
  }
}