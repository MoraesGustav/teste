package Aula2709;

public class Endereco {
	
	private String cep;
	private String logradouro;
	private String complemento;
	private String numero;
	private String bairro;
	private String uF;
	private String municipio;
	private String telefone;
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getUF() {
		return uF;
	}
	public void setUF(String uF) {
		this.uF = uF;
	}
	
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void imprimir() {
		System.out.println("rua: " + getLogradouro());
		System.out.println("Cep: " + getCep());
		System.out.println("Numero: " + getNumero());
		System.out.println("Complemento: " + getComplemento());
		System.out.println("Bairro: " + getBairro());
		System.out.println("uF: " + getUF());
		System.out.println("Municipio: " + getMunicipio());
		
	}
	
}
	
