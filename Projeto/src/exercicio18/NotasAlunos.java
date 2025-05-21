package exercicio18;

import java.util.ArrayList;

public class NotasAlunos {
	ArrayList<Integer> lista = new ArrayList<>();
	public void AddNotas(int  n1)
	{
		if((n1<0)||(n1>100))
		{
			System.out.println("A nota deve estar entre 0 e 100!");
		} else if((n1>=0)&&(n1<=100))
		{
			lista.add(n1);
			System.out.println("Nota adcionada com sucesso!");
		}
	}
	public void CalculaMedia()
	{
		double total=0;
		for(int i=0;i<lista.size();i++)
		{
			total=total+lista.get(i);
		}
		System.out.println("A média do aluno é: "+(total/lista.size()));
	}
}
