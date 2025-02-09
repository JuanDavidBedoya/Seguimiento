public class EjecucionPila {

    // Método recursivo para sumar los elementos de un arreglo
    public static int sumaRecursiva(int[] arreglo, int inicio, int fin) {
        // Caso base: si el arreglo tiene un solo elemento
        if (inicio == fin) {
            return arreglo[inicio];
        }
        
        // Dividir el arreglo en dos partes
        int medio = (inicio + fin) / 2;
        
        // Sumar las dos partes recursivamente
        int sumaIzquierda = sumaRecursiva(arreglo, inicio, medio);
        int sumaDerecha = sumaRecursiva(arreglo, medio + 1, fin);
        
        // Sumar los resultados de las dos partes
        return sumaIzquierda + sumaDerecha;
    }

    public static void main(String[] args) {
        // Arreglo de 6 números
        int[] arreglo = {1, 2, 3, 4, 5, 6};
        
        // Llamar al método recursivo
        int sumaTotal = sumaRecursiva(arreglo, 0, arreglo.length - 1);
        
        // Mostrar el resultado
        System.out.println("La suma de los números del arreglo es: " + sumaTotal);
    }
}
