package exercicioStatic;

import java.util.Scanner;

public class TesteCalculadora01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num;

		do {
			System.out.println("entre com numero positivo");
			num = leia.nextInt();
			if(num < 0) {
				System.out.println("numero invalido");
			}
		} while (num < 0);
         System.out.println(Calculadora.fatorial(num));
         
         
         leia.close();
	}
}
