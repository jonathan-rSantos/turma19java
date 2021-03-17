programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro fabricacao, impostos, distribuidor
		
		//destribuição 0.28 //imposto 0.45 
		escreva("Digite o custo de valor do caro e calcularemos osimpostos: \n")
		leia(fabricacao)
		distribuidor= fabricacao*28/100
		impostos= fabricacao*45/100
		escreva("O valor de destribuição é de: ", distribuidor, "\n" 
		+ "E o valor de impostos é de: ", impostos ," \n")
			escreva("O valor final e de: ", fabricacao+distribuidor+impostos)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 513; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */