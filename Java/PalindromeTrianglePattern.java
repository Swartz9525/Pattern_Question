/*
 *            1
 *          2 1 2
 *        3 2 1 2 3
 *      4 3 2 1 2 3 4
 *    5 4 3 2 1 2 3 4 5
 */

import java.util.*;

public class PalindromeTrianglePattern {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of palindrome : ");
    int size = scanner.nextInt();
    for (int i = 1; i <= size; i++) {
      for (int j = size - i; j >= 1; j--) {
        System.out.print("  ");
      }
      for (int j=i;j>=1;j--){
        System.out.print(j+" ");
      }
      for (int j=2;j<=i;j++){
        System.out.print(j+" ");
      }
      System.out.println();
    }
    scanner.close();       
  }
}
