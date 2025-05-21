package Exercicio5;

import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		
		System.out.print("Insira a altura da lata de óleo: ");
		double alturaLata=x.nextDouble();
		
		System.out.print("Insira o raio da lata de óleo: ");
		double raioLata=x.nextDouble();
		
		System.out.println("O volume máximo da lata de óleo é de "+3.14159*raioLata*raioLata*alturaLata+" litros");
		
		x.close();
	}
}
