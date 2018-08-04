package exercicioherança2;

public abstract class Pessoa {
	private String nome;
	protected String endereco;
	private String telefone;
	
	public Pessoa(){
		
	}

	public Pessoa(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereco;
	}

	public void setEndereço(String endereço) {
		this.endereco = endereço;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void imprime(){
		System.out.println("Nome: " + this.nome +
						   "Endereço: " + this.endereco +
						   "Telefone: " + this.telefone);
	}
	
}
