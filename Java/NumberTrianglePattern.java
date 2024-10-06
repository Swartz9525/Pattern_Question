/*
 *         1
 *        2 2
 *       3 3 3
 *      4 4 4 4
 *     5 5 5 5 5
 */

import java.util.*;
public class NumberTrianglePattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of pattern : ");
    int size = sc.nextInt();
    for (int i = 1; i <= size; i++) {
        for(int j=size-i;j>0;j--){
          System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
          System.out.print(i+" ");
        }
        System.out.println();
    }
    sc.close();
  }
}
