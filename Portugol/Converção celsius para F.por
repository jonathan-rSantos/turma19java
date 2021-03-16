programa{


	inclua biblioteca Matematica 
	
	funcao inicio()
	{
		cadeia nome 
		real celsius
		real F

		escreva("Olá, digite seu nome: \n")
		leia(nome)
		limpa()
		escreva(nome,", agora, digite a temperatura em fahrenheit : \n")
		leia(F)
		limpa()
		celsius = (F - 32) * 5/9 
		escreva(nome , " ,a convercao de celsius para fahrenheit, é : ", Matematica.arredondar(celsius, 1))
	
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 391; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */