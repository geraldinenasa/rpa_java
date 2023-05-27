package proyectopromocion23;

import java.util.Scanner;
import java.util.Random;

public class Proyectopromocion23
{  
    
    public static char colorAleatorio ()
    {         
        // R=rojo A=azul, ITERACION ENRTE R Y A 
        String alphabet = "RA";
        //ESTE RANDOM SE UTILIZA TANTO PARA LOS COLORES COMO PARA LOS NUMEROS
        Random r = new Random();
        //ACA TE DEVUELVE R O A 
        char color = alphabet.charAt(r.nextInt(alphabet.length()));
        return color;
    }
    
    public static boolean compararColor (char color1, char color2) 
    {
        boolean resultado;
        if (color1 == color2) {
            resultado = true;
        } else {
            resultado = false;
            }
        return(resultado);
    }
    
    public static int numeroAleatorio()
    {
        Random r = new Random();
        int numero = r.nextInt(100)+1;
        
        return numero;             
    }
    
    public static int valorTotal(int numero1,  int numero2) 
    {
        int suma;
        suma=(numero1+numero2);
        return suma;
    }
    
    public static void compararResultados(int suma1, int suma2, String nombreJugador1, String nombreJugador2) {
        if (suma1==suma2) 
            {
                System.out.println(nombreJugador1+" ha empatado con "+nombreJugador2);
            }
        else if (suma1>suma2)
            {
                System.out.println(nombreJugador1+" ha ganado contra "+nombreJugador2);  
            }
        else 
        {
                System.out.println(nombreJugador1+" ha perdido contra "+nombreJugador2);
        }
    }

    public static void main(String[] args) 
    {
        //DEFINO VARIABLES
        int numero1, numero2, numero3, numero4, suma1, suma2;
        char color1, color2, color3, color4;
        boolean resultadoColor1, resultadoColor2;
        String nombreJugador1, nombreJugador2;
        
        Scanner sc = new Scanner(System.in);
                
        //INGRESO NOMBRE DE LOS JUGADORES
        System.out.println("Por favor ingrese el nombre del Primer jugador");
        nombreJugador1 = sc.nextLine();
        System.out.println("Por favor ingrese el nombre del Segundo jugador");
        nombreJugador2 = sc.nextLine();
        
        //CADA JUGADOR TENDRA 2 TIRADAS POSIBLES
        System.out.println("Cada jugador tendrá dos tiradas posibles");
                
        //Primer Jugador
        System.out.println("El jugador "+nombreJugador1+" sera el primero en sacar");
        
        color1 = colorAleatorio();
        color2 = colorAleatorio();
        numero1 = numeroAleatorio();
        numero2 = numeroAleatorio();
        System.out.println("Resultados obtenidos: "+color1+"-"+numero1+" y "+color2+"-"+numero2);
        
        System.out.println("El jugador "+nombreJugador2+" sera el segundo en sacar");
       
        color3 = colorAleatorio();
        color4 = colorAleatorio();                
        numero3 = numeroAleatorio();
        numero4 = numeroAleatorio();
        System.out.println(color3+"-"+numero3+" y "+color4+"-"+numero4);
        
        resultadoColor1 = compararColor (color1,color2);
        resultadoColor2 = compararColor (color3,color4);
        
        if (resultadoColor1==true){
            suma1= valorTotal(numero1,numero2);
        }
        else {
            suma1=0;
        }
        
        if (resultadoColor2==true){
            suma2= valorTotal(numero3,numero4);
        }
        else {
            suma2=0;
        }
        
        compararResultados (suma1,suma2,nombreJugador1,nombreJugador2);

    }
}
