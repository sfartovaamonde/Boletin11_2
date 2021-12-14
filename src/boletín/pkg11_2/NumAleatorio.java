
package boletín.pkg11_2;
import java.util.Scanner;
import javax.swing.JOptionPane;
 
public class NumAleatorio {
    
    
    
    
    
    public void amosarNumAle(){
        
        Scanner sc = new Scanner(System.in);
        
        

        
        //declaramos e inicializamos el número aleatorio, el número que introducirá el jugador 2 y el número máximo de intentos
    int numAl=(int) ((Math.random() * 10)+1); // Número aleatorio de 1 a 10
    int num2;
    int num3;
    int distancia;
   
    //creo el método scanner para introducir por teclado el número máximo de intentos y el número secreto
  
        System.out.println("El juego consiste en adivinar un número entre el 1 y el 10");
      
        System.out.println("introduce el número máximo de intentos");
       num3=sc.nextInt();
       
        System.out.println("El número máximo de intentos son: "+ num3);
        
       
       
        //inicializo y declaro el contador intentos
        int intentos=0;
        // utilizo una estructura con for, ya que sabemos el número de veces como máximo que se repetirá el bucle
        for (int contador=0; contador<num3; contador++ ){
           // le pedimos al jugador 2 que introduzca un número
            System.out.println(" Xogador 2, introduce un número");
            num2=sc.nextInt();
             distancia= Math.abs (numAl - num2);
            //utilizamos un if, si el número introducido por el jugador dos es distinto que el número secreto, sumamos un intento cada vez que introduzca el jugador un número que sea distitno del secreto
            if (num2!=numAl){
                
                intentos++;
                
                JOptionPane.showMessageDialog(null," No has acertado, inténtalo de nuevo, además has ralizado " + intentos + " intentos ");
                
           
                if (distancia>5)
                JOptionPane.showMessageDialog(null, " MOI LONXE");
            else if (distancia>5&&distancia<8)
                JOptionPane.showMessageDialog(null,"LONXE" );
            else if ( distancia>5&&distancia<4)
                JOptionPane.showMessageDialog(null,"PRETO" );
            else if ( distancia<=3)
                JOptionPane.showMessageDialog(null,"MOI PRETO" );
            }
             if (num2==numAl){
                JOptionPane.showMessageDialog(null, " ENHORABUENA" + "\n" + " Has acertado realizando " + intentos + " intentos ");
                break;
            }

    }
    

    }
}

