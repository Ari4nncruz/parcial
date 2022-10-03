import java.util.Scanner;

public class condicionales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Calculadora de propinas");
        System.out.println("Ingrese la cantidad a pagar");
        double cantidad = entrada.nextDouble();
        System.out.println("Ingrese el % de la propina");
        int porcentaje = entrada.nextInt();

        if (porcentaje < 15) {
            System.out.println("El servicio no fue muy bueno");

        } else if (15 <= porcentaje && porcentaje < 30) {
            System.out.println("El serivicio fue bueno");
        } else {
            System.out.println("El servicio fue excelente");
        }
        double total = cantidad + (cantidad * porcentaje / 100);
        System.out.printf("El total a pagar es: %.1f", total);
    }
}