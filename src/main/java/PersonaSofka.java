import java.util.Scanner;

public class PersonaSofka {

    public static void main(String[] args) {

        String nombre;
        String celular;
        int edad;

        Scanner lector = new Scanner (System.in);
        System.out.println("Ingrese nombre de usuario: ");
        nombre = lector.nextLine().toLowerCase();
        System.out.println("Ingrese número de celular del usuario: ");
        celular = lector.nextLine();
        System.out.println("Ingrese edad del usuario: ");
        edad = lector.nextInt();

        System.out.println("Bienvenido señor "+nombre +
                ", es un placer para nosotros contar con una persona de "+edad +" años.\n" +
                "\n" +
                "Próximamente nos comunicaremos con usted al numero " +celular+".\n" +
                "\n" +
                "Feliz día.");

    }
}
