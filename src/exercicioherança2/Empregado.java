package exercicioherança2;

public class Empregado extends Pessoa{
	private int codigoSetor;
	private float salarioBase, imposto;
	
	public Empregado(){
		
	}
	
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float imposto) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getImposto() {
		return imposto;
	}
	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	public float calcularSalario(float calcSal){
		calcSal = (this.salarioBase * this.imposto)/100; //Calcula o valor da % a ser retído.
		return calcSal - this.salarioBase;//pega o resultado da % e subtrai pelo salarioBase.
	}
	
	@Override
	public void imprime(){
		super.imprime();
		System.out.println("Codigo do Setor: " + this.codigoSetor +
						   "Salário Base: " + this.salarioBase +
						   "Imposto Descontado: " + this.imposto);
	}

}
