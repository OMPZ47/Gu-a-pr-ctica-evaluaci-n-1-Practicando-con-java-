package ejercicio3;
/*
    Cree un programa que solicite un rango de años e imprima en 
pantalla los años que son bisiestos dentro de ese rango establecido. 
¿Cómo saber si un año es bisiesto? 
➢ Todos los años bisiestos son divisibles entre 4. 
➢ Aquellos años que son divisibles entre 4, pero no entre 100, son 
bisiestos. 
➢ Los años que son divisibles entre 100, pero no entre 400, no son 
bisiestos. 
➢ Sin embargo, los años divisibles entre 100 y entre 400 sí que son 
bisiestos.
*/

public class Ejercicio3 {


    public static void main(String[] args) {
        Anio_Bisiesto abb = new Anio_Bisiesto();
        abb.Mostrar_Anios();
    }
    
}
