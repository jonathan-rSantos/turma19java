programa
{
	
	funcao inicio()
	{
	
//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade
//e o escreva em seguida. Encontre após a maior pontuação e a apresente.

		inteiro leitura[5]
		inteiro maior = 0
		inteiro R
		
		escreva("Digite o valor de cada pontuação: \n")
		 para (R=0; R<5; R++){
		 	escreva("Pontuação ", R+1, " :")
		 	leia(leitura[R]) 
		 se(leitura[R] > maior){
		 	maior = leitura[R]
		 }
		 }
		 para (R=0 ; R<5 ; R++) {
		 escreva(leitura[R], ",") 
		 } 
		 escreva("\nA maior pontuação é: ", maior)
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 538; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */