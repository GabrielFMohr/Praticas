package exercicio1;

import java.util.Scanner;

public class Code {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner X= new Scanner(System.in);
		
		System.out.println("Insira a temperatura em Celsius: ");
		float C=X.nextFloat();
		
		System.out.printf("A temperatura corresponde à %.2f° Kélvin, %.2f° Réamur, %.2f° Rankine e %.2f° Fahrenheit", C+273.15,C*0.8,C*1.8+32+459.67,C*1.8+32);
	}	
}
