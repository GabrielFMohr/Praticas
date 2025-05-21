package exercicio19;

import java.util.ArrayList;

public class Agenda {
	ArrayList<Contato> contatos=new ArrayList<>();
	
	public void Cadastrar(Contato c)
	{
		contatos.add(c);
	}
	public Contato Buscar(String nome) 
	{
		for (Contato contato : contatos) 
		{
			if(contato.getNome().equals(nome))
			{
				return contato;
			}
		}
		return null;
	}
	public boolean Deletar(String nome)
	{
		for (Contato contato : contatos) 
		{
			if(contato.getNome().equals(nome))
			{
				contatos.remove(contato);
				return true;
			}
		}
		return false;
	}
}
