programa
{
	
	funcao inicio()
	{
//Um dado é lançado 10 vezes e o valor correspondente é anotado. 
//Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
//A seguir determine e imprima a média aritmética dos lançamentos
//contabilize e apresente também quantas foram as ocorrências da maior pontuação.
		inteiro lancado,d
		inteiro dado[10]
		real totalDado = 0
		real mediaAritmetica

		escreva("Digite o numero de cada lançamento: \n")
		para(d=0; d<10; d++){
			leia(dado[d])
		} 
		limpa()
		para(d=0; d<10; d++){
			escreva(dado[d],",")
		}
		escreva("\nA média artmética é de: ")
		para(d=0;d<10;d++){
			totalDado = totalDado + dado[d]
			
		}
		escreva(totalDado/10)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 563; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */