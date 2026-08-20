package ejercicio2;
import java.util.*;
public class Ejercicio2 {

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
