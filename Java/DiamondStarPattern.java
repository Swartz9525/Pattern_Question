/*
 *           *
 *          * *
 *         * * *
 *        * * * *
 *       * * * * *
 *        * * * *
 *         * * *
 *          * *
 *           *
 */

import java.util.*;
public class DiamondStarPattern {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of Diamond : ");
    int size = scanner.nextInt();
    for(int i=1; i <= size; i++){
      for(int j=size-i;j>=1;j--){
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++){
        System.out.print("* ");
      }
      System.out.println();
    }
    for(int i=1;i<size;i++){
      for(int j=1;j<=i;j++){
        System.out.print(" ");
      }
      for(int j=size-i;j>=1;j--){
        System.out.print("* ");
      }
      System.out.println();
    }
    scanner.close();
  }
}
