package Aula2709;

import java.util.ArrayList;

public class Cliente{
	private String nome;
	private String cpfCnpj;
	private ArrayList<Contato> contato;
	private Endereco enderecoCorrespondencia;
	private Endereco enderecoEntrega;
	
	public Endereco getEnderecoCorrespondencia() {
		return enderecoCorrespondencia;
	}
	public void setEnderecoCorrespondencia(Endereco enderecoCorrespondencia) {
		this.enderecoCorrespondencia = enderecoCorrespondencia;
	}

	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}
	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	
	public ArrayList<Contato> getContato(){
		return contato;
	}
	public void setContato(ArrayList<Contato> contato) {
		this.contato = contato;
	}
	
	public void imprimir() {
		System.out.println("\n\n\n\n********** RELATORIO do CLIENTE *************");
		System.out.println("nome: " + getNome());
		System.out.println("cpfCnpj: " + getCpfCnpj());

		System.out.println("\n********** END CORRESP *************");
				
		getEnderecoCorrespondencia().imprimir();

		
		System.out.println("\n********** END ENTRE *************");
		getEnderecoEntrega().imprimir();

		System.out.println("\n********** CON TAT************");

		for (int i=0; i<contato.size(); i++) {
			contato.get(i).imprimir();
		}
	}
	//Construtor
	public Cliente() {
		enderecoCorrespondencia = new Endereco();
		enderecoEntrega = new Endereco();
		contato = new ArrayList<Contato>();
	}
}

