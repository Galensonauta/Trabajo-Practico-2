
package practico2;

import java.util.Random;
import java.util.Scanner;


public class Castor {
    
    Scanner leer = new Scanner(System.in);
    
    protected double cola;
    protected double velocidad;

    public Castor() {
        System.out.println("Ingrese longitud de cola");
        this.cola = leer.nextDouble();
        System.out.println("Ingrese velocidad de hasta  8kms");
        double aux = leer.nextDouble();
        while(aux  <= 0 || aux > 8){
            System.out.println("Ingrese valor valido ");
            aux = leer.nextDouble();
        }
        this.velocidad = aux;
        leer.nextLine();
    }
    
    public void nadar(){
        System.out.println("Velocidad: " + this.velocidad);
    }
    
    public void tocarGuitarra(){
        Random r = new Random();
        System.out.println("tocando la guitarra");
        for(int i = 0 ; i < 6 ; i++){
            int cuerda = r.nextInt(6) + 1;
            System.out.println("Cuerda" + cuerda);
        }
    }
    
}
