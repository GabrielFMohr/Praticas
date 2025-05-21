package exercicio18;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		NotasAlunos nA=new NotasAlunos();
		int op=1;
		do {
			System.out.println();
			System.out.println("Insira a opção que deseja:\n"+
					"0 Para sair\n"+
					"1 Para adcionar uma nova nota\n"+
					"2 Para ver a média final do aluno");
			op=x.nextInt();
			if(op==1)
			{
				System.out.print("Insira a nota que deseja inserir: ");
				int n=x.nextInt();
				nA.AddNotas(n);
			} else if(op==2)
			{
				nA.CalculaMedia();
			}
		}while(op!=0);
		x.close();
	}
}
