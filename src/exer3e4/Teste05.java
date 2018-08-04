package exer3e4;

public class Teste05 {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		
		System.out.println(f1.getNome() + "\n" + f1.getSalario());
		
		System.out.println("--------------------------------");
		
		Funcionario f2 = new Funcionario("LeonnyLino", (byte)24);
		
		System.out.println(f2.getNome() + "\n" + f2.getIdade() + "\n" + f2.getSalario());
		
		System.out.println("--------------------------------");
		
		Funcionario f3 = new Funcionario(1234, "Leonny", (double)1800.50);
		
		f3.imprime();
		
		
		
	
			

	}

}
