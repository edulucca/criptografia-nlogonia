package cifraNlogonia;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Criptografia {
	//Declara��o de constantes
	//Define o numero de possibilidades
	private static final int ESPACO_AMOSTRAL = 19;
	
	public static void main(String[] args) {
		//Declara��o de vari�veis
		String textoOriginal = "";
		String textoCifrado = "";
		//Entrada de dados
		textoOriginal = lerTexto();
		
		//Processamento
		//-> Entra com o texto original e devolve cifrado
		textoCifrado = criptografarTexto(textoOriginal);
		
		//Sa�da de dados
		System.out.println("Texto Cifrado: " + textoCifrado);
	}

	private static String lerTexto() {
		//Declara��o de variaveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		String retorno = "";
		
		//Entrada de dados
		//- try-catch para capturar poss�veis erros na entrada de dados
		try {
			System.out.println("Digite uma palavra: ");
			retorno = leitor.readLine();
		} catch (Exception erro) {
			System.out.println("Ocorreu um erro! Tente novamente mais tarde.");
		}
		
		//- retorna o valor digitado para a fun��o principal (main)
		return retorno;
	}
	
	private static String criptografarTexto(String textoOriginal) {
		//Declara��o de vari�veis
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
		// -> Declara um array com o tamanho do espa�o amostral para receber as consoantes
		char[] retorno = new char[ESPACO_AMOSTRAL];
		
		// -> Monta um array com todas as consoantes em ordem alfab�tica
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
		//Declara��o de vari�veis
		// -> Vari�vel de retorno
		String retorno = "";
		
		//Processamento
		// -> 'For' que passa por todas as consoantes do alfabeto
		for(int i = 0; i < consoantes.length; i++) {
			
			// -> Verifica se a letra original � uma consoante
			if(letraOriginal == consoantes[i]) {
				//1: Adiciona na vari�vel de retorno a consoante original
				retorno += consoantes[i];
				
				//2: Adiciona na variavel de retorno a vogal mais pr�xima da consoante original
				// -> Se o �ndice da consoante for menor ou igual a 1, ent�o a vogal mais pr�xima � 'a'
				if(i <= 1) {
					retorno += 'a';	
				}
				
				// -> Se o �ndice da consoante for menor ou igual a 4, ent�o a vogal mais pr�xima � 'e'
				else if(i <= 4) {
					retorno += 'e';
				}
				
				// -> Se o �ndice da consoante for menor ou igual a 8, ent�o a vogal mais pr�xima � 'i'
				else if(i <= 8) {
					retorno += 'i';
				} 
				
				// -> Se o �ndice da consoante for menor ou igual a 13, ent�o a vogal mais pr�xima � 'o'
				else if (i <= 13) {
					retorno += 'o';
				} 
				
				// -> Se n�o se encaixa em nenhum dos casos anteriores, ent�o a vogal mais pr�xima s� pode ser 'u'
				else {
					retorno += 'u';
				}
				
				//3: Adiciona na variavel de retorno a consoante posterior � letra original, na ordem do alfabeto
				// -> Verifica se a letra original � antecessor de 'z'. 
				if(letraOriginal < consoantes[18]) {
					// -> Adiciona na vari�vel de retorno a consoante posterior � letra original: �ndice + 1
					retorno += consoantes[i + 1];
				}
				else {
					// -> No caso da letra original ser 'z', deve adicionar 'z'.
					retorno += consoantes[18];
				}
				
			}
		}
		
		//4: Vogais n�o s�o alteradas
		// -> Se a letra original for uma vogal, retorna a letra sem altera��es
		if(retorno == "") {
			retorno += letraOriginal;
		}
		
		// -> Retorna a letra criptografada ou a vogal original
		return retorno;
	}

}
