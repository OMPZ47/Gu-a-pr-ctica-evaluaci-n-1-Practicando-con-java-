package ejercicio2;
import java.util.*;
public class Ejercicio2 {
    /*
    Cree un programa que solicite 2 datos por teclado, estos serán el 
    usuario y contraseña, para este ejercicio solo se tienen 3 
    oportunidades para el ingreso de estas credenciales, al realizar las 3 
    oportunidades el programa se cerrará, debe considerar lo siguiente:  
    ➢ Debe validar que el contenido ingresado no este vacío.  
    ➢ Se sabe que las credenciales son:  
    Usuario: PROGRA3  
    Password: 123. 
    
    */

    public static void main(String[] args) {
        String usuario;
        String contra;
        int intento = 0;
        boolean acceder = false;
        
        Scanner dato = new Scanner(System.in);
        
        while(intento < 3 && acceder == false){
            System.out.println("ingrese usuario ");
            usuario= dato.nextLine();
            
            System.out.println("ingrese contrasenia ");
            contra = dato.nextLine();
            
            if (usuario.isEmpty()|| contra.isEmpty()) {
                System.out.println("los campos usuario/contrasenia no puede quedar vacio");
                
            } 
            else if(usuario.equals("PROGRA3") && contra.equals("123")){
                System.out.println("logueado :)");
                acceder = true;
                
            }
            else {
               intento++;
                System.out.println("usuario/contrasenia incorrecto ");
            }
            
        }
        
    }
    
}
