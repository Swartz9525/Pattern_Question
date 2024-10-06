/*
 *      1
 *      0 1
 *      1 0 1
 *      0 1 0 1
 *      1 0 1 0 1
 */

import java.util.*;
public class ZeroOneTrianglePattern {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of pyramid : ");
    int size = scanner.nextInt();
    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= i; j++) {
        if((i+j)%2==0) System.out.print("1 ");
        else System.out.print("0 ");
      }
      System.out.println();
    }
    scanner.close();
  }
}