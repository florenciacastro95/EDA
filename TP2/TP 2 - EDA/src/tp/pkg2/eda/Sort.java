package tp.pkg2.eda;

import java.util.Random;

public class Sort {

    public static int[] carga(int cantidadNumeros) {
        // Crear un arreglo para almacenar los números aleatorios
        int[] numerosAleatorios = new int[cantidadNumeros];
        
        // Crear un objeto Random para generar los números aleatorios
        Random random = new Random();
        
        // Generar y cargar los números aleatorios en el arreglo
        for (int i = 0; i < cantidadNumeros; i++) {
            numerosAleatorios[i] = random.nextInt(10); // Genera números aleatorios en todo el rango de int
        }
        
        // Devolver el arreglo cargado con números aleatorios
        return numerosAleatorios;
    }
    
     public static void mostrar(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%6d ", numeros[i]); // Ajustar el ancho del campo a 12 para que se muestren en columnas
            if ((i + 1) % 15 == 0) { // Nueva línea cada 15 números
                System.out.println();
            }
        }
    }
    public static void bubbleSort(int arreglo[], int tamaño) {
        int i, j, temp; // Variable temp para el intercambio
        boolean cambio;
        for (i = (tamaño - 1); i >= 0; i--) {
            cambio=false;
            for (j = 1; j <= i; j++) {
                if (arreglo[j - 1] > arreglo[j]) {
                    temp = arreglo[j - 1];
                    arreglo[j - 1] = arreglo[j];
                    arreglo[j] = temp;
                    cambio=true;
                }
            }
           if(cambio==false)
               break;
            
        }
    }
    
    //metodo para añadir una busqueda
    public static void insertionSort(int[] arreglo) {
        int ult = arreglo.length;
        for (int i = 1; i < ult; ++i) {
            int temp = arreglo[i];
            int j = i;
            while (j > 0 && arreglo[j-1] > temp) {
                arreglo[j] = arreglo[j-1];
                j = j - 1;
            }
            arreglo[j] = temp;
        }
    }
    
//shell sort, demasiado pro para mi gusto    

//    public static void shellSort(int[] arreglo) {
//        int tam = arreglo.length;
//
//        // Inicializar el intervalo de la brecha
//        for (int gap = tam/2; gap > 0; gap /= 2) {
//            // Realizar el ordenamiento de inserción para la brecha actual
//            for (int i = gap; i < tam; i++) {
//                int temp = arreglo[i];
//                int j=i;
//                while(j >= gap && arreglo[j - gap] > temp) {
//                    arreglo[j] = arreglo[j - gap];
//                    j -= gap;
//                }
//                arreglo[j] = temp;
//            }
//        }
//    }
    
    
    //Shellsort final
    public static void shellSort(int[] arreglo) {
        int n = arreglo.length;
        int brecha = n / 2;
        int actual;
        int ind;
        while (brecha > 0) {
            for (int r = brecha; r < n; r++) {
                actual = arreglo[r];
                ind = r;
                while (ind >= brecha && arreglo[ind - brecha] > actual) {
                    arreglo[ind] = arreglo[ind - brecha];
                    ind -= brecha;
                }
                arreglo[ind] = actual;
            }
            brecha = brecha / 2;
        }

    }
    
    //Bucket sort 
    public static int[] bucketSort(int[]arr){
    
        int max=arr[0];
        int j=0;
        int[]arrInd;
        int[]arr2=new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        arrInd= new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            arrInd[arr[i]]+=1;
        }
        
        for (int i = 0; i < arrInd.length; i++) {
            while (arrInd[i]>0){
                arr2[j]=i;
                j++;
                arrInd[i]-=1;
            } 
        }
        arr=arr2;
        
        return arr2;
    }
}

