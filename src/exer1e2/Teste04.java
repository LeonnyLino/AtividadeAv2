package exer1e2;
import java.util.Scanner;

public class Teste04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Cilindro c = new Cilindro();
		
		System.out.print("Digite o Raio base do Cilindro:");
		c.setRaioBase(teclado.nextDouble());
		System.out.print("Digite a altura do Cilindro:");
		c.setAltura(teclado.nextDouble());
		
		c.imprimir();

	}

}
