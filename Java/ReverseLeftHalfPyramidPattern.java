
import java.util.Scanner;

/*
 *                         * * * * * *
 *                           * * * * *
 *                             * * * *
 *                               * * *
 *                                 * *
 *                                   *
 */

public class ReverseLeftHalfPyramidPattern {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of pyramid : ");
    int size = scanner.nextInt();
    for(int i=1;i<=size;i++){
      for(int j=0;j<=i-1;j++){
        System.out.print("  ");
      }
      for(int j=1;j<=size-i+1;j++){
        System.out.print("* ");
      }
      System.out.println();
    }
    scanner.close();
  }
}
