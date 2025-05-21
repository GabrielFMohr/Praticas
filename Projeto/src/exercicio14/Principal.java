package exercicio14;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		
		System.out.print("Insira o número desejado: ");
		int n1=x.nextInt();
		
		NumeroDecrescente n=new NumeroDecrescente();
		n.MostrarDescrescente(n1);
		
		x.close();
	}

}
