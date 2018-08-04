package exer8;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoString = new Scanner(System.in);
		
		Aluno[] a = new Aluno[3];
		
		for(byte i = 0; i < a.length; i++){
			a[i] = new Aluno();
			System.out.print("Nome do Aluno: " );
			a[i].setNome(tecladoString.nextLine());
			System.out.println("Matrícula: ");
			a[i].setMatricula(teclado.nextInt());
			System.out.println("1ª nota: ");
			a[i].setNota1(teclado.nextFloat());
			System.out.println("2ª nota");
			a[i].setNota2(teclado.nextFloat());
		}
		
		for(byte i = 0; i < a.length; i++){
			a[i].imprime();
		}
	}

}
