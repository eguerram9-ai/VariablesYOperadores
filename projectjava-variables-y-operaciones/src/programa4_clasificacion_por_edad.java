import java.util.Scanner;

public class programa4_clasificacion_por_edad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        String categoria;

        if (edad < 12) {
            categoria = "Niño";
        } else if (edad >= 12 && edad <= 17) {
            categoria = "Adolescente";
        } else if (edad >= 18 && edad <= 59) {
            categoria = "Adulto";
        } else {
            categoria = "Adulto mayor";
        }

        System.out.println("Clasificación: " + categoria);
        sc.close();
    }
}