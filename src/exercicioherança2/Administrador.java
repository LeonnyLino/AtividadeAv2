package exercicioherança2;

public class Administrador extends Empregado{
	private float ajudaDeCusto;
	
	public Administrador(){
		
	}
	
	public Administrador(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float imposto,
						float ajudaDeCusto) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}


	public float getAjudaDeCusto() {
		return ajudaDeCusto;
	}



	public void setAjudaDeCusto(float ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}


	@Override
	public float calcularSalario(float calcSal){
		calcSal = (this.getSalarioBase() * this.getImposto())/100;
		return calcSal - this.getSalarioBase() + this.ajudaDeCusto;
	}
	
	@Override
	public void imprime(){
		super.imprime();
		System.out.println("");
	}
}
