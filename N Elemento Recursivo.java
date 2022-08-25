package misClases;

import java.util.Arrays;

public class Main {
   public static void main (String[]args) {
     /*Encontrar ubicacion dentro de un Array 
     *Con Recursividad
     *Author Nordevelop
     */
     int [] arr = {1,3,4,5,7,8,9,11,17};
     int poselemdado = poselementorecursivo(arr, elementoBuscar,0);
     int poselemdado = 11;
     System.out.println("elemento a buscar: "); 
     System.out.println(elementoBuscar);
     System.out.println("elemento encontrado en el subindice: "); 
     System.out.println(poselemdado);
      public static int poselementorecursivo (poselemdado(int [] arr, (elementoBuscar, int indice){
         if (indice == arr.length || arr[indice] == elementoBuscar){
             if (indice == arr.length){
                return -1;
             }
             else {
                return indice; 
             }
             else{
                return poselementorecursivo(arr,elementoBuscar, indice+1)
             }
            
         }
      
    }
   
}
