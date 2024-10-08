
import java.util.Scanner;

/*
 *                           1 2 3 4 5 6
 *                            2 3 4 5 6
 *                             3 4 5 6
 *                              4 5 6
 *                               5 6
 *                                6
 *                               5 6
 *                              4 5 6
 *                             3 4 5 6
 *                            2 3 4 5 6
 *                           1 2 3 4 5 6
 */

public class MirrorImageTrianglePattern {
  public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {
          System.out.print("Enter the length of Triangle : ");
          int length = scanner.nextInt();
          for(int i=1; i<= length; i++){
              for(int j=0;j<i;j++){
                  System.out.print(" ");
              }
              for(int j =i;j<=length; j++){
                  System.out.print(j + " ");
              }
              System.out.println();
          }
          for(int i=length-1; i>=1;i--){
              for(int j=0; j<i; j++){
                  System.out.print(" ");
              }
              for(int j=i; j<=length; j++){
                  System.out.print(j + " ");
              }
              System.out.println();
          } }
  }
}
