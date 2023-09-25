package lista;

import java.util.Arrays;

public class Utilidades {

	//questão 1
	public static float somatorio (float vet[]) {
		float somat= 0;
		
		for (int i = 2; i < vet.length-1; i++) {
			somat+=vet[i];
		}
		
		return somat;
	}
	
	//questão 2
	public static void numerospares(int inicio, int fim) {
		for (int i=inicio+1; i<fim; i++) {
		  if(i%2==0) {
			 inicio++;
			 System.out.print(i+ " ");
		  }
		}
	}
	
	//questão 3
	public static double media(int vetA[],int vetB[]) {
		float soma=0;
		
		for (int i= 0; i < vetB.length; i++) {
			soma+= vetA[i]+vetB[i];
		}
		
		return soma/2;
	}
	
	//questão 4
	public static double mediaponderada(int notas[], int pesos[]) {
		
		float produto = 0;
		double quantidade = 0;
		
	    for (int i = 0; i < pesos.length; i++) {
			produto+= notas[i]*pesos[i];
			
			quantidade+=pesos[i];
		}
		return produto/quantidade;
	}
	
	//questão 5
	public static int contagem(int vetA[], int vetB[]) {
		
		int quantidade=0;
		
		
		for (int i = 0; i < vetB.length; i++) {
			if(vetA[i]==2){
					quantidade++;	
			}if(vetB[i]==2) {
				quantidade++;	
			}
		}
		return quantidade;
	}
	
	//questão 6
	public static int[] copia(int vetA[]) {
		int copia[]= new int [vetA.length];
		for (int i = 0; i < vetA.length; i++) {
			copia[i]=vetA[i];
		}
		return copia;
	}
	
	//questão 7
	public static int[] ordenaçãocresc(int vet[]) {
		
	
		int aux;
		
		for (int i = 0; i < (vet.length-1); i++) {
			for (int j = 0; j < vet.length-1; j++) {
				if(vet[j]>vet[j+1]) {
					aux= vet[j];
					vet[j]=vet[j+i];
					vet[j+1]= aux;
				}
			}
		}
		return vet;
	}
	
	//questão 8
	public static boolean verificar(int vetA[]) {
		
		for (int i = 0; i < vetA.length-1; i++) {
			if(vetA[i]>vetA[i+1]) {
				return false;
		}	
	}
		return true;
}
	
	//questão 9
	public static int kesimomaiorvalor(int[] vetA, int k) {
		
		if(k<1 || k>vetA.length) {
			System.out.println("Valor não está contido no vetor.");
			return -1;
		}
		int copiarvetor[]= Arrays.copyOf(vetA, vetA.length);
		
		Arrays.sort(copiarvetor);
		
		int indice= vetA.length-k;
		
		return copiarvetor[indice];
	}
	
	//questão 10
	public static int kesimomenorvalor(int[] vetA, int k) {
		if(k<1 || k>vetA.length) {
		 System.out.println("O valor de k é inválido");
		}
		Arrays.sort(vetA);
		return vetA[k-1];
	}
	
	//questão 11
	public static boolean igualdade(int vetA[],int vetB[]) {
		
		if(vetA.length != vetB.length) {
			return false;
		}
		
		for (int i = 0; i < vetB.length; i++) {
			if(vetA[i] != vetB[i]) {
				return false;
			}
		}
		return true;
	}
	
	//questão 12
	public static double potenciacao(double base, int expoente) {
		
		if(expoente<0){
			System.out.println("O expoente não pode ser negativo!");
		}
		if(expoente==0) {
			return 1;
		}
		double resultado =1;
		
		for (int i = 0; i <expoente; i++) {
			resultado*=base;
		}
		return resultado;
	}
	
	//questão 13
	public static boolean primo(int numero) {
		if(numero <=1) {
			return false;
		}
		for (int i = 2; i<numero; i++) {
			if(numero%i==0) {
				return false;
			}
		}
		return true;
	}
	
	//questão 14
	public static float[] ocorrencia(float vetA[], float vetB[]) {
		int cont=0;
		for (int i = 0; i < vetA.length; i++) {
			for (int j = 0; j < vetB.length; j++) {
				if(vetA[i]==vetB[j]) {
					cont++;
				}
			}
		}
		
		float vetC[]= new float [cont];
		
		cont=0;
		int cont2=0;
		for (int k = 0; k < vetC.length; k++) {
			cont2=0;
			for (int i = cont; i < vetA.length; i++) {
				for (int j = 0; j < vetB.length; j++) {
					if(vetA[i]==vetB[j]) {
						vetC[k]=vetB[j];
						cont2++;
						break;	
					}
				}
				cont++;
				if(cont2>0) {
					break;
				}
			}
		}
		return vetC;
	}
		//questão 15
		public static float[] remocaoDeElemento(float vet1[], float num) {
		
		int cont=0;
		
		for(int i=0; i<vet1.length; i++) {
			if(vet1[i]==num) {
				cont++;
			}
		}
		
		float vet2[]=new float[vet1.length-cont];
		
		cont=0;
		for(int i=0; i<vet2.length; i++) {
			for(int j=cont; j<vet1.length; j++) {
				if(vet1[j]!=num) {
					vet2[i]=vet1[j];
					cont++;
					break;
				}
				cont++;
			}
		}
		return vet2;
		
	}
	
	//questão 16
	public static boolean palindromo(String palavra) {
		
		int comprimento= palavra.length();
		
		for (int i = 0; i<comprimento; i++) {
			if(palavra.charAt(i) != palavra.charAt(comprimento - 1 -i)) {
				return false;
			}
		}
		return true;
	}
	
	//questão 17
		public static boolean primo2(int numero) {
			if(numero <=1) {
				return false;
			}
			for (int i = 2; i<numero; i++) {
				if(numero%i==0) {
					return false;
				}
			}
			return true;
		}
	
	//questão 18
		public static String inverter(String palavra) {
			int tamanho= palavra.length();
			char[] caracteresInvertidos= new char[tamanho];
			
			for (int i = 0; i < tamanho; i++) {
				caracteresInvertidos[i] = palavra.charAt(tamanho -1 -i);
			}
			return new String (caracteresInvertidos);
		}
	
		//questão 19
		public static double juroscompostos(double valorinicial, double taxa, int periodos) {
			double valorfinal= valorinicial;
			
			for (int i = 0; i < periodos; i++) {
				valorfinal*=(1+taxa);
			}
			return valorfinal;
		}
		
		//questão 20
		public static boolean perfeito(int numero) {
			
			int somadivisores=1;
			for (int i = 2; i < numero; i++) {
				if(numero%i==0) {
					somadivisores+= i;
				}
			}
			return somadivisores==numero;
		}
		
		//questão 21
		public static int[] dimvet(int tamanho) {
			
			int vetor[]= new int[tamanho];
			int valor= 1;
			
			for (int i = 0; i < tamanho; i++) {
				vetor[i]=valor;
				valor++;
			}
			return vetor;
		}
		
	public static void main(String[] args) {
		
//		1) Somatório: Seu método deverá receber um vetor como parâmetro e retornar
//		a soma de todos elementos do vetor, sendo que as primeiras duas e as
//		últimas posições do vetor de entrada não devem ser consideradas;
		
//		float vet[]= {1,3,6,9,12,30,15};
		
//		System.out.println(somatorio(vet));
		
//		2) Números pares: Seu método deverá imprimir todos os números pares dentre
//		um número inicial e final informado como parâmentro do método.
		
//		int inicio= 12, fim= 20;
//		numerospares(inicio,fim);
		
//		3) Média: Seu método deverá receber dois vetores como entrada e retornar a
//		média dos valores presentes nos vetores.
		
//		int vetA[]= {5,2};
//		int vetB[]= {2,3};
//		
//		System.out.println(media(vetA,vetB));
		
//		4) Média ponderada: Seu método deverá receber um vetor de notas e um vetor
//		de pesos correspondentes. Seu método deve retornar a média ponderada
//		das notas. Exemplo: [7, 8, 6], [2, 3, 1] -> 7.33
//		
//		int notas[]= {7,8,6};
//		int pesos[]= {2,3,1};
//				
//		System.out.println(mediaponderada(notas,pesos));
		
//		5) Contagem de elementos: Seu método deverá receber dois vetores e um
//		elemento a ser contado. A função deve retornar a quantidade de vezes que
//		esse elemento aparece nos vetores. Exemplo: [1,3, 3, 2, 5],[1, 2, 3, 2, 4],
//		2 -> 3
//		
//		int vetA[]= {1,3,3,2,5};
//		int vetB[]= {1,2,3,2,4};
//		                             
//		System.out.println("Quantidade de números 2 --> " + contagem(vetA,vetB));
		
//		6) Cópia de vetor: Seu método deverá receber um vetor e retornar uma cópia
//		exata desse vetor.
		
//		int vetA[]= {1,3,5,7,8};
//		int vetorcopia[]= copia(vetA);
//		
//		for (int i = 0; i < vetorcopia.length; i++) {
//			System.out.print(vetorcopia[i]);
//		}
//		
//		7) Ordenação crescente: Seu método deverá receber um vetor e retornar o
//		vetor ordenado em ordem crescente. Exemplo: [5, 2, 9, 1, 7] -> [1, 2, 5, 7, 9]
//		
//		int vet[]= {5, 2, 9, 1, 7};
		
//		ordenaçãocresc(vet);
//		
//		for (int i = 0; i < vet.length; i++) {
//			System.out.println("O vetor ordenado na ordem crescente é: " + vet[i]);
		
//		8) Verificação de ordenação: Seu método deverá receber um vetor e verificar
//		se ele está ordenado em ordem crescente. Se sim retornar true.
		
//		int vetA[]= {1,3,2,4,5};
//		
//		if(verificar(vetA)) {
//			System.out.println("Valor está ordenado");
//		}else {
//			System.out.println("Valor não está ordenado");
//		}	
//	 }
		
//		9) K-ésimo maior valor: Seu método deverá receber um vetor e um K e
//		retornar o K-ésimo maior valor presente no vetor.
		
//		int vetA[]= {2,5,3,7,9,12,14,1};
//		int k= 2;
//		int kesimo= kesimomaiorvalor(vetA,k);
//		
//		if(kesimo!=1) {
//			System.out.println("O " + k + "° maior valor do vetor é " + kesimo);
//		}
//		
//		10) K-ésimo menor valor: Seu método deverá receber um vetor e um K e
//		retornar o K-ésimo menor valor presente no vetor.
		
//		int vetA[]= {2,5,3,7,9,12,14,1};
//		int k= 4;
//		int kesimo= kesimomenorvalor(vetA,k);
//		
//		if(kesimo!=1) {
//			System.out.println("O " + k + "° menor valor do vetor é " + kesimo);
//		}
		
//		11) Verificação de igualdade: Seu método deverá receber dois vetores e
//		verificar se eles são iguais, ou seja, se possuem os mesmos elementos na
//		mesma ordem.
		
//	   int vetA[]= {1,2,3,4,7,11};
//	   int vetB[]= {1,2,3,4,7,11};
//	   
//	   System.out.println("Os vetores são iguais? " + igualdade(vetA,vetB));
		
//	   12)Potenciação: Seu método deverá receber dois números, a base e o
//	   expoente, e retornar a potência da base elevada ao expoente.
		
//	   double base= 2.0;
//	   int expoente= 4;
//	   
//	   double potencia= potenciacao(base,expoente);
//	   System.out.println(base + " elevado a " + expoente + " é igual a " + potencia);
		
//	   13)Primo: Seu método deverá receber um número inteiro e verificar se ele é
//	   primo, ou seja, se é divisível apenas por 1 e por ele mesmo.
		
//	   int numero= 16;
//	   if(primo(numero)) {
//		   System.out.println("O número é primo.");
//	   }else {
//		   System.out.println("O número não é primo.");
//	   }
		
//	   14) Busca por ocorrências: Seu método deverá receber dois vetores e deverá
//	   retornar um novo vetor com todos os elementos que aparecem em ambos os
//	   vetores.
//		
		float vetA[]= {1,2,3,4,5,6};
		float vetB[]= {1,2,3,7,8,9};
		float vetor[]= ocorrencia(vetA,vetB); 
//		
		System.out.println("Ocorrências nos 2 vetores: " + Arrays.toString(vetor));
		
//		16)Verificação de palíndromo: Seu método deverá receber uma string e
//		verificar se ela é um palíndromo, ou seja, se pode ser lida da mesma forma
//		de trás para frente. Exemplo: "ana" -> True.
		
//		String palavra= "ana";
//		System.out.println("É um palíndromo? " +palindromo(palavra));
		
//		17)Verificação de número primo: Seu método deverá receber um número
//		inteiro e verificar se ele é um número primo. Exemplo: 7 -> True.

//		  int numero= 16;
//		   if(primo2(numero)) {
//			   System.out.println("O número é primo.");
//		   }else {
//			   System.out.println("O número não é primo.");
//		   }
//	   
//		18)Inversão de string: Seu método deverá receber uma string e retornar a
//		mesma string invertida. Exemplo: "hello" -> "olleh".
//
//		String palavra= "Fischer";
//		System.out.println("A palavra invertida é: " + inverter(palavra));
		
//		19)Cálculo de juros compostos: Seu método deverá receber um valor inicial,
//		uma taxa de juros e um número de períodos. A função deve retornar o valor
//		final após a aplicação dos juros compostos. Exemplo: 1000, 0.05, 3 ->
//		1157.63
		
//		double valorinicial = 1000;
//        double taxa= 0.05;
//        int periodos = 3;
//        
//        double valorfinal= juroscompostos(valorinicial,taxa,periodos);
//        
//        System.out.println("Valor final após os juros compostos: " + valorfinal);
		
//		20)Verificação de número perfeito: Seu método deverá receber um número
//		inteiro e verificar se ele é um número perfeito, ou seja, se a soma dos seus
//		divisores próprios é igual a ele mesmo. Exemplo: 6 -> True
		
//		int numero=6;
//		System.out.println("O número é perfeito? " + perfeito(numero));
//		
//		21)Diminuição do vetor: Seu método deverá receber um número qualquer que
//		represente e criar um vetor com o tamanho informado. Este vetor deverá ter
//		sucessivas diminuições do seu tamanho em um unidade até que seu
//		tamanho seja igual a 1.
		
//		int tamanhoinicial= 5;
//		
//		for (int tamanho= tamanhoinicial; tamanho>=1; tamanho--) {
//			int vetor[]= dimvet(tamanho);
//			System.out.println("Conteúdo do vetor: " + Arrays.toString(vetor));
//		}
	}
}

