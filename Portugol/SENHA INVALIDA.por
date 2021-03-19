programa
{	
	
	funcao inicio()
	{
		cadeia senha 
		inteiro contador = 0
		escreva("Digite a senha. ")
		leia(senha) 	
		
		enquanto(senha != "123") {
			escreva("Senha invalida, tente de novo .")
			leia(senha)
			contador ++
			se (contador > 3){
				escreva("Você digitou a senha 3 vezes. ")
				pare
			}
		}
			escreva("Programa finalizado. ")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 253; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */