/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Ines Tordoya Laguna
 * 19/11/2021
 * Realiza un programa que pida un número entre 0 y 9.999 y diga si es capicúa. Recordad que podemos hacer uso de la operación módulo.
 */
public class Tordoya_Laguna_Ines_PROG03_Tarea_2Ejercicio 
{
  public static void main (String [] args)
        {
                 Scanner entrada = new Scanner (System.in);
        
                //Colocaremos las variables a utilizar con sus valores iniciales
                int numero,unidad,decena,centena,unidmillar;
     
                //Le pediremos al usuario por pantalla el mensaje "Introduzca un numero de 0 a 9.999"
                //Leeremos el valor de "numero"
                System.out.println ("Introduce un numero entre o y 9.999: ");
                numero= entrada.nextInt();
                
                
                //Le asignaremos las operaciones a realizar por cada variable luego de leer el numero
                //Unidad-->sera el resto del  numero entre 10 y el numero lo dividimos entre 10 para hallar las decenas
                     unidad=numero%10;
                     numero=numero/10;
                
                //Decena-->sera el resto del numero anterior entre 10, luego dividimos este entre 10 para hallar las centenas 
                    decena=numero%10;
                    numero =numero/10;
                
                //Centena-->sera el resto del numero anterior entre 10, luego dividimos este entre 10 para hallar las unidades de millar
                    centena=numero%10;
                    numero =numero/10; 
                    
                //Unidades de Millar-->sera el resto del numero anterior entre 10
                    
                    unidmillar=numero%10;
               
                //Procedemos a la condiciones pra saber si es capicua igual al derecho que al reves
                     //Si las "unidmillar" son iguales a la "unidad" y las "centena" son iguales a la "decena" es capicua(cuando son de 4 cifras)
                        if (unidmillar==unidad && centena==decena)
                         {
                             System.out.println ("El NUMERO ES CAPICUA");
                         }
                    
                    //Sino la "unidmillar" es igual a 0 y la "centena" es igual a la "unidad", (las decenas no las tomamos en cuenta ya que esta condicion es parra un numero de 3 cifras)
                        else if ( unidmillar==0 && centena==unidad )
                        {
                             System.out.println ("El NUMERO ES CAPICUA");
                        }
                    
                    // Sino las "unidmillar" y "centena" son igual a 0 y la "decena" es igual a la "unidad"(para numeros de dos cifras)
                        else if (unidmillar==0 && centena==0 && decena==unidad )
                        {
                             System.out.println ("El NUMERO ES CAPICUA");
                        }
                    
                    //Si nada de lo anterior se cumple el numero introducido no sera capicua
                        else
                        {
                  
                            System.out.println ("El numero no es capicua ");
                        }
             
        }
   
}  

