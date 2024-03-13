/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginfacade;

/**
 *
 * @author Robinson Concha
 */
public class facadeEjemplo {
     public void usarFacadeParaAccederORegistrar(String a, String r, String operacion){
         if(operacion.equals(a)){
             System.out.println("Se usa  para : iniciar sesion "+a);
         }if(operacion.equals(r)){
              System.out.println("Se usa  para : registrar usuario "+r);
         
         }

         Login log = new Login(a,r,operacion);
         System.out.println("operacion: " + log.operacion());
    }    

   
     }

