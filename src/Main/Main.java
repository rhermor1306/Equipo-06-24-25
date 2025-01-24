package Main;

public class Main {
	public static void main(String[] args) {
		//System.out.println("Proyecto del equipo 06");
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        int numero = scanner.nextInt();
        
        boolean resultado = esDivisiblePorCinco(numero);
        
        System.out.printf("¿El número %d es divisible por 5? %b%n", numero, resultado);

        scanner.close();
    }

    public static boolean esDivisiblePorCinco(int numero) {
        return numero % 5 == 0;
    }

	public static boolean esPar(int numero){
		if (numero % 2 == 0) {
			return true;
		}
		return false;
	}




	public static boolean esDivisiblePorTres(int numero){
		return numero % 3 == 0;
	}

}