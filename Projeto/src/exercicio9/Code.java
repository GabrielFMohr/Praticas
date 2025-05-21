package exercicio9;

import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		
		System.out.print("Insira o saldo a ser reajustado: ");
		double salario=x.nextDouble();
		double salario2=salario+(salario*0.01);
		
		System.out.println("O saldo após reajuste é de "+salario2);
		
		x.close();
	}

}
