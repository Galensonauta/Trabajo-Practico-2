
package practico2;

import java.util.Comparator;
import java.util.Scanner;

public class OrniAzul extends Castor {
    
    Scanner leer = new Scanner(System.in);
    
    protected int propulsion;
    protected String nombre;
     
    public OrniAzul(){
        super();

        System.out.println("Ingerse propulsion de 5 a 10");
        int aux = leer.nextInt();
        while(aux > 10 || aux < 5  ){
            System.out.println("Ingrese numero valido");
            aux = leer.nextInt();
        }   
        this.propulsion = aux;
        leer.nextLine();
        System.out.println("Ingrese nombre");
        this.nombre = leer.nextLine();
    }
    
    public void nadar(){
        System.out.println("Velocidad" + (this.velocidad + this.propulsion));
    }
    
    public static class compararPorPropulsion implements Comparator<OrniAzul>{

        @Override
        public int compare(OrniAzul t, OrniAzul t1) {
           return  t.propulsion - t1.propulsion;
        }
    
    }
    
        
    
     

    
  
}
