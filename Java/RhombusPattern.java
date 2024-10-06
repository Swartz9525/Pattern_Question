/*
 *               * * * * * *
 *             * * * * * *
 *           * * * * * *
 *         * * * * * *
 *       * * * * * *
 *     * * * * * *
 */

 import java.util.*;

public class RhombusPattern {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of Rhombus : ");
    int size = scanner.nextInt();
    for(int i=1;i<=size;i++){
      for (int j=size-i;j>=1;j--){
        System.out.print("  ");
      }
      for(int k=1;k<=size;k++){
        System.out.print("* ");
      }
      System.out.println();
    }
    scanner.close();
  }
}
