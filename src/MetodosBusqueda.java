class MetodosBusqueda {

    public int busquedaSecuencial(int[] arreglo, int valorBuscado){
        int posicion = -1;
        for ( int i=0; i<arreglo.length; i++){
            if (arreglo[i] == valorBuscado){
                posicion = i;

            }
        }
        return posicion;
    }
    public int busquedaBinaria(int[] arr, int value){
        int inicio=0;
        int fin=arr.length -1;

        while (inicio <= fin){
            int medio = inicio + (fin - inicio) / 2;

            if(arr[medio] == value){
                //Elemento encontrado
                return medio;
            }
            if(arr[medio] < value){
                inicio = medio +1; // Buscar en la mitad de la derecha
            }else{
                fin = medio -1; // Busccar en la mitad de la izquierda
            }
        }
        return -1;  
    }
    public void printArreglo(int[] arreglo){
        for (int elem : arreglo) 
    {
        System.out.println(elem + "");
    }                
    }

    public int buscarEnRango(int numero) {
        if (numero < 0 || numero > 100000) {
            System.out.println("Número fuera de rango (0 - 100000).");
            return -1;
        }

        long inicioTiempo = System.nanoTime(); 

        int resultado = -1;
        for (int i = 0; i <= 100000; i++) {
            if (i == numero) {
                resultado = i;
                break;
            }
        }

        long finTiempo = System.nanoTime(); 
        long tiempoTotal = finTiempo - inicioTiempo;

        System.out.println("Tiempo en buscar el número: " + tiempoTotal + " nanosegundos");

        return resultado;
    }
}

