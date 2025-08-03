import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. pedir al usario que elija la conversión
        System.out.println("### Conversor de Temperatura ###");
        System.out.print("Seleccione la opción  de conversión: ");
        System.out.print("1. Celsius a Fahrenheit: ");
        System.out.print("2. Fahrenheit a Celsius: ");
        System.out.print("Ingrese su opción (1 o 2): ");
        int opcion = scanner.nextInt();
    // 5. Manejar errores con un if-else
        if (opcion == 1) {
            // 2. Leer la temperatura
            System.out.print("Ingrese la temperatura en grado Celsius:");
            double celsius = scanner.nextDouble();

            // 3. Realizar la conversión
            double fahrenheit = (celsius * 9/5) + 32;

            // 4. Monstrar el resultado
            System.out.println(celsius + "°C son " + fahrenheit + "°F.");
        }else if (opcion == 2) {
            // 2. Leer la temperatura
            System.out.print("Ingrese la temperatura en grado Fahrenheit:");
            double fahrenheit = scanner.nextDouble();

            // 3. Realizar la conversión
            double celsius = (fahrenheit - 32) * 5/9;

            // 4. Monstrar el resultado
            System.out.println("Opción no válida. Por favor, reinicie el programa e ingrese 1 o 2");


        }

        scanner.close();

    }
}
