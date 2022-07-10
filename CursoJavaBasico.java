/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cursojavabasico;

/**
 *
 * @author ASUS
 */
public class CursoJavaBasico {

    public static void main(String[] args) {
        
//Hola mundo:
        System.out.println("\nHola mundo!!!");

// Tipos de datos --------------------------------------------------------------

        /** Tipos de datos primitivos: -----------------------------------------
         * Nombre:       Tipo:            Tamaño(bytes):       Valor con signo:     
         *  byte          Numérico         2  (8 bits)          -128 A 127
         *  short         Numérico         4  (16 bits)         -32,768 A 32,767
         *  int           Numérico         8  (32 bits)         -2'147'483,648 A 2'147'483,647
         *  long          Numérico         16 (64 bits)         -9'223'372'036'854'775,808 A 9'223'372'036'854'775,807
         *  float         Numérico         8  (32 bits)         coma (,) flotante de precisión simple norma IEEE 754
         *  double        Numérico         16 (64 bits)         coma (,) flotante de precisión doble norma IEEE 754
         *  char          Carácter         4  (16 bits)         unicode \u0000 A \uffff
         *  boolean       Caracteres       1/4 (1 bit)          true o false
         * 
         * Declaración de variables: 1) tipo de dato + 2) nombre de la variable (camelCase (ejemploNombreVariable) + 3) punto y coma (;).
         */
        
        byte numByte = 127; 
        short numShort = 1250;
        int numInt = -25871555;
        long numLong = -5644354681423434l;     // long lleva l 'ele' al final del número.
        float numFloat = 5.52078f;             // float lleva f 'efe' al final del número.
        double numDouble = 5.65368;
        char caracterUno = '?';
        boolean desicion = true;
        System.out.println("\n\tTipos de datos (ejemplos):");
        System.out.println("\nTipo byte: " + numByte + "\nTipo short: " + numShort + "\nTipo int: " + numInt + "\nTipo long: " + numLong + "\nTipo float: " + numFloat + "\nTipo double: " + numDouble + "\nTipo char: " + caracterUno + "\nTipo boolean: " + desicion);

    
        /** Tipos de datos estructurados: --------------------------------------
         * String (cadena de caracteres).
         * Array: arreglos o vectores.
         * Wrappers.
         */
        
        // String:  ------------------------------------------------------------
            // La clase String es una cadena de caracteres que cuenta con métodos de la clase String.
        String nombre = "Alan";
        String apellido = "Turin";
        String nombreCompleto;
        nombreCompleto = nombre + " " + apellido;
        System.out.println(nombreCompleto);
        String myNombre = "Yohan Rodríguez";
        System.out.println(nombreCompleto.equalsIgnoreCase(myNombre));
                
        // Array:  -------------------------------------------------------------
            // Objeto que contiene un número determinado de elememtos de un mismo tipo de variable.
            // El tamaño del array es definido cuando este se crea. Posteriormente no se puede cambiar el tamaño .
            //[1, 2, 5, 8, 54, 100]: cuenta con 6 elementos los indices del 0 al 5.
            // Declaración de un Array: 1) Tipo de dato de los elementos + 2) nombre del Array + 3) corchetes + 4) punto y coma (;).
        int arrayEjemplo [] = new int [5];
        String[] arrayEjemploDos = new String [5];
        String arrayEjemploTres [] = {"Amarillo", "Azul", "Rojo", "Blanco", "Negro"};
        arrayEjemplo[1] = 52;
        arrayEjemplo[3] = 300;       
            //Impresión arrayEjemplo:
        System.out.println("\n\tArray ejemplo:\n");
            for (int i=0; i<arrayEjemplo.length; i++){
            System.out.println("Arreglo arrayEjemplo indice " + i + " = " + arrayEjemplo[i]);
        } 
        
        // Matrices:  ----------------------------------------------------------
            // [][] = filas y columnas.
            // Declaración de una matriz: 1) Tipo de dato de los elementos + 2) nombre del vector + 3) pareja de corchetes + 4) punto y coma (;).
        int matrizUno[][] = new int [2][3];
        String matrizDos [][] = {{"Java", "Python", "Cobol"},{"C++", "Dart", "c#"}}; 
        int temp = 0;           
            // Impresión de matrizUno:
        System.out.println("\n\tMatriz uno:\n");
        for(int i = 0; i < matrizUno.length; i++){
            for(int j = 0; j < matrizUno[i].length; j++){
                matrizUno [i][j] = temp;
                if (j<matrizUno[i].length-1) System.out.print("Posición [" + i + "," + j + "] = " + matrizUno[i][j] + ";");    
                else System.out.print("Posición [" + i + "," + j + "] = " + matrizUno[i][j]);                        
                temp++;
            }   
            System.out.println("");
        }        
            // Impresión de matrizDos:
        System.out.println("\n\tMatriz dos:\n");
        for (int iterFila=0; iterFila<matrizDos.length; iterFila++){
            for (int iterCol=0; iterCol<matrizDos[iterFila].length; iterCol++) System.out.println(matrizDos[iterFila][iterCol]);     
        }

// Operadores en java ----------------------------------------------------------
        /** Tipos de operadores:
         * Tipo:                Sub Conjunto:           Precedencia:
         *  Aritméticos          Postfix                 (expr++,  expr--)
         *                       Unario                  (++expr,  --expr,  +expr,  -expr,  ~,  !)      
         *                       Multiplicativo          (*,  /,  %)
         *                       Aditivo                 (+,  -,  *,  /)
         *  Comparación          Shift                   (<<, >>, >>>)
         *                       Relacional (lógico)     (<,  >,  <=,  >=,  instanceof)
         *                       Igualdad (lógico)       (==,  !=)    
         *  Lógicos              Bitwise AND             ( & )
         *                       Bitwise exclusive OR    ( ^ )            
         *                       Bitwise inclusive OR    ( | )
         *                       AND lógico              ( && )
         *                       OR lógico               ( || )
         *                       Ternario                ( ?: )
         *  Asignación           Asignación              (=,  +=,  -=,  *=,  /=,  %=,  &=,  ^=,  |=,  <<=,  >>=,  >>>=)
         */
     

        
// Expresiones, sentencias, bloques y comentarios ------------------------------        



// Colecciones -----------------------------------------------------------------



// Ciclos y bucles -------------------------------------------------------------
    /** Ciclos      if
     *              else if
     *              switch    
     *  Bucles      for
     *              while
     *              do while
     */



// Excepciones -----------------------------------------------------------------



// Introducción a la OOP (Programacion orientada a objetos) --------------------
    /** Pilares de la OOP:
     *      Clases
     *          Atributos
     *              Encapsulamiento
     *          Constructor
     *          Métodos
     *              Set
     *              Get
     *          Objetos
     */

    
    
// Herencia --------------------------------------------------------------------



// Interfaces y calses abstractas ----------------------------------------------



// Poliformismo ----------------------------------------------------------------



// Archivo Json ----------------------------------------------------------------



// Lectura de archivos .csv, .pdf, .docx, ... ----------------------------------



// Interfaz gráfica ------------------------------------------------------------



// Bases de datos --------------------------------------------------------------
    
    }
}