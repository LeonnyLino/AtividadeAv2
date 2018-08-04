package exer5e6;

public class Teste6 {

	public static void main(String[] args) {
		int n1 = 5, n2 = 7, n3 = 15;
		float nf1 = 2, nf2 = 10;
		Calculos cal = new Calculos();
		cal.calculo(n1, n2);
		
		cal.calculo(n1, n2, n3);
		
		cal.calculo(nf1, nf2);
		
		System.out.println(cal.calculo(nf1, nf2) + "\n"+
				           cal.calculo(n1, n2) + "\n" +
				           cal.calculo(n1, n2, n3));

	}

}
