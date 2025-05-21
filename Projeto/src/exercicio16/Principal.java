package exercicio16;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		
		System.out.print("Insira o primeiro número: ");
		int n1=x.nextInt();
		
		System.out.print("Insira o segundo número: ");
		int n2=x.nextInt();
		
		TrocarNumero t=new TrocarNumero();
		t.Troca(n1, n2);
		
		x.close();
	}

}
