
package figurasgeometricas3;

import javax.swing.JOptionPane;

public class Operaciones
{
    //Variables
    private double a;
    private double b;
    private double area;
    
    //Constructor
    public Operaciones()
    {
        
    this.a = 0;
    this.b = 0;
    this.area = 0;
    
    }
    
     public void Cuadrado()
    {
        a = Integer.parseInt(JOptionPane.showInputDialog("Indique un lado"));
        area = a*a;
        JOptionPane.showMessageDialog(null, "El area es " + area );
    }
    
    public void Rectangulo()
    {
        a = Integer.parseInt(JOptionPane.showInputDialog("Indique un lado"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Indique otro lado"));
        area = a*b;
        JOptionPane.showMessageDialog(null, "El area es " + area);
    }
     
    public void Circulo()
    {
        final double PI = 3.1416;
        a = Integer.parseInt(JOptionPane.showInputDialog("Indique el radio"));
        area=(PI*Math.pow(a,2));
        JOptionPane.showMessageDialog(null, "El area es " + area);
    }
      
    public void Triangulo()
    {
        a = Integer.parseInt(JOptionPane.showInputDialog("Indique la base"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Indique la altura"));
        area = (double)((a*b)/2);
        JOptionPane.showMessageDialog(null, "El area es " + area);
    }
}