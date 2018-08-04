package exer3e4;

public class Funcionario {
	private int matricula;
	private String nome, cargo;
	private byte idade;
	private double salario;
	
	public Funcionario(){
		this.salario = 1500.00;
	}
	
	public Funcionario(String nome, byte idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	public Funcionario(int matricula, String nome, double salario){
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
		
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public byte getIdade() {
		return idade;
	}

	public void setIdade(byte idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void imprime(){
		System.out.println(this.getMatricula() + "\n" + this.getNome() + "\n" + this.getSalario());
		//System.out.println(this.matricula + "\n" + this.nome + "\n" + this.salario);
	}


}
