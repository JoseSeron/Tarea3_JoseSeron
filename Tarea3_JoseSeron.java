
package tarea3_joseseron;

import java.util.Scanner;

/**
 *
 * @author Jose Seron
 */
public class Tarea3_JoseSeron {

    public static void main(String[] args) {
        /*
        Tarea 3
        Jose Roberto Seron 12321088
        Ejercicios:
        -Veamos si podemos formar la palabra
        -Numeros primero
        -Ordenar alfabeticamente
        -Codificar cadenas
        -Jugando con arreglos
        */
        
        //while menu principal
        
        Scanner entrada = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);
        int i=1, menuPrincipal;
        
        System.out.println("Bienvenida a mi Tarea 3");
        System.out.println("Por favor, escoja una opcion: ");
        System.out.println("1 --> Veamos si podemos formar la palabra");
        System.out.println("2 --> Numeros Primero");
        System.out.println("3 --> Ordenar Alfabeticamente");
        System.out.println("4 --> Codificar Cadenas");
        System.out.println("5 --> Jugando con arreglos");
        System.out.println("6 --> Finalizar programa :(");
        menuPrincipal = entrada.nextInt();

        while (i != 0) {
            //switch menu principal-escoger ejercicio o salir
            switch (menuPrincipal) {
                case 1: 
//veamos si podemos formar palabras
/**Deberá desarrollar un programa que reciba dos cadenas de tamaños diferentes y evalué si la cadena
*de longitud más pequeña se puede formar con las letras de la cadena de longitud más grande.
*Las cadenas no se ingresan en ningún orden, puedo ingresar la cadena larga primero o de ultimo.
*Su programa deberá determinar que cadena es mas larga
**/
                    String cadena0 = "",
                     cadena1 = "";


                    System.out.println("Ingrese la primera cadena: ");
                    cadena0 = entrada1.nextLine();
                    System.out.println("Ingrese la segunda cadena: ");
                    cadena1 = entrada1.nextLine();
                    
                    String cadena0LC=cadena0.toLowerCase();
                    String cadena1LC=cadena1.toLowerCase();
                    

                            //if para verificar que la cadena mas larga este en el puesto correcto de operaciones
                    if (cadena0LC.length() >= cadena1LC.length()) {
                        boolean todasLetrasEncontradas = true;
                        for (int j = 0; j < cadena1LC.length(); j++) {
                            char letraABuscar = cadena1LC.charAt(j);
                            boolean letraEncontrada = false;
                            //j++
                            for (int k = 0; k < cadena0LC.length(); k++) {
                                if (letraABuscar == cadena0LC.charAt(k)) {
                                    letraEncontrada = true;
                                    break;

                                }
                            }

                            if (!letraEncontrada) {
                                todasLetrasEncontradas = false;
                                break;

                            }
                        }

                        if (todasLetrasEncontradas == true) {
                            System.out.println("Si se puede armar " + cadena1 + " de " + cadena0);

                        } else {
                            System.out.println("No se puede armar " + cadena1 + " de " + cadena0);
                        }
                        System.out.println("");

                    } else{           //(cadena1.length() > cadena0.length()) 

                        boolean todasLetrasEncontradas = true;
                        for (int j = 0; j < cadena0LC.length(); j++) {
                            char letraABuscar = cadena0LC.charAt(j);
                            boolean letraEncontrada = false;
                            //j++
                            for (int k = 0; k < cadena1LC.length(); k++) {
                                if (letraABuscar == cadena1LC.charAt(k)) {
                                    letraEncontrada = true;
                                    break;

                                }
                            }

                            if (!letraEncontrada) {
                                todasLetrasEncontradas = false;
                                break;

                            }
                        }

                        if (todasLetrasEncontradas == true) {
                            System.out.println("Si se puede armar " + cadena0 + " de " + cadena1);

                        } else {
                            System.out.println("No se puede armar " + cadena0 + " de " + cadena1);
                        }
                        System.out.println("");
                        
                    }//fin else if

                    break;
                case 2: //Numeros Primero
                    
/*
Desarrolle un programa que recibe una cadena de números y letras 
y que ordene colocando los numeros primero y después las letras.
Ejemplo:
Input: Laur122car
Output: 122Laurcar
*/
                    String cadena = "",
                     cadenaResultado = "",
                     resultadonum = "",
                     resultadolet = "";

                    System.out.println("Ingrese una cadena que desee ordenar: ");
                    cadena = entrada1.next();

                    for (int j = 0; j < cadena.length(); j++) {
                        char charActual = cadena.charAt(j);

                        
                //  primera revision ---> charActual == '0' || charActual == '1' || charActual == '2' || charActual == '3' || charActual == '4' || charActual == '5' || charActual == '6' || charActual == '7' || charActual == '8' || charActual == '9'
                        if (charActual>=48 && charActual<=54) {  //usando la tabla ascii en lugar de cada comprobar cada caracter individual
                            resultadonum += charActual;                           

                        } else {
                            resultadolet += charActual;
                        }
                        //j++

                    }

                    String cadenaFinal = resultadonum + resultadolet;
                    System.out.println("La cadena ordenada es: " + cadenaFinal);

                    break;
                case 3://Ordenar Alfabeticamente
/*
Elabore un método que traiga de parámetro 1 cadena, su método debe ordenar los caracteres de la 
cadena en orden alfabético y deberá retornar un entero que corresponde a la cantidad de números que 
existen en la cadena. Pase a minúsculas la cadena.
Ejemplos Input: Ingenieria del Software 2
Output: aadeeeefgiiilnnorrstw 
Valor entero retornado : 1
Notas: 
 Puede utilizar .toLowerCase(). Prohibido utilizar isDigit()
 Pista: Recomiendo que utilicen la tabla ascii y que recorran la cadena las veces que sea 
necesario para ir ordenando alfabéticamente.
*/
                    System.out.println("Ingrese la cadena que desea ordenar alfabeticamente: ");
                    String cadenaAlf = entrada1.nextLine();
                    String cadenaOrdenada=ordAlf(cadenaAlf);
                    System.out.println("Cadena Ordenada: "+cadenaOrdenada);
                    contarNumeros(cadenaAlf);
                    System.out.println("");
                    break;
                case 4://Codificar Cadenas
/*Hacer un método para codificar la entrada de texto del usuario. La codificación se hará reemplazando 
las letras por números y números por letras El usuario solo debe poder ingresar números, letras o 
espacios. Al codificar, el método debe poder distinguir cuando el carácter es un número, es letra o 
espacio. Si es número, lo reemplaza por la letra equivalente (A = 1, B = 2, C = 3, etc.). Si es letra, lo 
reemplaza por el número equivalente (igual que el anterior). Si es espacio, no hace nada. (Usar un 
bloque switch aquí). Entre cada letra, se debe añadir un guión “-“ para distinguir números mayores que 
9.
Ejemplo: Reemplazar letras por números: 
Entrada: ana123 reunion 5 pm 
Salida: 1-14-1-A-B-C 18-5-21-14-9-15-14 E 16-13 
NOTA: Las letras se pueden convertir a su número equivalente restándole 96 al carácter, ver la tabla 
ascii para más información.*/
                    System.out.println("Ingrese el mensaje que desea codificar: ");
                    String mensaje = entrada1.nextLine();
                    
                    String cadenafinal =codificarCadena(mensaje);      
                    System.out.println("Salida "+cadenafinal);
                    break;
                case 5://Jugando con arreglos
/*Jugando con arreglos.
Crea un array de 10 posiciones de números con valores pedidos al usuario. Y luego muéstrelo en 
consola. Para esto cree dos métodos, uno para rellenar valores el arreglo y otro para imprimirlo.
                     */
                    System.out.println("Ingrese los valores del arreglo: ");
                    System.out.println("");
                    int[] numeros = leer();
                    imprimir(numeros);

                    System.out.println("");
                    System.out.println("");
                    System.out.println("Desea continuar? (0. NO  1. SI)");
                    int sino = entrada.nextInt();
                    if (sino==0) {
                        i=0;
                        
                    }
  
                    break;

                case 6: //salir
                    System.out.println("Gracias por usar mi programa <3");
                    i = 0;
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }

    }// fin main
    

    
    public static String codificarCadena(String cadena) {
    String cadenaCodificada = "";
    
    for (int i = 0; i < cadena.length(); i++) {
        char charActual = cadena.charAt(i);

        switch (charActual) {
            case ' ': // Espacio
                cadenaCodificada += " ";
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':            
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                int num = charActual - '0';
                cadenaCodificada += num + "-";
                break;
            default: // Letra
                if (charActual >= 'a' && charActual <= 'z') {
                    int posAlf = charActual - 'a' + 1;
                    cadenaCodificada += posAlf + "-";
                } else if (charActual >= 'A' && charActual <= 'Z') {
                    int posAlf = charActual - 'A' + 1;
                    cadenaCodificada += posAlf + "-";
                }
                break;
        }
    }

    
    return cadenaCodificada;
}


    public static String ordAlf (String cadena){
        
        String cadenaOrdenada="";//cadena es input, cadenaOrdenada es output
    
    String cadenaLC=cadena.toLowerCase();
    
        for (char i = 'a'; i < 'z'; i++) {
            for (int j = 0; j < cadenaLC.length(); j++) {
                if (cadenaLC.charAt(j)==i) {
                    cadenaOrdenada += i;                    
                }
            }
        }
    return cadenaOrdenada; 
    }
    
    public static void contarNumeros (String cadena){
    int cantNum=0;
    
    String cadenaLC=cadena.toLowerCase();
    
        // while (cadena.length()!=cadenaOrdenada.length()) {
        for (int i = 0; i < cadenaLC.length(); i++) {
            
            char charActual = cadenaLC.charAt(i);
            
            if (charActual >= 48 && charActual <= 57) {
                cantNum++;
            }
       
        }
         System.out.println("Valor entero retornado: "+cantNum);
         
    }

    public static int[] leer() {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        return arreglo;
    }

    public static void imprimir(int[] arreglo) {
        System.out.println("Numeros ingresados: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+" ");
        }

    }

}//fin clase
