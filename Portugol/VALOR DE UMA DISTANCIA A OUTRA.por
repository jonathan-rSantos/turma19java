programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro X1,X2,Y1,Y2, C
		escreva("Olá, vamos calcular a distancia entre dois pontos,"
		+ " Qual o valor X1? \n")
		leia(X1)
		escreva("Qual o valor X2? \n")
		leia(X2)
		escreva("qUAL O VALOR Y1 \n")	
		leia(Y1)
		escreva("Qual o valor Y2 \n")
		leia(Y2)
		C = (X2-X1) * (X2-X1) + (Y2-Y1) * (Y2-Y1)
			escreva("A distancia entre os dois pontos é: ", C)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 247; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */