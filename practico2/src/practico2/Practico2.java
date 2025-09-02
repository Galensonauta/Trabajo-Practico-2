
package practico2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Practico2 {

    public static void main(String[] args) {
        
        
        System.out.println("Creando orni verde");
        OrniVerde santiago = new OrniVerde();
        
        System.out.println("Creando orni azul");
        OrniAzul blue = new OrniAzul();
        
        System.out.println("Creando orni azul2");
        OrniAzul blui = new OrniAzul();
        
        
        
        System.out.println("Santiago tocando la guitorgan");
        santiago.tocarGuitorgan();
        
        System.out.println("Blue nandando");
        blue.nadar();
        
        System.out.println("Blui nadando");
        blui.nadar();
        
        Castor[] hermanos = new Castor[3];
        
        
        try{
        hermanos[0] = santiago;
        hermanos[1] = blue;
        hermanos[2] = blui;
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error de indice");
        }finally{
            System.out.println("los aornitohermanos juntos al fin...");
        }
        
        List<OrniAzul> nadadores = new ArrayList<>();
        
        for(Castor aux : hermanos){
            if(aux instanceof OrniAzul){
                nadadores.add((OrniAzul)aux);
            }
        }
        
        Collections.sort(nadadores, new OrniAzul.compararPorPropulsion());
        
        System.out.println("Mostrando nadadores por propulsion");
        
        Iterator<OrniAzul> it = nadadores.iterator();
        while(it.hasNext()){
            OrniAzul aux = it.next();
            System.out.println(aux.nombre + " con propulsion " + aux.propulsion);
        }
        
        
        
    }
    
}
