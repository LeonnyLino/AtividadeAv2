package exercicioherança;

public class Empregado extends Pessoa {
	private int codigoSetor;
	private float salarioBase, imposto;
	
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
	
	public float aumentarSalario(float porcAumento){
		return (this.salarioBase * porcAumento)/100;
	}

}
