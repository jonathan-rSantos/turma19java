programa
{
	
	funcao inicio(){
		
		
		cadeia nome
		inteiro anos 
		inteiro mes 
		inteiro dia 
		 inteiro revercao 
		escreva("Olá, digite seu nome :\n")
		leia(nome)
		limpa()
			escreva(nome, ", digite sua idade (somente em anos): \n")
			leia(anos)
				escreva("digite sua idade (somente em meses): \n")
					leia(mes)
					escreva("dias idade (somente em dias) : \n")
						leia(dia)
						limpa()
						dia = (dia+(anos*365)+(mes*30))
   						escreva("Sua idade em dias é: ",dia, "\n")
   						escreva("Agora, ", nome, ", se deseja reverter resutado em anos, novamente, digite(1) \n")
   						leia(revercao)
   						revercao = (dia/365)
   						escreva("Após reverção, em anos sua idade é :", revercao, " anos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 581; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */