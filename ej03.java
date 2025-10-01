import java.util.Scanner;
public class ej03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        sc.nextLine();

        System.out.println("Tienes " + edad + " años");
    }   
}
