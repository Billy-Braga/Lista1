package fendadobiquini;

public class Ex17 {

	public static void main(String[] args) {
		
		int A=11, B=9;
		
		if(A>10 || A+B==20)
			System.out.println("Número válido");
		else if(A==B)
			System.out.println("A é igual a B");
		else if(A!=10 && B!=10 && A<10)
			System.out.println("A é menor que 10");
		else {
			System.out.println("Número não válido");
		}
	}

}
