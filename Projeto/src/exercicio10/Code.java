package exercicio10;

import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		
		System.out.print("Insira o IPI: ");
		double ipi=x.nextDouble();
		
		System.out.print("Insira o valor da peça 1: ");
		double val1=x.nextDouble();
		
		System.out.print("Insira a quantidade requerida da peça 1: ");
		int qtde1=x.nextInt();
		
		System.out.print("Insira o valor da peça 2: ");
		double val2=x.nextDouble();
		
		System.out.print("Insira a quantidade requerida da peça 2: ");
		int qtde2=x.nextInt();
		
		System.out.println("O valos total a ser pago é R$"+Math.round(((val1*qtde1)+(val2*qtde2))/((ipi/100)+1)));
		
		x.close();
	}

}
