package desafio05;

public class Endereco {
	
private String cep;
private String logadouro;
private String complemento;
private String numero;
private String bairro;
private String uf;
private String municipio;
private String telefone;

public String getCep() {
	return cep;
}
public void setCep(String cep) {
	this.cep = cep;
}
public String getLogadouro() {
	return logadouro;
}
public void setLogadouro(String logadouro) {
	this.logadouro = logadouro;
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
public String getUf() {
	return uf;
}
public void setUf(String uf) {
	this.uf = uf;
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

 public void Imprimir()
 {
	 
	 System.out.println("Endereço");

	 System.out.println("CEP: " + this.cep);

	 System.out.println("Logradouro: " + this.logadouro);
 }

}
