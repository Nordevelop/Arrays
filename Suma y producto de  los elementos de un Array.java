package misClases;
import java.util.Arrays;
public class Main{
  public static void main(string[] args) {
    /*Author Nordevelop
		 * 
		 * <>[]
		 */
    int []arr = new int []{10,5,3,1};
    int sum = 0;
    int prod = 1;
    for (int i=0;i < arr.length;i++){
      sum = sum + arr[i];
      prod = prod * arr[i];
    }
    for(int n:arr) //for each
      System.out.println(n);
    System.out.println("La suma de los elementos del Array arr: " + sum);
    system.out.println("El producto de los elementos del Array arr: " + prod);
    
      }
}
