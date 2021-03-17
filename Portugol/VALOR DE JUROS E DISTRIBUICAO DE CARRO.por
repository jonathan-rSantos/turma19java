programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{	real fabricacao, impostos, distribuidor
		
		
		escreva("Digite o custo de valor do caro e calcularemos os impostos: \n")
		leia(fabricacao)
		distribuidor= mat.arredondar((fabricacao*0.28), 2 )
		impostos= mat.arredondar((fabricacao*0.45), 2)
		escreva("O custo é de: ", fabricacao,"\n" 
		+ "O valor de destribuição é de: ", distribuidor, "\n" 
		+ "E o valor de impostos é de: ", impostos ," \n")
			escreva("O valor final e de: ", fabricacao+distribuidor+impostos)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 260; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */