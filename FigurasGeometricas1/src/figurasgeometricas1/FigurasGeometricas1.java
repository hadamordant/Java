
package figurasgeometricas1;

import javax.swing.JOptionPane;


public class FigurasGeometricas1
{
    //Lineal
    public static void main(String[] args)
    {
       int a,b;
       int menu=0;
       final double PI = 3.14;
      
      while(menu != 5)
      {
         menu=Integer.parseInt(JOptionPane.showInputDialog("Selecciona una figura\n" +
                 "(1) Cuadrado \n"+
                 "(2) Rectangulo \n"+
                 "(3) Triangulo \n" +
                 "(4) Circulo \n"+
                 "(5) Salir \n"));
                
          switch (menu){
              case 1:
                  a = Integer.parseInt(JOptionPane.showInputDialog("Indique un lado"));
                  JOptionPane.showMessageDialog(null, "El area es " + a*a);
                  break;
              case 2:
                  a = Integer.parseInt(JOptionPane.showInputDialog("Indique un lado"));
                  b = Integer.parseInt(JOptionPane.showInputDialog("Indique otro lado"));
                  JOptionPane.showMessageDialog(null, "El area es " + a*b);
                  break;
              case 3:
                  a = Integer.parseInt(JOptionPane.showInputDialog("Indique la base"));
                  b = Integer.parseInt(JOptionPane.showInputDialog("Indique la altura"));
                  JOptionPane.showMessageDialog(null, "El area es " + (float)(a*b)/2);
                  break;
              case 4:
                  a = Integer.parseInt(JOptionPane.showInputDialog("Indique el radio"));
                  JOptionPane.showMessageDialog(null, "El area es " + PI*Math.pow(a,2));
                  break;
          }
               
                      
                      
      }
     
    }
    
}
