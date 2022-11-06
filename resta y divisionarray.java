package misClases;
import java.util.Arrays;
public class Main{
  public static void main(string[] args) {
    /*Author Nordevelop
     * resta y division de los elementos de un Array
     */
    int []arr = new int []{18,15,12,9};
    int rest = 0;
    int division = 1;
    for (int i=0;i < arr.length;i++){
      rest = rest - arr[i];
      division = division / arr[i];
      sum = sum + arr[i];
      prod = prod * arr[i];
    }
    for(int n:arr) //for each
      System.out.println(n);
    System.out.println("la resta de los elementos del array es: " + rest);
    System.out.println("la division de los elementos del arrays es: " + division);
       }
  
}
