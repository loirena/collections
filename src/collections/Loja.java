package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Loja 
{
	public static void main (String args[]) 
	{
		Collection<String> produtos = new ArrayList();
		produtos.add("Uno");
		produtos.add("Cubo mágico");
		produtos.add("Xadrez");
		produtos.add("Dominó");
		System.out.println("Produtos: "+produtos);
		
		produtos.remove("Uno");
		System.out.println("Produtos atualizados (remove): " +produtos);
		
		Collection<String> produtos2 = Arrays.asList("Resta um", "Pega-varetas", "Quebra-cabeça");
		produtos.addAll(produtos2);
		System.out.println("Produtos atualizados (add): " +produtos);
	}
}
