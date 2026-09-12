/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_captura_2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_5_CAPTURA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DECLARAMOS LAS VARIABLES
        String nombre;
        int edad;
        double salario;
                
        Scanner captu = new Scanner (System.in);
        //CAPTURA
        System.out.println("Captura el nombre del usuario:");
        nombre =captu.nextLine(); //LEE EL TEXTO 
        System.out.println("Captura la edad" );
        edad = captu.nextInt();
        System.out.println("Captura el salario");
        salario = captu.nextDouble();
        System.out.println("DATOS CAPRUTRADOS:");
        System.out.print("Nombre:");
        System.out.println(nombre);
        System.out.println("Edad:");
        System.out.print(edad);
        System.out.print("Salario:");
        System.out.println(salario);
        
        
        
        
              
    }
    
}
