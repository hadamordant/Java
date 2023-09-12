/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author salon2
 */
public class profesores {
    private String nombre, apellido;
    private String V[];
    public profesores(){
        nombre="";
        apellido="";
        V=new String[0];
       }  
    public profesores(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
        V=new String[0];
       }  
    public void getNombre(String nombre){
        this.nombre= nombre;
    }
    public String setNombre(){
        return (this.nombre);
    }
    public void getApellido(String apellido){
        this.apellido=apellido;
         }
    public String setApellido(){
        return (this.apellido);
    }
    
    
    public void CrearMateria()throws IOException{
        // TODO code application logic here
        BufferedReader en = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese numero de materias");
        int n= Integer.parseInt(en.readLine());
        String aux[]= new String[n];
         for(int i=0; i<aux.length; i++)
           {
               System.out.println("Ingrese el nombre de la materia: ");
               aux[i]=en.readLine();
               
           
    
        }
         this.V=aux;
    }
}