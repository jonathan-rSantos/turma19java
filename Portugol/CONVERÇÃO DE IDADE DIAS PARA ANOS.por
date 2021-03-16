programa
{
	
//dias 8501 dias
	funcao inicio()
	{
		cadeia nome
		inteiro anosEmDias
		inteiro mes
		inteiro dias
		inteiro anos
		escreva("Olá, digite seu nome :\n")
		leia(nome)
		limpa()
			escreva(nome, ", digite sua idade (somente em dias: \n")
			leia(anosEmDias)
			limpa()
			anos = (anosEmDias/365)
			mes = (anosEmDias%365)/ 30 
			dias = (anosEmDias%365) % 30
			
			escreva("A idade é ", anos, " anos e ", mes," mes ", dias, "dias") 
			
	}
	
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 370; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */