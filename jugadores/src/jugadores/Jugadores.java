/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugadores;

import java.io.*;


/**
 *
 * @author salon2
 */
public class Jugadores {
    private String nombre;
    private String cedula;
    private int edad;
    private int jueces;
    private int resultados[];
    private static int cont;
    private String codigo;
    
    public Jugadores(){
        this.nombre="";
        this.cedula="";
        this.edad=0;
        this.codigo="";
        this.jueces=0;
        this.cont++;
    }
    public Jugadores(String nombre, String cedula, int edad, int jueces){
        this.nombre=nombre;
        this.cedula=cedula;
        this.edad=edad;
        this.jueces=jueces;
        this.cont++;
        this.resultados=new int[jueces];
    }
    public String cedulaImpar(){
        int Temp=Integer.parseInt(this.cedula);
        String num="";
        int res=0;
        int cont=0;
        
        while(Temp<0){
            res=Temp%10;
            if(res%2!=0 && cont<4){
                num+=res;
                cont++;
            }
            Temp/=10;
        }
        
        while(cont<4){
            num+=0;
            cont++;
        }
        
        return num;
    }
    
    
}
