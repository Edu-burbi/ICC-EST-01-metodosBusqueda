
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();
        
        int[] arreglo = {10,20,30,40,50,60,70,80,90,100};
        metodosBusqueda.printArreglo(arreglo);  
        int valorBuscado=100;

        int posicion = metodosBusqueda.busquedaSecuencial(arreglo,valorBuscado);
        if(posicion != -1){
            System.out.println("El valor " + valorBuscado + " se encuentra en la posicion: " + posicion);
        }else{
            System.out.println("El valor " + valorBuscado +  " no se encuentra en el arreglo");
        }

        System.out.print("Ingrese un número para buscar en el rango 0 a 100000: ");
        int numero = scanner.nextInt();

        int resultado = metodosBusqueda.buscarEnRango(numero);
        if (resultado != -1) {
            System.out.println("El número " + numero + " está dentro del rango.");
        } else {
            System.out.println("El número " + numero + " no se encontró en el rango.");
        }

        
    }
}
     
    

