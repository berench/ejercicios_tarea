import java.util.Scanner;

public class numero_par {
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Determinaneremos si el número que usted escriba es PAR o IMPAR.");
        System.out.println("Por favor, escriba el número: ");
        num = teclado.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es PAR.");
        }else { System.out.println("El nùmero " + num + " es IMPAR.");

        }
    }
}
