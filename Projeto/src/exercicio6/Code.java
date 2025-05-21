package exercicio6;

import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		System.out.println("Insira a altura (em metros) que deseja levantar o objeto: ");
		double alt=x.nextDouble();
		
		System.out.println("Insira a massa (em kgs) do objeto em questão: ");
		double mas=x.nextDouble();
		
		System.out.println("Insira em quanto tempo (em minutos) deseja levantar o objeto: ");
		double temp=x.nextDouble();
		
		System.out.println("Para levantar um objeto de "+mas+" kgs à uma altura de "+alt+" metro(s) em "+temp+" minuto(s) são nescessários "+(mas*alt*temp)/745.6999+" cavalos de potência");
		x.close();
	}

}
