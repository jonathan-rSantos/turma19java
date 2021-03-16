programa
{
	
	funcao inicio()
	{

	//Faça um sistema que leia o tempo de duração de um evento em uma fábrica 
	//expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
		inteiro segundos, horas, minutos, seg

		escreva("Descreva a duração do evento (Em segundos): \n")
		leia(segundos)
		limpa()
		horas = segundos/3600
		minutos = segundos % 60
		seg = segundos % 60
		escreva("O evento durou ", horas, " Horas, ", minutos," minutos", " e ", seg, " segundo")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 362; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */