package ejercicio1;
import java.util.*;

public class LecturaNumeros {
    
    Scanner sc = new Scanner(System.in);
    public void Numeros(){
        System.out.print("Ingresar numero: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Ingresa otro numero: ");
        double num2 = sc.nextDouble();
      /*  
        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextInt();
        **/
        if(num1>num2){
            System.out.println("El numero mayor es: " + num1);
        }else{
            System.out.println("El numero mayor es" + num2);
        }
        
        double mayor;
        if(num1>num2){
            mayor = num1;
        }else{
            mayor = num2;
        }
        
        double raiz = Math.cbrt(mayor);
        System.out.println("El numero mayor es: " + mayor );
        System.out.println("La raiz cuadrada del numero anterior es: "+ raiz);
    }
}

