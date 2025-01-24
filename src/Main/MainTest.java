
package Main;

import java.util.Scanner;

public class MainTest {
	public static void main(String[] args) {
		System.out.println("3 es divisible entre 3 " + Main.esDivisiblePorTres(3));
		System.out.println("4 es divisible entre 3 " + Main.esDivisiblePorTres(4));
		System.out.println("6 es divisible entre 3 " + Main.esDivisiblePorTres(6));
		
		System.out.println("El 2 es par: " + Main.esPar(2));

		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        int numero = scanner.nextInt();
        
        boolean resultado = Main.esDivisiblePorCinco(numero);
        
        System.out.printf("¿El número %d es divisible por 5? %b%n", numero, resultado);

        scanner.close();
	}



}
