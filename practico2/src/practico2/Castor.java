
package practico2;

import java.util.Random;


public class Castor {
    
    protected int cola;
    protected int velocidad;

    public Castor(int cola, int velocidad) {
        this.cola = cola;
        this.velocidad = velocidad;
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
