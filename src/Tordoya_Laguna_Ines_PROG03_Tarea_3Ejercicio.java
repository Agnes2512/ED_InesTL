/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author alumno Ines Tordoya
 * 19/11/2021
 * Realiza un programa que pida el día, mes y año como números enteros de una fecha correcta y muestre la fecha del día siguiente, suponiendo que todos los meses tienen 30 días.
 */
public class Tordoya_Laguna_Ines_PROG03_Tarea_3Ejercicio 
{
     public static void main (String [] args)
        
        {
            Scanner teclado = new Scanner (System.in);
           
            //introducimos las variables a utilizar en nuestro programa
            int dia, mes, anyo;
        
            //Mostramos el mensaje al usuario "Introduce el dia" y leemos el valor introducido por teclado "dia"
            System.out.println ("Introduce el dia: ");
                dia = teclado.nextInt();
            
            //Mostramos el mensaje al usuario "Introduce el mes" y leemos el valor introducido por teclado "mes"
            System.out.println ("Introduce el mes: ");
            mes = teclado.nextInt();
       
            //Mostramos el mensaje al usuario "Introduce el año" y leemos el valor introducido por teclado "anyo"
            System.out.println ("Introduce el año: ");
            anyo = teclado.nextInt();
        
            //Comenzamos con la condicion de el  dia introducido 
            //Si el dia es menor a 30 procede a la siguiente condidicion sino te pedira introducir otro dia
            
            
            if(dia<=30)
            {
                //Si el dia es igual a 30 el dia pasara a ser igual a 1 
                //Sino el dia se incrementara
                if (dia == 30) 
                {
                    dia = 1;
                    // Creamos otra condicion para el mes introducido
                    // si el mes es igual al 12 el mes pasara a ser igual a 1 
                    //sino el mes se incrementara
                        if (mes == 12)
                        {
                            mes = 1;
                        //Creamos otra condicion  para los anyo teniendo en cuenta que introduzca una fecha coreccta actual
                        // si el año es igual al 2021 el año pasara a ser igual a 1 
                        //sino el año se incrementara
                            if (anyo <= 2021)
                            {
                             
                                anyo = 1;
                            }
                            else
                            {
                                anyo++;
                            }
                        }
                        else 
                        {
                            mes++;
                        }
                }
                else 
                {
                    dia++;
                }
             //Esta sentencia nos mostrara el resultado del dia siguiente en pantalla de la fecha introducida
            System.out.println ("El dia de  mañana sera "+dia + "/"+ mes + "/" + anyo);
            
            }
            else
            {
                System.out.println ("El dia es incorrecto, introducir otro diferente");
            }
        
            
        }
}

