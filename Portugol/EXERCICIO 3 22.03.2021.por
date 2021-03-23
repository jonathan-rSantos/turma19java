programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro matrizN1 [3] [3]
		inteiro matrizN2[3] [3]
		inteiro matrizSoma [3] [3]
		inteiro totalDiagonal = 0
		inteiro diferenca =0
		inteiro numero = 0
		inteiro coluna = 0

		para (inteiro linha = 0; linha <3; linha ++) {
			para (coluna = 0; coluna <3; coluna ++)
			{
			escreva("Leia numero da linha ", linha+1," coluna ",coluna+1,": \n")
			leia(matrizN1[linha][coluna])
			}
			}
			para (inteiro linha = 0; linha <3; linha ++) {
				para (coluna = 0; coluna <3; coluna ++)
			{
					escreva("Leia numero da linha ", linha+1," coluna ",coluna+1,": \n")
					leia(matrizN2[linha][coluna])	
					matrizSoma [linha] [coluna] = matrizN1 [linha] [coluna] + matrizN2 [linha] [coluna]		
			}
			}
			limpa()
			escreva ("Matriz N1\n")
			para (inteiro linha = 0; linha <3; linha ++) {
				para (coluna = 0; coluna <3; coluna ++)
			{
									escreva(matrizN1 [linha] [coluna], ",")
			}
									escreva ("\n") 
			}
			escreva ("Matriz N2\n")
				para (inteiro linha = 0; linha <3; linha ++) {
					para (coluna = 0; coluna <3; coluna ++)
			{
			escreva(matrizN2 [linha] [coluna], ",")
			}
			escreva ("\n")
		}
			escreva ("Soma de matrizes\n")
				para (inteiro linha = 0; linha <3; linha ++) {
					para (coluna = 0; coluna <3; coluna ++)
			{
				escreva(matrizSoma [linha][coluna], ",")
			}
			escreva ("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1377; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */