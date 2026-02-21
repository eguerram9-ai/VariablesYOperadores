import java.util.Scanner;

public class programa5_dia_de_la_semana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número del 1 al 7: ");
        int numDia = sc.nextInt();

        String dia;

        switch (numDia) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miércoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Número inválido";
        }

        System.out.println("Día: " + dia);
        sc.close();
    }
}