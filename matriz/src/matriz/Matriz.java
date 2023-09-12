/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.io.IOException;

/**
 *
 * @author salon2
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       profesores p1= new profesores(); 
       profesores p2= new profesores();
       profesores p3= new profesores();
       System.out.println("Nombre: " + p1.setNombre()+" Apellido: " +p1.setApellido());
       p1=  new profesores("Pedro", "Perez");
       p2=  new profesores("Maria", "Matos");
       p3=  new profesores("Juan", "Casas");
       System.out.println("Nombre: " + p1.setNombre()+" Apellido: " +p1.setApellido());
       System.out.println("Nombre: " + p2.setNombre()+" Apellido: " +p2.setApellido());
       System.out.println("Nombre: " + p3.setNombre()+" Apellido: " +p3.setApellido());
        
       p1.CrearMateria();
       p2.CrearMateria();
       p3.CrearMateria();
    }

    private static boolean CrearMateria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
