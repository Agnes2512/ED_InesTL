/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Ines Tordoya Laguna alumno
 * 19/11/2021
 *  Realiza un programa que pida dos números y diga si uno es múltiplo del otro.
 */
public class Tordoya_Laguna_Ines_PROG03_Tarea_1Ejercicio 
{
     public static void main(String[] args) 
        {   
             Scanner entrada = new Scanner (System.in);
             // Creamos las variables a utilizar en nuestro programa
             int num1,num2;
        
            //Solicita un "primer numero" al usuraio y leemos el valor introducido "num1"
            System.out.println("Introduce el primer numero:");
            num1 = entrada.nextInt ();
       
            //Solicita un "segundo numero" al usuario y leemos el valor introducido "num2"
            System.out.println("introduce segundo numero");
            num2 = entrada.nextInt ();
        
        
            //Calcularemos si es multiplo el uno del otro
            
            //Creamos la primera condicion en esta si los numeros "num1 y num2" sonn diferentes de cero pasaran a otra condicion sino te dara "Error"
        
        
             if (num1 != 0 || num2 != 0)
        
             {
                //En esta condicion si el sobrante de "num1" entre "num2" es 0 --> El "num1" sera multiplo del "num2"
                //Sino se cumple lo anterior el sobrante de "num2" entre "num1" es 0 --> El "num2" sera multiplo de "num1"
                // Y si nada de lo anterior se cumple mostrara el mensaje "Los numeros introducidos no son multiplos el uno del otro
                //
                if (num1 % num2 == 0)
                
                {
          
                    System.out.println("el numero " + num1 + " es multiplo de " + num2 );
                
                }
               
                else if (num2 % num1 == 0)
                
                {
          
                    System.out.println("el numero " + num2 + " es multiplo de " + num1);
                
                }
                
                else 
                
                {
             
                    System.out.println("Los numeros introducidos no multiplos el uno del otro");   
                
                }
             }
            else 
        
            {
          
                System.out.println("Error, introducir otro numero");
            }
    
        }

}

    
   

