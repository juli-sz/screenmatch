 //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

 import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        Scanner teclado = new Scanner(System.in);
        System.out.println("escribe tu nombre de usuario");
        String nombre = teclado.nextLine();
        System.out.println("escribe tu contraseña");
        String password = teclado.nextLine();
        System.out.println("escribe tu edad");
        int edad = teclado.nextInt();
        System.out.println("escribe tu tipo de plan");
        String plan = teclado.nextLine();

        Usuario usuario = new Usuario(nombre,edad,plan,password);


        System.out.println("quieres loguearte?");
        String log = teclado.nextLine();
        if (log.equals("si")) {
            System.out.println("escribe tu contraseña");
            String contra = teclado.nextLine();
            usuario.inicioSesion(contra);
        } else {
            System.out.println("ok");
        }





    }
}

