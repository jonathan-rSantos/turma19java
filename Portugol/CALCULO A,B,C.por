programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{	
		inteiro A, B, C, D, R, S
		//R = A+B²  ///  S = B+C²  
		escreva("Digite o 1° numero(A):  \n")
		leia(A) 
			escreva("Digite o 2° numero(B): \n")
			leia(B)
				escreva("Digite o 3° numero(C): \n")
				leia(C)
				R=mat.raiz(A+B,2)
				S=mat.raiz(B+C, 2)
				D= R+S/2
				escreva("O resultado é: \n",D)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 387; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {A, 7, 10, 1}-{B, 7, 13, 1}-{C, 7, 16, 1}-{D, 7, 19, 1}-{R, 7, 22, 1}-{S, 7, 25, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */