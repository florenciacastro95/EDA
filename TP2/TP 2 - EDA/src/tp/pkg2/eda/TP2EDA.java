
package tp.pkg2.eda;


public class TP2EDA {

    public static void main(String[] args) {
        int[]arreglo = Sort.carga(10);
        
        System.out.println("BUBBLESORT");
        arreglo = Sort.carga(10000);
        long startTime = System.currentTimeMillis();
        Sort.bubbleSort(arreglo, 10000);
        Sort.mostrar(arreglo);
        System.out.println("");
        System.out.println("Tiempo utilizado:");
        System.out.println(System.currentTimeMillis()-startTime);
       
        System.out.println("INSERTIONSORT");
        arreglo = Sort.carga(10000);
        startTime = System.currentTimeMillis();
        Sort.insertionSort(arreglo);
        Sort.mostrar(arreglo);
        System.out.println("");
        System.out.println("Tiempo utilizado:");
        System.out.println(System.currentTimeMillis()-startTime);

        /*
        System.out.println("SHELLSORT");
        arreglo = Sort.carga(10000);
        startTime = System.currentTimeMillis();
        Sort.bubbleSort(arreglo, 10000);
        Sort.mostrar(arreglo);
        System.out.println("");
        System.out.println("Tiempo utilizado:");
        System.out.println(System.currentTimeMillis()-startTime);
        */
    }
    
}
