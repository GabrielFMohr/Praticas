package exercicio7;

import java.util.Scanner;

public class Code {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		System.out.print("Insira a quantidade de anos: ");
		int anos=x.nextInt();
		
		System.out.print("Insira a quantidade de meses: ");
		int meses=x.nextInt();
		
		System.out.print("Insira a quantidade de dias: ");
		int dias=x.nextInt();
		
		dias=dias+(anos*365);
		dias=dias+(meses*30);
		
		System.out.println("A idade da pessoa em dias é de "+dias);
		
		x.close();
	}
}
