package exercicio13;

public class MaiorNumero {

	public void MostrarMaior(int n1, int n2)
	{
		int maior = 0;
		int menor = 0;
		if(n1>n2) {
			maior=n1;
			menor=n2;
		} else if (n2>n1) {
			maior=n2;
			menor=n1;
		} else if(n1==n2)
		{
			maior=n1;
			menor=n1;
		}
		System.out.println("O maior número inserido foi "+maior+" e o menor foi "+menor);
	}
}
