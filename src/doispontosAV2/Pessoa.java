package doispontosAV2;

public abstract class Pessoa {
	private String nome;
	private float rendaPessoa;
	private int sitPessoa;
	private Endereco endereco;
	
	
	public Pessoa(String nome, float rendaPessoa, int sitPessoa, Endereco endereco) {
		this.nome = nome;
		this.rendaPessoa = rendaPessoa;
		this.sitPessoa = sitPessoa;
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getRendaPessoa() {
		return rendaPessoa;
	}
	public void setRendaPessoa(float rendaPessoa) {
		this.rendaPessoa = rendaPessoa;
	}
	public int getSitPessoa() {
		return sitPessoa;
	}
	public void setSitPessoa(int sitPessoa) {
		this.sitPessoa = sitPessoa;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
