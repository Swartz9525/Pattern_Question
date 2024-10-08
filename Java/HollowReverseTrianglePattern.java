
import java.util.Scanner;

/*
 * 
 *                        ***********
 *                         *       *
 *                          *     *   
 *                           *   *
 *                            * *
 *                             *
 */
public class HollowReverseTrianglePattern {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the length of Triangle : ");
    int length = scanner.nextInt();
    for(int i=length;i>=1;i--){
      for(int j=1;j<=length-i;j++){
        System.out.print(" ");
      }
      for(int k=1;k<=2*i-1;k++){
        if(k==1 || i == length || k == 2*i-1 ){
          System.out.print("*");
        }else System.out.print(" ");
      }
      System.out.println();
    }
    scanner.close();
  }
}
