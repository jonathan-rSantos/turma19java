programa
{
	
	funcao inicio()
	{
		real a,b,c,d,f,g,h,i,j
		escreva("Digite 4 numeros: ")
		leia(a)
		escreva("Segundo numero: ")
		leia(b)
		escreva("Terceiro numero: ")
		leia(c)
		escreva("Quarto numero: ")
		leia(d)
		f = a*a
		g = b*b
		h = c*c
		i = d*d
		se (f >=1000){
		escreva ("Primeiro N° é Maior ou igual a 1000 é\n",f)}
		senao se (g >=1000){
		escreva ("Primeiro N° é Maior ou igual a 1000 é\n",g)}
		senao se (h >=1000){
		escreva ("Primeiro N° é Maior ou igual a 1000 é\n",h)}
		senao se (i >=1000){
		escreva ("Primeiro N° é Maior ou igual a 1000 é\n",i)
	}
	senao{ 
		escreva(f, "/", g ,"/", h, "/", i )
		}
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 622; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */