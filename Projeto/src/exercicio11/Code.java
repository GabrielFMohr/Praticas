package exercicio11;

import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		
		System.out.print("Insira o salário mínimo atual: ");
		double smin=x.nextDouble();
		
		System.out.print("Insira o salário a ser analisado: ");
		double sals=x.nextDouble();
		
		double qsmin=sals/smin;
		
		System.out.println("O salário inserido corresponde à "+qsmin+" salários mínimos.");
		
		x.close();
	}

}
