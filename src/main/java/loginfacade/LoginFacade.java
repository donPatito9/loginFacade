/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginfacade;

//import java.util.Scanner;

import java.util.Scanner;


/**
 *
 * @author Robinson Concha
 */
public class LoginFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
         System.out.println("Bienvenido al sistema de ventas online");
         //System.out.println("Ingrese a o r");
         //Scanner op = new Scanner(System.in);
         //String operacion = op.nextLine();
        Acceder a = new Acceder();
        System.out.println(a);
        
        Registrar r = new Registrar();
        System.out.println(r);
        
        facadeEjemplo ej = new facadeEjemplo();
        ej.usarFacadeParaAccederORegistrar("","","");
    }
    }
    
