package exercicio4;

import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Insira a largura da parede: ");
		double lp=x.nextDouble();
		System.out.println("Insira a altura da parede: ");
		double ap=x.nextDouble();
		System.out.println("Insira a altura dos azuleijos: ");
		double la=x.nextDouble();
		System.out.println("Insira a largura dos azuleijos: ");
		double aa=x.nextDouble();
		System.out.println("Para cobrir a parede serão nescessários "+Math.ceil((lp*ap)/(la*aa))+" azuleijos");
	x.close();
	}
}