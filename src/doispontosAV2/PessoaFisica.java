package doispontosAV2;

public class PessoaFisica extends Pessoa{
	private long cpf, rg;
	
	
	public PessoaFisica(String nome, float rendaPessoa, int sitPessoa, Endereco endereco, long cpf, long rg) {
		super(nome, rendaPessoa, sitPessoa, endereco);
		this.cpf = cpf;
		this.rg = rg;
	}	
	
	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public long getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}
	
	
}
