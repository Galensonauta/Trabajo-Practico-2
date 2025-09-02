
package practico2;

import java.util.Scanner;


public class OrniVerde extends Castor implements MamaPata {
    
    Scanner leer = new Scanner(System.in);
    
    protected String nombre;

    public OrniVerde() {
        super();

        System.out.println("Ingrese nombre");
        this.nombre = leer.nextLine();
    }

    @Override

    public void tocarOrgano() {
        System.out.println("Do-Re-Mi");
        leer.next();
        System.out.println("Fa-Sol-La-Si");

    }

    public void tocarGuitorgan(){
        System.out.println("Tocando el guitorgan");
        super.tocarGuitarra();
        tocarOrgano();
        System.out.println("cuac cuaac...!");
               
    }
    
    
    
    
    
}
