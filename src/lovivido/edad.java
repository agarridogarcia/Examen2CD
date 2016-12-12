
package lovivido;

import javax.swing.JOptionPane;


public class edad {
    private String nombre;
    
    
   public void calcularMeses(){
   int meses;
   int a=0;
   meses = (a*12);
   JOptionPane.showMessageDialog(null,  "Meses: "  +meses,"Numero de meses vividos de " +nombre,JOptionPane.INFORMATION_MESSAGE);
}
    
}
