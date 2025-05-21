package exercicio3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner x=new Scanner(System.in);
		
		System.out.println("Quantos funcionários deseja analisar?");
		int qtde=x.nextInt();
		int i=1;
		double mS=0;
		while(i<=qtde) {
			System.out.println("Insira o salário do funcionário "+i);
			double salario=x.nextDouble();
			mS=salario+mS;
			i++;
		}
		System.out.println("A média salrial é de R$"+mS/qtde);
		x.close();
	}

}
