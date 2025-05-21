package exercicio15;

public class principal {
	public static void main(String[] args) {
		int multi=0,soma=0;
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
			{
				//par
				multi=multi*i;
			} else if(i%2!=0)
			{
				//impar
				soma=soma+i;
			}
		}
		System.out.println("A multiplicação dos números pares de 0 até 30 é "+multi);
		System.out.println("A soma dos números ímpares de 0 até 30 é "+soma);
	}
}
