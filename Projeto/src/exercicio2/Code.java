package exercicio2;

import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		double mH=0;
		int qM=0,qH=0;
		double maior = 0,menor = 10;
		for(int i=1;i<=4;i++)
		{
			System.out.printf("Insira a altua da pessoa %d: ",i,"/m");
			double alt=x.nextDouble();
			x.nextLine();
			System.out.println("Insira o sexo da pessoa "+i+" (F para feminino e M para masculino)");
			String s=x.nextLine();
			if(s.equals("F"))
			{
				qM++;
			}
			else if(s.equals("M"))
					{
						mH=mH+alt;
						qH++;
					}
			if(alt<menor)
			{
				menor=alt;
			} 
			if(alt>maior)
			{
				maior=alt;
			}
		}
		System.out.println("A maior altura inserida foi "+maior+". "+
						   "A menor altura inserida foi "+menor+"."+
						   "A média de altura masculina foi "+mH/qH+". "+
						   "A quantidade de mulheres inseridas foi "+qM+". "
						   );
		x.close();
	}

}
