package desafio05;


public class FrontEnd {

	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		c.setNome("luiz silva");
		
		Cliente f = new Cliente();
		f.setCpfcnpj("479.333.333-22");
		
		
		
		Endereco e = new Endereco();
		e.setCep("101010-000");
		
		Endereco l = new Endereco();
		l.setLogadouro("Rua Tatui");
		
		
		/*
		 preencher todos os sets de endereco
		 * */
		c.setEnderecoCorrespondencia(e);
		
		
		System.out.println("Vamos começar a imprimir tuuuudo que está no objeto de cliente");
		
		System.out.println("Nome do cliente: " + c.getNome());
		
		System.out.println("Cpfcnpj" + f.getCpfcnpj());
		
		System.out.println("logradouro de corresp:" );
		c.getEnderecoCorrespondencia().Imprimir();
		
		System.out.println("Logadouro:" + l.getLogadouro());
	}
}
