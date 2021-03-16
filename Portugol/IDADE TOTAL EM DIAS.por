programa {

	
	inclua biblioteca Matematica
	funcao inicio()
	{
		cadeia nome
		inteiro anos 
		inteiro mes 
		inteiro dia  
		escreva("Olá, digite seu nome :\n")
		leia(nome)
		limpa()
			escreva(nome, ", digite sua idade (somente em anos): \n")
			leia(anos)
			limpa()
				escreva("digite sua idade (somente em meses): \n")
					leia(mes)
					limpa()
					escreva("dias idade (somente em dias) : \n")
						leia(dia)
						dia = (dia+(anos*365)+(mes*30))
   						escreva("Sua idade em dias é: ",dia )

	
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