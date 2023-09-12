
package figurasgeometricas2;

import javax.swing.JOptionPane;

public class FigurasGeometricas2 {
    //Funciones
    public static void main(String[] args)
    {
        menu();  
    }
    
    public static void menu(){
        
        int r=0;
        int a,b;
        while (r!= 5){
            
        
         r=Integer.parseInt(JOptionPane.showInputDialog("Selecciona una figura\n" +
                 "(1) Cuadrado \n"+
                 "(2) Rectangulo \n"+
                 "(3) Triangulo \n" +
                 "(4) Circulo \n"+
                 "(5) Salir \n"));
                
          switch (r)
          {
              
              case 1:
                  a = Integer.parseInt(JOptionPane.showInputDialog("Indique un lado"));
                  Cuadrado(a);
                  break;
              case 2:
                  a = Integer.parseInt(JOptionPane.showInputDialog("Indique un lado"));
                  b = Integer.parseInt(JOptionPane.showInputDialog("Indique otro lado"));
                  Rectangulo(a,b);
                  break;
              case 3:
                  a = Integer.parseInt(JOptionPane.showInputDialog("Indique la base"));
                  b = Integer.parseInt(JOptionPane.showInputDialog("Indique la altura"));
                  Triangulo(a,b);
                  break;
              case 4:
                  a = Integer.parseInt(JOptionPane.showInputDialog("Indique el radio"));
                  Circulo(a);
                  break;
                  
           }
                  
              
          }
    }
    
    public static void Cuadrado(int a)
    {
        JOptionPane.showMessageDialog(null, "El area es " + a*a);
    }
    
    public static void Rectangulo(int a, int b)
    {
         JOptionPane.showMessageDialog(null, "El area es " + a*b);
    }
     
    public static void Circulo(int a)
    {
        final double PI = 3.1416;
        
        JOptionPane.showMessageDialog(null, "El area es " + (PI*Math.pow(a,2)));
    }
      
    public static void Triangulo(int a, int b)
    {
        JOptionPane.showMessageDialog(null, "El area es " + ((a*b)/2));
    }
    
    
}
