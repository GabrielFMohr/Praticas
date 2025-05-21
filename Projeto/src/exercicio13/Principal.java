package exercicio13;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		MaiorNumero maior=new MaiorNumero();
		
		System.out.print("Por favor, insira o primeiro número: ");
		int n1=x.nextInt();
		
		System.out.print("Por favor, insira o segundo número: ");
		int n2=x.nextInt();
		
		maior.MostrarMaior(n1, n2);
		
		x.close();
	}

}
