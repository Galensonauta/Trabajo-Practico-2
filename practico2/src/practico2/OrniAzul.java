
package practico2;

import java.util.Scanner;

public class OrniAzul extends Castor {
    
    Scanner leer = new Scanner(System.in);
    
    protected double propulsion;
     
    public OrniAzul(){
        super();
        System.out.println("Ingerse propulsion de 5 a 10");
        this.propulsion = leer.nextDouble();
    }
    
    public void nadar(){
        System.out.println("Velocidad" + (this.velocidad + this.propulsion));
    }
    
    
     

    
  
}
