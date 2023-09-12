/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugadores;
/**
 *
 * @author salon2
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jugadores J2=new Jugadores("Maria", "1313999", 27, 5);
        String num;
        num= J2.cedulaImpar();
        System.out.println(num);
        }
    
    }
    

