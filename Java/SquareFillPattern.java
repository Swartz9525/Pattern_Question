/*
 *                      * * * * *
 *                      * * * * *
 *                      * * * * *
 *                      * * * * *
 *                      * * * * *
 */
import java.util.*;
public class SquareFillPattern {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the length of square : ");
    int lenght = scanner.nextInt();
    for (int i = 1; i <= lenght; i++) {
      for (int j = 1; j <= lenght; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    scanner.close();
  }
}
