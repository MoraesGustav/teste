package desafio05;

import java.util.Scanner;

public class FrontEnd {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu Nome: ");
		String nome = scanner.nextInt();
		
		Cliente c = new Cliente();
		c.setNome("luiz silva");
		
		
		Endereco e = new Endereco();
		e.setCep("101010-000");
		/*
		 preencher todos os sets de endereco
		 * */
		c.setEnderecoCorrespondencia(e);
		
		
		System.out.println("Vamos começar a imprimir tudo que está no objeto de cliente");
		
		System.out.println("Nome do cliente: " + c.getNome());
		
		System.out.println("logradouro de corresp: " );
		c.getEnderecoCorrespondencia().Imprimir();
		
		
	}
}
