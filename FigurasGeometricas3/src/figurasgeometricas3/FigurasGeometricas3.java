
package figurasgeometricas3;

import javax.swing.JOptionPane;

public class FigurasGeometricas3 
{

    public static void main(String[] args)
    {
        Operaciones operar = new Operaciones();
        
        int menu = 0;
        
        while(menu != 5)
        {
         menu=Integer.parseInt(JOptionPane.showInputDialog("Selecciona una figura\n" +
                 "(1) Cuadrado \n"+
                 "(2) Rectangulo \n"+
                 "(3) Triangulo \n" +
                 "(4) Circulo \n"+
                 "(5) Salir \n"));
                
          switch (menu)
          {
              case 1:
                 operar.Cuadrado();
                 break;
              case 2:
                 operar.Rectangulo();
                 break;
              case 3:
                 operar.Triangulo();
                 break;
              case 4:
                 operar.Circulo();
                 break;
          }
        }
    }
}
    
