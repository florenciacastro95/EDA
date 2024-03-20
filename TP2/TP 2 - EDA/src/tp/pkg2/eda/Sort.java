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
            numerosAleatorios[i] = random.nextInt(10000); // Genera números aleatorios en todo el rango de int
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
    

}

