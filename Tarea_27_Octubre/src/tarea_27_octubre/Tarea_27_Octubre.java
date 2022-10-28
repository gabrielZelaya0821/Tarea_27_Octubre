package tarea_27_octubre;
import java.util.Scanner;

public class Tarea_27_Octubre {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menu;
        System.out.println("Ingrese el número que desea ejecutar");
        System.out.println("(1) Números pares e impares (2) Triángulos y más triángulos (3) Anita lava la tina (4) Códigos secretos (5) Salir");
        menu = entrada.nextInt();
        while (menu <= 5) {            
            if (menu == 1) {
                System.out.println("¿Que número desea ingresar?");
                int n = entrada.nextInt();
                int par = 0;
                int impar = 0;
                String numPar = "";
                String numImpar = "";
                
                for (int i = 0; i <= n; i++) {
                    if (i % 2 == 0) {
                        numPar += i;
                        par ++;
                    } else {
                        numImpar += i;
                        impar ++;
                    }
                }
                System.out.println("Entre 0 y " + n + " existen " + par + " números pares y estos son: " + numPar);
                System.out.println("Entre 0 y " + n + " existen " + impar + " números impares y estos son: " + numImpar);
            } else if (menu == 2) {
                System.out.println("¿Qué desea dibujar?");
                System.out.println("(1) Triángulo rectángulo (2) Triángulo equilátero");
                int dibujo = entrada.nextInt();
                System.out.println("¿Qué altura desea su triángulo?");
                int altura = entrada.nextInt();
                switch (dibujo) {
                    case 1:
                        for (int i = altura; i != 0; i--) {
                            for (int j = i; j <= altura; j++ ) {
                               System.out.print("*"); 
                            }
                            System.out.println("");
                        }
                        break;
                    case 2:
                        System.out.println("No pude ing, me rindo :(");
                        break;
                }        
            } else if (menu == 3) {
                System.out.println("Ingrese una sola palabra:");   
                String palabra = entrada.next();             
                String palindroma = "";
                for (int i = 0 ;i < palabra.length(); i++){
                    char inversa = palabra.charAt(i);
                    palindroma = inversa + palindroma;
                }
                if (palabra.equalsIgnoreCase(palindroma)){
                    System.out.println(palabra + " es una palabra palíndroma");
                } else {
                    System.out.println(palabra + " no es una palabra palíndroma");
                }
            } else if (menu == 4) {
                System.out.println("Ingrese letras y números en el siguiente fomrato: NumeroLetranumeroLetra...");
                String palabra = entrada.next();
                int indice = 1, entero;
                String cadena;                

                for (int i = 0; i < palabra.length(); i+=2) {
                    char letra = palabra.charAt(i);
                    char numero = palabra.charAt(indice);
                    cadena = Character.toString(letra);
                    entero = Integer.parseInt(cadena);
                    System.out.print(letra);
                    for (int j = 0; j < entero; j++){
                        System.out.print(numero);
                    }
                    indice += 2;
                }  
                System.out.println("");
            } else {    
                System.out.println("Saliendo del menú");
                break;
            }
            System.out.println("(1) Números pares e impares (2) Triángulos y más triángulos (3) Anita lava la tina (4) Códigos secretos (5) Salir");
            menu = entrada.nextInt();
        }
        if (menu > 5) {
        System.out.println("Opción no es válida");
        }
    }
    
}
