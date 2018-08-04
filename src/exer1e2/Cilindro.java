package exer1e2;

public class Cilindro {
	private double raioBase, altura;
	
	public Cilindro() {
		
	}

	public double getRaioBase() {
		return raioBase;
	}

	public void setRaioBase(double raioBase) {
		this.raioBase = raioBase;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void imprimir(){
		System.out.println("Raio Base digitado foi: "+ this.raioBase);
		System.out.println("Altura digitada foi: "+ this.altura);
	}

}
