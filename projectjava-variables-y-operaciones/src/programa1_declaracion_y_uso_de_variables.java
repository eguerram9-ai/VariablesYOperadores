import java.util.Scanner;
import java.util.Locale;

public class programa1_declaracion_y_uso_de_variables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int edad;
        double altura;
        String nombre;
        boolean esEstudiante;

        System.out.print("Ingresa tu edad: ");
        edad = sc.nextInt();

        System.out.print("Ingresa tu altura en metros (double): ");
        altura = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Ingresa tu nombre (String): ");
        nombre = sc.nextLine();

        System.out.print("¿Eres estudiante? (true/false): ");
        esEstudiante = sc.nextBoolean();

        System.out.println("\n--- Datos ingresados ---");
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Nombre: " + nombre);
        System.out.println("Estudiante: " + esEstudiante);

        sc.close();
    }
}