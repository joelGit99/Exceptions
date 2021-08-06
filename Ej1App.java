import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ej1App {
	Exception exception = new Exception("Excepción");
	public static void main(String[] args) {
		try {
			// Genero un número aleatorio con la clase Random
			Random random = new Random();
			int num = random.nextInt(500 - 1) + 1;
			Scanner teclado = new Scanner(System.in);
			int numUsuario = 0;
			int contador = 0;
			// Preguntamos al usuario el número hasta que lo adivine, y le vamos diciendo si es mayor o menor
			while(numUsuario != num) {
				System.out.println("Introduce el número");
				numUsuario = teclado.nextInt();
				if(numUsuario > num) {
					System.out.println("El número introducido es mayor al correcto");
					contador++;
				} else if(numUsuario < num) {
					System.out.println("El número introducido es menor al correcto");
					contador++;
				} else {
					// Cuando lo adivina, le mostramos también el número de intentos
					System.out.println("Has adivinado el número, te ha costado " + contador + " intentos");
				}
			}
		} catch(InputMismatchException ie) {
			System.out.println(ie.getMessage());
			System.out.println("El valor introducido no es un número");
		}
		
		// Ej 2
		try {
			System.out.println("Mensaje");
		} catch(Exception exception) {
			System.out.println(exception.getMessage());
		}
	}

}
