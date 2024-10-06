
import java.util.Scanner;

/*
 *                        1 2 3 4 5 6
 *                         2 3 4 5 6
 *                          3 4 5 6
 *                           4 5 6
 *                            5 6
 *                             6
 */

public class ReverseNumberTrianglePattern {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int row = scanner.nextInt();
    for(int i=1;i<=row;i++){
      for(int j=0;j<i;j++){
        System.out.print(" ");
      }
      for(int j=0;j<=row-i;j++){
        System.out.print((j+i)+" ");
      }
      System.out.println();
    }
    scanner.close();
  }
}
