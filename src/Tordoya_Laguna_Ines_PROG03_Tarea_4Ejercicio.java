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
 * Realiza un programa que pida el día, mes y año como números enteros de una fecha correcta y muestre la fecha del día siguiente, suponiendo que cada mes tiene
 *un número distinto de días (suponer que febrero tiene siempre 28 días).
 */
public class Tordoya_Laguna_Ines_PROG03_Tarea_4Ejercicio 
{
    public static void main (String [] args)
        {
        Scanner teclado = new Scanner (System.in);
        //Colocaremos las variables a utilizar
        int dia, mes, anyo;
        
        //Le pediremos al usuario que introduzca un dia y leeremos la variable "dia"
        System.out.println ("Introduce el dia: ");
        dia = teclado.nextInt();
        
        //Le pediremos al usuario que introduzca un mes y leeremos la variable "mes"
        System.out.println ("Introduce el mes: ");
        mes = teclado.nextInt();
        
        //Le pediremos al usuario que introduzca el año y leeremos la variable "anyo"
        System.out.println ("Introduce el año: ");
        anyo = teclado.nextInt();
         
        //Con switch colocaremos 12 casos refieriendonos a los 12 meses del año
            switch(mes)
            {
                case 1:
                        //Si el "dia" es igual a 31 --> el "dia" pasara a ser 1 (del siguiente mes)e incrementaremos el mes y te mostrara la fecha siguiente  
                        //Sino y el dia es mayor a 32 --> te dira que tiene solo 31 dias 
                        //Si nada se cumple el "dia" se incrementara y te mostrara la fecha siguiente
                        if(dia == 31 )
                        {
                            dia=1;
                            mes++;
                            System.out.println ("La fecha de mañana sera " +dia+ "/" +mes+ "/" +anyo);
                        }
                        else if (dia>31)
                        {
                          System.out.println ("Enero solo tiene 31 dias ");          
                        }
                        else 
                        {
                            dia++;
                            System.out.println ("La fecha de mañana sera " +dia+ "/" +mes+ "/" +anyo);
                        }
                        break;
                case 2 :
                        //Si el dia es igual a 28 --> el dia sera igual a 1 y "mes" se incrementara 
                        //Sino el dia es mayor a 28 --> mostrara el error Febrero solo tiene 28 dias
                        //Si nada de lo anterior se cumple se incrementa el "dia" y te mostrara la fecha siguiente
                        if(dia == 28)
                        {
                            dia=1;
                            mes++;
                        }
                        else if (dia >28)
                        {
                            System.out.println ("Febrero solo tiene 28 dias ");  
                        }
                        else 
                        {
                            dia++;
                            System.out.println ("La fecha de mañana sera " +dia+ "/" +mes+ "/" +anyo);
                        }
                        break;
                 case 3 :
                        //Si el "dia" es igual a 31 --> el "dia" pasara a ser 1 (del siguiente mes)e incrementaremos el mes y te mostrara la fecha siguiente  
                        //Sino y el dia es mayor a 32 --> te dira que tiene solo 31 dias 
                        //Si nada se cumple el "dia" se incrementara y te mostrara la fecha siguiente
                        if(dia == 31 )
                        {
                            dia=1;
                            mes++;
                            System.out.println ("La fecha de mañana sera " +dia+ "/" +mes+ "/" +anyo);
                        }
                        else if (dia>31)
                        {
                          System.out.println ("Marzo solo tiene 31 dias ");          
                        }
                        else 
                        {
                            dia++;
                            System.out.println ("La fecha de mañana sera " +dia+ "/" +mes+ "/" +anyo);
                        }
                       break;
                case 4 :
                        //Si el dia es igual a 30 --> el dia sera igual a 1 y "mes" se incrementara y te mostrara la fecha siguiente
                        //Si no el dia es mayor a 30 se mostrara el error Abril tiene 30 dias 
                        //Si nada de lo anterior se se incrementara el "dia" y te mostrara la fecha siguiente
                        if(dia == 30)
                        {
                            dia=1;
                            mes++;
                            System.out.println ("La fecha de mañana sera " +dia+ "/" +mes+ "/" +anyo);
                        }
                        else if( dia > 30) 
                        {
                            System.out.println ("Abril solo tiene 30 dias ");
                        }
                        else 
                        {
                            dia++;
                        System.out.println ("La fecha de mañana sera " +dia+ "/" +mes+ "/" +anyo); 
                        }
                       break;
                case 5:
                        //Si el "dia" es igual a 31 --> el "dia" pasara a ser 1 (del siguiente mes)e incrementaremos el mes y te mostrara la fecha siguiente  
                        //Sino y el dia es mayor a 32 --> te dira que tiene solo 31 dias 
                        //Si nada se cumple el "dia" se incrementara y te mostrara la fecha siguiente
                        if(dia == 31 )
                        {
                            dia=1;
                            mes++;
                            System.out.println ("La fecha de mañana sera " +dia+ "/" +mes+ "/" +anyo);
                        }
                        else if (dia>31)
                        {
                          System.out.println ("Mayo solo tiene 31 dias ");          
                        }
                        else 
                        {
                            dia++;
                            System.out.println ("La fecha de mañana sera " +dia+ "/" +mes+ "/" +anyo);
                        }
                         break;
                 case 6 :
                        //Si el dia es igual a 30 --> el dia sera igual a 1 y "mes" se incrementara y te mostrara la fecha siguiente
                        //Sino dia es mayor a 30 ostrara el error junio tiene 30 dias
                        //Si nada de lo anterior se cumple se incrementara el "dia" y te dira la fecha siguiente
                        if(dia == 30)
                        {
                            dia=1;
                            mes++;
                        System.out.println ("La fecha de mañana sera " +dia+ "/" +mes+ "/" +anyo);
                        }
                        else if(dia> 30)
                        {
                            System.out.println ("Junio solo tiene 30 dias ");
                        }
                        else 
                        {
                         dia++; 
                        System.out.println ("La fecha de mañana sera " +dia+ "/" +mes+ "/" +anyo);
                        }
                        break;
                 case 7:
                        //Si el "dia" es igual a 31 --> el "dia" pasara a ser 1 (del siguiente mes)e incrementaremos el mes y te mostrara la fecha siguiente  
                        //Sino y el dia es mayor a 32 --> te dira que tiene solo 31 dias 
                        //Si nada se cumple el "dia" se incrementara y te mostrara la fecha siguiente
                        if(dia == 31 )
                        {
                            dia=1;
                            mes++;
                            System.out.println ("La fecha de mañana sera " +dia+ "/" +mes+ "/" +anyo);
                        }
                        else if (dia>31)
                        {
                          System.out.println ("Julio solo tiene 31 dias ");          
                        }
                        else 
                        {
                            dia++;
                            System.out.println ("La fecha de mañana sera " +dia+ "/" +mes+ "/" +anyo);
                        }
                        break;
                 case 8 :
                        //Si el "dia" es igual a 31 --> el "dia" pasara a ser 1 (del siguiente mes)e incrementaremos el mes y te mostrara la fecha siguiente  
                        //Sino y el dia es mayor a 32 --> te dira que tiene solo 31 dias 
                        //Si nada se cumple el "dia" se incrementara y te mostrara la fecha siguiente
                        if(dia == 31 )
                        {
                            dia=1;
                            mes++;
                            System.out.println ("La fecha de mañana sera " +dia+ "/" +mes+ "/" +anyo);
                        }
                        else if (dia>31)
                        {
                          System.out.println ("Agosto solo tiene 31 dias ");          
                        }
                        else 
                        {
                            dia++;
                            System.out.println ("La fecha de mañana sera " +dia+ "/" +mes+ "/" +anyo);
                        }
                         break;
                case 9 :
                        //Si el dia es igual a 30 --> el dia sera igual a 1 y "mes" se incrementara y te dira la fecha siguiente
                        //Sino el dia es m ayor a 30 mostrara el error Septiembre tiene 30 dias 
                        //Si nada de lo anterior se cumple se incrementara el "dia" y t edira la fecha siguiente
                        if(dia == 30)
                        {
                            dia=1;
                            mes++;
                            System.out.println ("La fecha de mañana sera " +dia+ "/" +mes+ "/" +anyo);
                        }
                        else if (dia >30)
                        {
                            System.out.println ("Septiembre solo tiene 30 dias ");
                        }
                        else 
                        {
                            dia++;  
                            System.out.println ("La fecha de mañana sera " +dia+ "/" +mes+ "/" +anyo);
                        }
                        break;
                 case 10 :
                       //Si el "dia" es igual a 31 --> el "dia" pasara a ser 1 (del siguiente mes)e incrementaremos el mes y te mostrara la fecha siguiente  
                        //Sino y el dia es mayor a 32 --> te dira que tiene solo 31 dias 
                        //Si nada se cumple el "dia" se incrementara y te mostrara la fecha siguiente
                        if(dia == 31 )
                        {
                            dia=1;
                            mes++;
                            System.out.println ("La fecha de mañana sera " +dia+ "/" +mes+ "/" +anyo);
                        }
                        else if (dia>31)
                        {
                          System.out.println ("Octubre solo tiene 31 dias ");          
                        }
                        else 
                        {
                            dia++;
                            System.out.println ("La fecha de mañana sera " +dia+ "/" +mes+ "/" +anyo);
                        }
                         break;
                 case 11 :
                        //Si el dia es igual a 30 --> el dia sera igual a 1 y "mes" se incrementara y te dira la fecha siguiente
                        //Sino el dia es m ayor a 30 mostrara el error Septiembre tiene 30 dias 
                        //Si nada de lo anterior se cumple se incrementara el "dia" y t edira la fecha siguiente
                        if(dia == 30)
                        {
                            dia=1;
                            mes++;
                            System.out.println ("La fecha de mañana sera " +dia+ "/" +mes+ "/" +anyo);
                        }
                        else if (dia >30)
                        {
                            System.out.println ("Noviembre solo tiene 30 dias ");
                        }
                        else 
                        {
                            dia++;  
                            System.out.println ("La fecha de mañana sera " +dia+ "/" +mes+ "/" +anyo);
                        }
                        break;
                       case 12 :
                            //Si el "dia" es igual a 31 --> el "dia" pasara a ser 1 (del siguiente mes)y el "mes" pasara a ser 1,incrementaremos el año y te mostrara la fecha siguiente  
                        //Sino y el dia es mayor a 32 --> te dira que tiene solo 31 dias 
                        //Si nada se cumple el "dia" se incrementara y te mostrara la fecha siguiente
                        if(dia == 31 )
                        {
                            dia=1;
                            mes=1;
                            anyo++;
                            System.out.println ("La fecha de mañana sera " +dia+ "/" +mes+ "/" +anyo);
                        }
                        else if (dia>31)
                        {
                          System.out.println ("Octubre solo tiene 31 dias ");          
                        }
                        else 
                        {
                            dia++;
                            System.out.println ("La fecha de mañana sera " +dia+ "/" +mes+ "/" +anyo);
                        }
                       break;
                        // si ningun caso se cumpliera mostra el mensaje de "fecha es incorrecta"
                 default:System.out.println ("La fecha introducida es incorrecta");
            }
        }
}
