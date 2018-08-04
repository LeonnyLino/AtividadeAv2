package exercicioherança2;

public class Fornecedor extends Pessoa{
	private float valorCredito, valorDivida;
	
	public Fornecedor(){
		
	}

	public Fornecedor(String nome, String endereco, String telefone, float valorCredito, float valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
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
	
	public float obterSalo(){
		return this.valorCredito - this.valorDivida;
	}
	
	@Override
	public void imprime(){
		super.imprime();
		System.out.println("Valor Crédito: " + this.valorCredito +
						   "Valor Devido: " + this.valorDivida +
						   "Saldo Restante: " + this.obterSalo());
	}

}
