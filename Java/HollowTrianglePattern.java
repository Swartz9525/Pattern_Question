
import java.util.Scanner;

/*
 *                                      *
 *                                     * *
 *                                    *   *
 *                                   *     *
 *                                  *       * 
 *                                 *         *
 *                                * * * * * * *
 */

public class HollowTrianglePattern {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the length of triangle");
    int length = scanner.nextInt();
    for (int i = 1; i <= length; i++) {
      for (int j = 1; j <= length-i; j++) {
        System.out.print(" ");
      }
      for(int j=1;j<=(2*i-1); j++){
        if(j==1 || i==length || j==(2*i-1)) System.out.print("*");
        else System.out.print(" ");
      }
      System.out.println();
    }
    scanner.close();

  }
}
