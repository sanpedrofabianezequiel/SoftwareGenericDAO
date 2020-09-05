package com.curso.java.SoftwareMain;

import com.curso.java.entidades.Usuarios;
import com.curso.java.utilidades.MiGenerico;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        MiGenerico<String> miVariable = new MiGenerico<String>();	//Creacion e instanciacion
        
        miVariable.setDato("Hola");
        System.out.println(miVariable.getDato());
        
        MiGenerico<Usuarios> miVariable2=new MiGenerico<Usuarios>();
        miVariable2.setDato(new Usuarios("USER 1",	"123"));

        Usuarios userData=miVariable2.getDato();
        
        System.out.print(userData);
    }
}