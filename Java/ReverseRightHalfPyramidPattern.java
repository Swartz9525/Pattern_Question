
import java.util.Scanner;

/*
 *                * * * * *
 *                * * * *
 *                * * *
 *                * *
 *                *
 */
public class ReverseRightHalfPyramidPattern {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of pyramid : ");
    int size = scanner.nextInt();
    for (int i=1;i<=size;i++){
      for(int j=size-i+1;j>=1;j--){
        System.out.print("* ");
      }
      System.out.println();
    }
    scanner.close();
  }
}
