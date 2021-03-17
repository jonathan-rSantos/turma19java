programa

{
	
	funcao inicio()
	{
		real indice
		escreva("digite o indice de poluição: \n")
		leia(indice)
		se ((indice >= 0.05) e indice <= 0.25) {
			escreva("Indice dentro dos valores aceitaveis")
		}
		senao se((indice > 0.25) e indice < 0.4) {
			escreva("Parlizar atividades apenas do 1° grupo. ")
		}
		senao se((indice >= 0.4) e indice <0.5) {
			escreva("Paralizar atividades do 1° e 2° grupo. ")
		}
		senao se(indice>=0.5){
			escreva("PARAR TODAS AS ATIVIDADES. ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 352; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */