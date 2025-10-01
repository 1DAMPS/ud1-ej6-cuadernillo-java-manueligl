import java.util.Scanner;

public class ej04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número entero: ");
        int numero1 = sc.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        int numero2 = sc.nextInt();

        int suma = numero1 + numero2;

        sc.nextLine();

        System.out.println("El resultado es " + suma);
    }
}








