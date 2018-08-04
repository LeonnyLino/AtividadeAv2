package doispontosAV2;

public class Endereco {
	private String rua, bairro, cidade;
	private long cep;
	private int numero;
	
	public Endereco(String rua, String bairro, String cidade, long cep, int numero){
		this.rua = rua;
		this.bairro = bairro;
		this. cidade = cidade;
		this.cep = cep;
		this.numero = numero;
	}
	
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public long getCep() {
		return cep;
	}
	public void setCep(long cep) {
		this.cep = cep;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	

}
