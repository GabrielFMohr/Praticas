package exercicio12;

import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		
		System.out.print("Insira o número a ser analisado: ");
		int num=x.nextInt();
		
		System.out.println("O número seguinte é "+(num+1)+" e o número anterior é "+(num-1));
		
		x.close();
	}

}
