
package lovivido;

import javax.swing.JOptionPane;


public class Edad {
    private String nombre;
     int dias;
     int a=1;
    
    
   public void calcularMeses(){
   int meses;
   
   meses = (a*12);
   JOptionPane.showMessageDialog(null,  "Meses: "  +meses,"Numero de meses vividos de " +nombre,JOptionPane.INFORMATION_MESSAGE);
}
   public void calcularDias (){
       dias = (a*365);
       JOptionPane.showMessageDialog(null, "Días: " +dias,"Numero de días vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);
      
       
   }
    
}
