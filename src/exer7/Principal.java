package exer7;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner tecladoString = new Scanner(System.in);
		Scanner tecladoNum = new Scanner(System.in);
		
		Carro[] car = new Carro[3];
		
		for(byte i = 0; i < car.length; i++){
			car[i] = new Carro();
			System.out.print("CADASTRO " + "\n" +
							   "Marca: ");
			car[i].setMarca(tecladoString.nextLine());
			System.out.print("Modelo: ");
			car[i].setModelo(tecladoString.nextLine());
			System.out.print("Ano: ");
			car[i].setAno(tecladoNum.nextInt());
			System.out.print("Chassi: ");
			car[i].setChassi(tecladoNum.nextInt());
			System.out.print("Cor: ");
			car[i].setCor(tecladoString.nextLine());
		}
		
		for(byte i = 0; i < car.length; i++){
			car[i].imprime();
		}
		
		

	}

}
