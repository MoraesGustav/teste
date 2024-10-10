package desafio05;

import java.util.ArrayList;

public class Cliente {

	private String nome;
	private String cpfcnpj;
	private ArrayList<Contato> contato;
	private Endereco enderecoCorrespondencia;
	private Endereco enderecoEntrega;
	
	//construtor
	public Cliente() {
		enderecoCorrespondencia = new Endereco();
		enderecoEntrega = new Endereco();
		contato = new ArrayList<Contato>();
		
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpfcnpj() {
		return cpfcnpj;
	}
	public void setCpfcnpj(String cpfcnpj) {
		this.cpfcnpj = cpfcnpj;
	}
	public ArrayList<Contato> getContato() {
		return contato;
	}
	public void setContato(ArrayList<Contato> contato) {
		this.contato = contato;
	}
	public Endereco getEnderecoCorrespondencia() {
		return enderecoCorrespondencia;
	}
	public void setEnderecoCorrespondencia(Endereco enderecoCorrespondencia) {
		this.enderecoCorrespondencia = enderecoCorrespondencia;
	}
	public Endereco getEnderecoEntega() {
		return enderecoEntrega;
	}
	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	
}

