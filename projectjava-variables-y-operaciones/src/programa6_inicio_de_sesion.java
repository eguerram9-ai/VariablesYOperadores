import java.util.Scanner;

public class programa6_inicio_de_sesion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuarioCorrecto = "admin";
        String passwordCorrecto = "1234";

        System.out.print("Ingresa tu usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Ingresa tu contraseña: ");
        String password = sc.nextLine();

        String mensaje;

        if (usuario.equals(usuarioCorrecto)) {
            if (password.equals(passwordCorrecto)) {
                mensaje = "Acceso concedido";
            } else {
                mensaje = "Contraseña incorrecta";
            }
        } else {
            mensaje = "Usuario no registrado";
        }

        System.out.println(mensaje);
        sc.close();
    }
}