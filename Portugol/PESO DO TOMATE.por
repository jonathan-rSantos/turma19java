programa
{
	
	funcao inicio()
	{	
		real pesoTomate, exPeso, multa, casoNaoSobre
		real pesoPermitido = 50
			escreva("Olá, informe o peso da carga: ")
			leia(pesoTomate)
            exPeso = pesoTomate - pesoPermitido
            multa = exPeso * 4  
				se (pesoTomate > pesoPermitido){
		escreva("O peso excede o permitido. Excesso do peso é:",exPeso,"\n"
		+ " e o valor da multa é de: ",multa," R$.")			
		}
		senao se(pesoTomate <= pesoPermitido){
			escreva("O valor é permitido. Excesso de peso é:ZERO \n"
			+ "O valor de multa é: ZERO. ")		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 554; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */