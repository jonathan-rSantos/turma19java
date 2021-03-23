programa
{
	
	funcao inicio()
	{
		cadeia times[] = {"PALMEIRAS","SANTOS","SPFC ","CORINTHIANS "} //VETOR 
		inteiro pontos [4] 
		caracter resultadoJogo  

			para(inteiro r=1; r<=4; r++){ //LAÇO DE REPETIÇÃO RODADA
				escreva("Rodada", r, "\n")
				para(inteiro y=0; y<4; y++) // LAÇO DE REPETIÇÃO TIMES, SOMANDO PONTOS
				{
					escreva(times[y], " G-ganhou, E-empatou ou P-perdeu? \n")
					leia(resultadoJogo)
					se(resultadoJogo == 'g' ou resultadoJogo == 'G'){  
						pontos[y] += 3 //TOTALIZADOR
						
					}  
					senao se(resultadoJogo == 'E' ou resultadoJogo == 'e'){
					pontos[y] += 1
					}
					senao se(resultadoJogo == 'p' ou resultadoJogo == 'P'){
					pontos[y] += 0
					} 
					}
					}
						escreva("RESULTADOS\n")
							para(inteiro z=0; z<4; z++){ //LAÇO DE REPETIÇÃO PARA RESULTADO
							escreva(times[z], ": ", pontos[z],"\n")
		}			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 160; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */