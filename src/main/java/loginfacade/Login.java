/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginfacade;

//import java.util.Scanner;

/**
 *
 * @author Robinson Concha
 */
public class Login {
    private String email;
    private String password;
    String a,r;
    String operacion = null;
    
    
	public String getEmail() {
		
		return email;
	}
	public void setEmail(String email) {
		if(email.isEmpty()) {
			System.out.println("Campo Correo Vacio"); 
			
		}else {
		
		      this.email = email;
		}
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password.isEmpty()) {
			System.out.println("Campo password Vacio"); 
			
		}else {
		
		this.password = password;
	}
        }

        public Login(String oA,String oR, String pOperacion){
        this.a = oA;
        this.r = oR;
        this.operacion = pOperacion;
    }
    
    public String operacion(){
      //Scanner op= new Scanner(System.in);
     
      //String operacion = op.nextLine();
      
      String resultado = "";
      if(operacion.equals(a)) {
      Acceder is= new Acceder();
      resultado = "";
      }
      if(operacion.equals(r)){
          
        Registrar rg = new Registrar();
        resultado = "Ingresar datos de usuario";
      }
    return resultado;
}
}

    

