package exercicio17;

public class Compara {
	public void CompararNumeros(int n1,int n2)
	{		
		if(n1==n2)
		{
			System.out.println("Os números são iguais!");
		} else if(n1!=n2)
		{
			if(n1>n2)
			{
				System.out.println("Os números são diferentes, o maior é "+n1+" e o menor é "+n2
						+" e a diferenca entre o menor e o maior é de "+(n1-n2));
			} else if(n2>n1)
			{
				System.out.println("Os números são diferentes, o maior é "+n2+" e o menor é "+n1
						+" e a diferenca entre o menor e o maior é de "+(n2-n1));
			}
		}
	}
}
