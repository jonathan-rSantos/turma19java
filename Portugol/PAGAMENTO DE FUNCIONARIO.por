programa
{
	
	funcao inicio()
	{
		real horasAdicionais
		real horasPermitidas = 50
		real salario
		real horas
		real exPagamento	
		escreva("Quantas horas o operario trabalhou: \n")
		leia(horas)
		limpa()
			exPagamento = horas - horasPermitidas
			horasAdicionais = exPagamento*20
			salario = horas*10+horasAdicionais
			
				se(horas>horasPermitidas){
			escreva("O funcionario excedeu: ",exPagamento, 
			+ " Horas, de sua jornada. \n", "seu salario é: ", salario, 
			+".\nValor monetario excedente é de: ", horasAdicionais)
		}
		senao se(horas==horasPermitidas){
			escreva("O funcionario não excedeu sua jornada de trabalho. ")	
		}
		senao {
			escreva("O fucionario não cumpriu sua jornada de trabalho. ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 38; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */