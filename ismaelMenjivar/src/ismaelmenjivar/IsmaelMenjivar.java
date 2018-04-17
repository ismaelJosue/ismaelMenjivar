
package ismaelmenjivar;

import javax.swing.JOptionPane;

public class IsmaelMenjivar {

    
     
    public static void main(String[] args) {
        
        /* Scanner leer =new Scanner(system.in);
        */
        int cantidad;
        int producto;
        double precio;
        double total;
        double iva;
        int opcion;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1) Agregar producto, precio y cantidad que lleva \n 2) calcular Total \n 3) Salir", "menu"));
           switch(opcion){
               case 1:
                      
                   cantidad=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la cantidad de productos precio y calcular el total"));
                    
                   for (int i=0; i<cantidad;i++)
                   producto=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese los productos con su precio y el total que lleva"));
                   break;
               case 2:
               
                   break;
        
        
        
        
       /* producto=char.parseChar(JOptionPane.showMessageDialog(null,"producto:"+));
        */
        
        
        }
        
                
            }
    
}
