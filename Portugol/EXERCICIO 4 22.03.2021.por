programa
{
	
	funcao inicio()
	{	//exercicio 4
		inteiro matriz[3][3]
		inteiro totalDiagonal = 0

		para(inteiro linha=0;linha<3;linha++){
			para(inteiro coluna=0; coluna<3; coluna++)
			{
				escreva("Digite o valor da linda",linha+1," coluna",coluna+1," :")
				leia(matriz[linha][coluna])
				se(linha == coluna){
					totalDiagonal += matriz[linha][coluna]
				}
			}
		}
			escreva("Forma de matriz\n")
			para(inteiro linha=0;linha<3;linha++){
			para(inteiro coluna=0; coluna<3; coluna++)
			{
				escreva(matriz[linha][coluna], ",")
			}
			escreva("\n")
		}
			escreva("Valor da diagonal principal: ", totalDiagonal)
	

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 635; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */