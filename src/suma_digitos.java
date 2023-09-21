import java.util.Scanner;
public class suma_digitos {
    public static void main(String[] args) {
        System.out.print("Sumaremos los dígitos del número que ingrese. ");
        System.out.print("Por favor, ingrese un número: ");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();

        int suma = sumadigi(numero);

        System.out.println("La suma de los dígitos de " + numero + " es: " + suma);
    }

    public static int sumadigi(int numero) {
        int suma = 0;

        while (numero > 0) {
            int digito = numero % 10;
            suma += digito;
            numero /= 10;
        }

        return suma;
    }
}
