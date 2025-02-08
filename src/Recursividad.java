public class Recursividad {

    // Método main para ejecutar el código 
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6};
        int resultado = sumaRecursiva(arreglo, 0, arreglo.length-1);
        System.out.println(resultado);
    }

    // Método recursivo que aplica la técinca divide y venceras
    private static int sumaRecursiva(int[] arreglo, int inicio, int fin) {
        // Caso base, cuando solo hay un elemento en el arreglo
        if (inicio == fin) {
            return arreglo[inicio];
        }

        // Encuentra el punto medio
        int medio = (inicio + fin) / 2;

        // Suma la parte izquierda y la parte derecha recursivamente
        int sumaIzquierda = sumaRecursiva(arreglo, inicio, medio);
        int sumaDerecha = sumaRecursiva(arreglo, medio + 1, fin);

        // Suma los resultados de cada mitad
        return sumaIzquierda + sumaDerecha;
    }
}
