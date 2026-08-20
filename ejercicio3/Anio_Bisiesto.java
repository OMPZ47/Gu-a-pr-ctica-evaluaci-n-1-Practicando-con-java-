package ejercicio3;
import java.util.*;

public class Anio_Bisiesto {
    
public void Mostrar_Anios() {
    Scanner ab = new Scanner(System.in);

    System.out.print("Ingrese un anio para determinar los anios bisiestos a partir del año ingresado: ");
    int anio = ab.nextInt();

    for (int i = anio; i < 2026; i++) {

        if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {
            System.out.println("Anio: " + i + " es Bisiesto");
        } else {
            System.out.println("Anio: " + i + " NO es Bisiesto");
        }
    }
}
}
