
package boletin31;

import java.util.Scanner;

public class Coche {   
    Scanner a= new Scanner(System.in);
    private int velocidade ;
   
    public Coche(){
    velocidade =0 ;
}
    public int getVelocidade(){
        this.velocidade=velocidade;
        System.out.println("a velocidade é"+velocidade);
        return velocidade;     
    }
    public void acelerar(){
        System.out.println("Inserte cánto acelera o coche");
        int valor= a.nextInt();
        velocidade=velocidade+valor;
    }
    public void frenar(){
        System.out.println("Inserte canto frena o coche");
        int menos= a.nextInt();
        velocidade=velocidade-menos;
    }
}

//Engade a clase Coche os seguintes métodos :
//public int getVelocidade() . Este método devolve a velocidade actual
//public void acelerar (int valor) .Este método incrementa a velocidade na cantidade valor
//public void frenar (int menos).Este método diminue a velocidade na cantidade menos.
//Crea a clase Boletin 5.1 para comprobar que o programa se executa ben .dandolle os valores que precises.