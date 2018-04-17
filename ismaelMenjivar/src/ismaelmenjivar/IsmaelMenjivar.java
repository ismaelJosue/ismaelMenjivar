
package ismaelmenjivar;

import javax.swing.JOptionPane;

public class IsmaelMenjivar {

    
     
    public static void main(String[] args) {
        
        /* Scanner leer =new Scanner(system.in);
        */
        int cantidad;
        String producto;
        double precio;
        int total;
        double iva;
        int opcion;
        int cantidad1;
        
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1) Agregar producto, precio y cantidad que lleva \n 2) calcular Total \n 3) Salir", "menu"));
           switch(opcion){
               case 1:
                      
                   cantidad=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la cantidad de los productos , el nombre del producto y su precio "));
                    
                   for (int i=0; i<cantidad;i++)
                   producto=JOptionPane.showInputDialog(null,"ingrese los productos  que lleva");
                   precio=Double.parseDouble(JOptionPane.showInputDialog(null," Agregar precio"));
                   cantidad1=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese cuanto lleva"));
                   break;
               case 2:
              /* total=cantidad1*precio/0.13;
                   break;
                */   
               case 3:
                 
                   break;
        
        
        
       /* producto=char.parseChar(JOptionPane.showMessageDialog(null,"producto:"+));
        */
        
        
        }
        
                
            }
    
}
