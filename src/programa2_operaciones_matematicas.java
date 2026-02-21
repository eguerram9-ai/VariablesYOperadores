import java.util.Scanner;
import java.util.Locale;

public class programa2_operaciones_matematicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Ingresa el primer número entero: ");
        int a = sc.nextInt();
        System.out.print("Ingresa el segundo número entero: ");
        int b = sc.nextInt();

        System.out.println("\n--- Operaciones con int ---");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b) + " (división entera)");

        System.out.print("\nIngresa el primer número double: ");
        double x = sc.nextDouble();
        System.out.print("Ingresa el segundo número double: ");
        double y = sc.nextDouble();

        System.out.println("\n--- Operaciones con double ---");
        System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println(x + " - " + y + " = " + (x - y));
        System.out.println(x + " * " + y + " = " + (x * y));
        System.out.println(x + " / " + y + " = " + (x / y));

        System.out.print("\nIngresa el primer número float: ");
        float f1 = sc.nextFloat();
        System.out.print("Ingresa el segundo número float: ");
        float f2 = sc.nextFloat();
        System.out.println("\n--- Operaciones con float ---");
        System.out.println(f1 + " / " + f2 + " = " + (f1 / f2));

        System.out.print("\nIngresa un número short: ");
        short s = sc.nextShort();
        System.out.print("Ingresa un número byte: ");
        byte by = sc.nextByte();
        int suma = s + by;
        System.out.println("short + byte = " + suma);

        sc.close();
    }
}