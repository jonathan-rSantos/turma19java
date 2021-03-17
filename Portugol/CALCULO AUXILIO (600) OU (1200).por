programa

{
	
	funcao inicio()
	{
//nome //chefa de familia recebe 1200 // se nao 600reais 
		cadeia nome, chefa
		
		escreva("Bom dia, qual o seu nome? \n")
		leia(nome)
		limpa()
			escreva(nome, ", você é chefe/a de familia? \n" 
			+ "Digite: sim ou não. ")
			leia(chefa)
			limpa()
				se (chefa == "sim" ou chefa == "Sim" ou chefa == "SIM"){
				escreva(nome, ", você irá receber R$ 1.200.00 de auxilio. ") 	}
					
					senao se (chefa == "nao" ou chefa == "Nao" ou chefa == "Não"
					ou chefa == "não" ou chefa == "NAO" ou chefa == "NÃO"){
					escreva(nome, ", você ira receber R$ 600.00 de auxilio. ")}
						
						senao {
						escreva(nome, ", opção invalida, digite sim ou não. \n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 671; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */