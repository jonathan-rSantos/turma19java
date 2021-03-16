programa
{
	
	funcao inicio()
	{

	real mp,n1,n2,n3,med
	inteiro p1, p2, p3 
	escreva("Digite as notas: \n")
	leia(n1)
	limpa()
		escreva("Nota1: ", n1, "\n")
		leia(n2)
			escreva("Nota2: ", n2, "\n")
			leia(n3)
				escreva("Nota3: ", n3, "\n")
					escreva("Agora, digite o peso das provas: \n")
					leia(p1)
					limpa()
						escreva("Peso1: ", p1, "\n")
						leia(p2)
							escreva("Peso2: ", p2, "\n")
							leia(p3)
								escreva("Peso3: ", p3, "\n")
									mp =( (n1*p1)+(n2*p2)+(n3*p3)) /(p1+p2+p3)
										escreva("A média ponderada é: ", mp, "\n")

								se (mp >=7){
									escreva("ALUNO APROVADO.")}
										senao se(mp< 4){
											escreva("ALUNO REPROVADO")}
													senao {
														escreva("ALUNO DE RECUPERAÇÃO")
		}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 748; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */