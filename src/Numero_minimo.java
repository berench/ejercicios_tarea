import java.util.Scanner;
public class Numero_minimo {

    public static void main(String[] args) {
        //Encontrar el mínimo de tres números/
        int num1;
        int num2;
        int num3;
        int comp;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer número, por favor.");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número, por favor.");
        num2 = teclado.nextInt();
        System.out.println("Ingrese el tercer número, por favor.");
        num3 = teclado.nextInt();
        System.out.println("Los números ingresados son: " + num1 + " - " + num2 + " - " + num3);
        System.out.println(("El número menor entre estos es:"));
        comp = Math.min(num1, num2);
        System.out.println(Math.min(comp, num3));
    }
}

