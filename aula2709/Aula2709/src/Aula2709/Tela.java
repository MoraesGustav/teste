package Aula2709;

import java.util.ArrayList;
import java.util.Scanner;


public class Tela {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cliente c = new Cliente();
		Endereco endCorresp = new Endereco();
		Endereco endEntrega = new Endereco();
		ArrayList<Contato> contatos = new ArrayList<Contato>();
		
		Contato ct = new Contato();
		contatos.add(ct);
				
		c.setContato(contatos);
		
		c.setEnderecoCorrespondencia(endCorresp);
		
		c.setEnderecoEntrega(endEntrega);
		
		System.out.println("*************Digite Dados do Cliente***************");

		System.out.println("digite nome cliente: ");
		c.setNome(scan.nextLine());
		
		
		System.out.println("digite cpf: ");
		c.setCpfCnpj(scan.nextLine());
		
		System.out.println("digite email: ");
		ct.setEmail(scan.nextLine());
		
		
		System.out.println("digite Telefone: ");
		ct.setTelefone(scan.nextLine());
		
		System.out.println("********   DADOS DO ENDEREÇO DE ENTREGA************");
		
		System.out.println("digite bairro: ");
		endEntrega.setBairro(scan.nextLine());
		
		System.out.println("digite cep: ");
		endEntrega.setCep(scan.nextLine());
		
		System.out.println("Digite Rua");
		endEntrega.setLogradouro(scan.nextLine());
		
		System.out.println("Digite Numero");
		endEntrega.setNumero(scan.nextLine());
		
		System.out.println("digite Complemento: ");
		endEntrega.setComplemento(scan.nextLine());
		
		System.out.println("digite UF: ");
		endEntrega.setUF(scan.nextLine());
		

		System.out.println("********   DADOS DO ENDEREÇO DE CORRESPONDENCIA ************");
		System.out.println("digite bairro: ");
		endCorresp.setBairro(scan.nextLine());
	
		System.out.println("digite Cep: ");
		endCorresp.setCep(scan.nextLine());

		System.out.println("********   DADOS do CONTATO ************");
		System.out.println("digite nome: ");
		ct.setNome(scan.nextLine());

		
		c.imprimir();
		
		
		
		scan.close();
		
	}
}