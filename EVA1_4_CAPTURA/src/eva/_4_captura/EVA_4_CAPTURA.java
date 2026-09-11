/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva._4_captura;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA_4_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SI VAMOS A USAR VARIABLES, SE TIENEN QUE "DECLARAR" ANTES DE USA 
        //DECLARAR --> CREAR LA VARIABLE PARA SU USO EN EL PROGRAMA 
        //TIPO_DATO NOMBRE_INDENTIFICADOR;
        //USAR NOMBRES SIGNIFICATIVOS --> DEBE DECIR QUE SE USA 
        String nombre;//declaracion de la variable
        System.out.println("captura el nombre:");
        //ENTRADA DE DATOS DEL TECLADO (JAVA)
        Scanner captu = new Scanner(System.in); //OTRA VARIABLE --> captu de tipo scanner 
        //CAPTURAR DEL TECLADO Y PONERLO EN LA VARIABLE NOMBRE 
        //ESCRIBIR EN LA VARIABLE (PONER VALOR ) ASIGNACION
        
        nombre = captu.nextLine();
        
        System.out.println(nombre); //USO DE LA VARIABLE -->LECTURA 
        
        
    }   
    
    
}
