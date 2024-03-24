
package tp.pkg2.eda;


public class TP2EDA {

    public static void main(String[] args) {
        int[]arreglo = Sort.carga(10);
        long startTime = System.currentTimeMillis();
        //BUBBLESORT
        System.out.println("BUBBLESORT");
        arreglo = Sort.carga(10);
       
        System.out.println("DESORDENADO");
        Sort.mostrar(arreglo);
        System.out.println("");
         System.out.println("ORDENADO");
        Sort.bubbleSort(arreglo, 10);
        Sort.mostrar(arreglo);
        System.out.println("");
        System.out.println("Tiempo utilizado:");
        System.out.println(System.currentTimeMillis()-startTime);
   /*    
        //INSERTIONSORT
        System.out.println("INSERTIONSORT");
        arreglo = Sort.carga(10);
        startTime = System.currentTimeMillis();
        Sort.insertionSort(arreglo);
        Sort.mostrar(arreglo);
        System.out.println("");
        System.out.println("Tiempo utilizado:");
        System.out.println(System.currentTimeMillis()-startTime);

        //SHELLSORT
        System.out.println("SHELLSORT");
        arreglo = Sort.carga(10);
        startTime = System.currentTimeMillis();
        Sort.shellSort(arreglo);
        Sort.mostrar(arreglo);
        System.out.println("");
        System.out.println("Tiempo utilizado:");
        System.out.println(System.currentTimeMillis()-startTime);
        */
        //BUCKETSORT
        System.out.println("BUCKETSORT");
        arreglo = Sort.carga(10);
        startTime = System.currentTimeMillis();

        Sort.mostrar(Sort.bucketSort(arreglo));
        System.out.println("");
        System.out.println("Tiempo utilizado:");
        System.out.println(System.currentTimeMillis()-startTime);
        
    }
    
}
