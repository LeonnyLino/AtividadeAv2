package exercicioherança;

public class Fornecedor extends Pessoa {
	private float valorCredito, valorDivida;
	
	public Fornecedor(){
		this.valorCredito = 2000.50f;
	}

	public float getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}

	public float getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public float obterSaldo(){
		return this.valorCredito - this.valorDivida;
	}
	
	public void imprimi(){
		System.out.println("Nome: " + this.getNome() +
						   "\n Endereço: " + this.getEndereco() +
						   "\n Telefone: " + this.getTelefone() +
						   "\n Valor da Compra: " + this.valorDivida +
						   "\n Crédito Restante: " + this.obterSaldo());
	}

}
