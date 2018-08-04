package exer8;

public class Aluno {
	private String nome;
	private int matricula;
	private float nota1, nota2, media;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public float getNota1() {
		return nota1;
	}
	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}
	public float getNota2() {
		return nota2;
	}
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	public float getMedia() {
		media = (this.nota1 + this.nota2)/2;
		return media;
	}
	public void setMedia(float media) {
		this.media = media;
	}
	
	public void imprime(){
		System.out.println("Aluno: " + this.nome + "Média: " + this.getMedia());
	}
	
}
