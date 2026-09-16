/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_temperatura2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_11_TEMPERATURA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double far, celsius, kelvin; //VARIABLES (IDENTIFICADORES VALIDOS)
       Scanner captu = new Scanner (System.in);
      
       //SOLICITAR LOS DATOS AL USUARIO
      System.out.println("Introduce la temperartura en centigrados:");   
      far = captu.nextDouble();
       
       //HACER EL CALCULO 
       celsius = ( far - 32) / 1.8; //CELSIUS    
       kelvin = (far - 32)*(5/9.0) + 273.15 ; //KELVIN     
       
       //OJO 5/9 DA 0, 5/9.0 DA 0.5
       
       //MOSTRAR RESULTADOS AL USUARIO 
       
       //MOSTAR RESULTADOS 
       System.out.println(far + "°F = " + celsius + "°C") ;
       System.out.println(far + "°F = " + kelvin + "°K") ;
       
       
    }
    
}