import java.util.Scanner;

public class programa3_operaciones_logicas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("\n--- Comparaciones ---");
        System.out.println(num1 + " > " + num2 + " ? " + (num1 > num2));
        System.out.println(num1 + " < " + num2 + " ? " + (num1 < num2));
        System.out.println(num1 + " == " + num2 + " ? " + (num1 == num2));

        System.out.println("\n--- Operadores lógicos ---");
        System.out.println("(" + num1 + " > 0) && (" + num2 + " > 0) ? " + ((num1 > 0) && (num2 > 0)));
        System.out.println("(" + num1 + " > 0) || (" + num2 + " > 0) ? " + ((num1 > 0) || (num2 > 0)));

        sc.close();
    }
}