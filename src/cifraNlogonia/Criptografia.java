package cifraNlogonia;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Criptografia {
	//Declaração de constantes
	//Define o numero de possibilidades
	private static final int ESPACO_AMOSTRAL = 19;
	
	public static void main(String[] args) {
		//Declaração de variáveis
		String textoOriginal = "";
		String textoCifrado = "";
		//Entrada de dados
		textoOriginal = lerTexto();
		
		//Processamento
		//-> Entra com o texto original e devolve cifrado
		textoCifrado = criptografarTexto(textoOriginal);
		
		//Saída de dados
		System.out.println("Texto Cifrado: " + textoCifrado);
	}

	private static String lerTexto() {
		//Declaração de variaveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		String retorno = "";
		
		//Entrada de dados
		//- try-catch para capturar possíveis erros na entrada de dados
		try {
			System.out.println("Digite uma palavra: ");
			retorno = leitor.readLine();
		} catch (Exception erro) {
			System.out.println("Ocorreu um erro! Tente novamente mais tarde.");
		}
		
		//- retorna o valor digitado para a função principal (main)
		return retorno;
	}
	
	private static String criptografarTexto(String textoOriginal) {
		//Declaração de variáveis
		String textoCifrado = "";
		
		//Processamento
		// -> Monta um array com as consoantes do alfabeto
		char[] consoantes = montarConsoantes();
		
		// -> Transforma o texto original(String) em um array
		char[] arrayTextoOriginal = textoOriginal.toCharArray();
		
		// -> 'For' que "passa" letra por letra do texto original 
		for(int i = 0; i < arrayTextoOriginal.length; i++) {
			// -> Substitui letra original por letra cifrada, formando um texto
			textoCifrado += substituirLetra(arrayTextoOriginal[i], consoantes);
		}
		
		// -> Retorna o texto cifrado
		return textoCifrado;
	}

	private static char[] montarConsoantes() {
		// -> Declara um array com o tamanho do espaço amostral para receber as consoantes
		char[] retorno = new char[ESPACO_AMOSTRAL];
		
		// -> Monta um array com todas as consoantes em ordem alfabética
		retorno[0] = 'b';
		retorno[1] = 'c';
		retorno[2] = 'd';
		retorno[3] = 'f';
		retorno[4] = 'g';
		retorno[5] = 'h';
		retorno[6] = 'j';
		retorno[7] = 'k';
		retorno[8] = 'l';
		retorno[9] = 'm';
		retorno[10] = 'n';
		retorno[11] = 'p';
		retorno[12] = 'q';
		retorno[13] = 'r';
		retorno[14] = 's';
		retorno[15] = 't';
		retorno[16] = 'v';
		retorno[17] = 'x';
		retorno[18] = 'z';
		
		// -> Retorna o array de consoantes
		return retorno;
	}

	private static String substituirLetra(char letraOriginal, char[] consoantes) {
		//Declaração de variáveis
		// -> Variável de retorno
		String retorno = "";
		
		//Processamento
		// -> 'For' que passa por todas as consoantes do alfabeto
		for(int i = 0; i < consoantes.length; i++) {
			
			// -> Verifica se a letra original é uma consoante
			if(letraOriginal == consoantes[i]) {
				//1: Adiciona na variável de retorno a consoante original
				retorno += consoantes[i];
				
				//2: Adiciona na variavel de retorno a vogal mais próxima da consoante original
				// -> Se o índice da consoante for menor ou igual a 1, então a vogal mais próxima é 'a'
				if(i <= 1) {
					retorno += 'a';	
				}
				
				// -> Se o índice da consoante for menor ou igual a 4, então a vogal mais próxima é 'e'
				else if(i <= 4) {
					retorno += 'e';
				}
				
				// -> Se o índice da consoante for menor ou igual a 8, então a vogal mais próxima é 'i'
				else if(i <= 8) {
					retorno += 'i';
				} 
				
				// -> Se o índice da consoante for menor ou igual a 13, então a vogal mais próxima é 'o'
				else if (i <= 13) {
					retorno += 'o';
				} 
				
				// -> Se não se encaixa em nenhum dos casos anteriores, então a vogal mais próxima só pode ser 'u'
				else {
					retorno += 'u';
				}
				
				//3: Adiciona na variavel de retorno a consoante posterior à letra original, na ordem do alfabeto
				// -> Verifica se a letra original é antecessor de 'z'. 
				if(letraOriginal < consoantes[18]) {
					// -> Adiciona na variável de retorno a consoante posterior à letra original: índice + 1
					retorno += consoantes[i + 1];
				}
				else {
					// -> No caso da letra original ser 'z', deve adicionar 'z'.
					retorno += consoantes[18];
				}
				
			}
		}
		
		//4: Vogais não são alteradas
		// -> Se a letra original for uma vogal, retorna a letra sem alterações
		if(retorno == "") {
			retorno += letraOriginal;
		}
		
		// -> Retorna a letra criptografada ou a vogal original
		return retorno;
	}

}
