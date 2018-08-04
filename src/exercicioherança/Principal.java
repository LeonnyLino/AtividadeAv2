package exercicioherança;

import java.util.Scanner;

public class Principal {
	
	public static void main(String args[]){
		
		Scanner tecladoNumerico = new Scanner(System.in);
		Scanner tecladoString = new Scanner(System.in);
		
		Fornecedor fd = new Fornecedor();
		
		System.out.print("Cadastro Forcenedor: \n Nome: ");
		fd.setNome(tecladoString.nextLine());
		System.out.print("Endereço: ");
		fd.setEndereco(tecladoString.nextLine());
		System.out.print("Telefone: ");
		fd.setTelefone(tecladoString.nextLine());
		System.out.print("Valor da Compra: ");
		fd.setValorDivida(tecladoNumerico.nextFloat());
		
		fd.imprimi();
		
		System.out.println("_________________________");
		
		
		
	}
}
