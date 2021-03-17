programa
{
	
	funcao inicio()
	{
		inteiro positivo
		inteiro numero
		inteiro numero2
		
		escreva("Digite um valor e irei lhe dizer se é par ou impar: \n")
		leia(positivo)
		numero = positivo%2
		numero2 = positivo%2
		
		se (positivo == 0){
		escreva("O numero é neutro")}
		
		senao se (positivo < 0) {
			
		escreva("Numero negativo") }
		senao se (positivo < 0) {
			
		escreva("Numero impar negativo") }
		
		senao se((numero % 2) == 0)
		{ escreva("O numero par positivo ")	} 
		
		senao {
			escreva("O numero é impar positivo")}
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 307; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */