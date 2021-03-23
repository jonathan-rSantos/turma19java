programa
{
	inclua biblioteca Util
	inclua biblioteca Calendario
			
		funcao inicio()
			{
			real data = 0.0
			real saldo = 100.00
			logico ativo
			inteiro numero, senha
			inteiro agencia, cpf, numeroCpf = 321, numeroSenha =123
			real saldo1 = 0.00 ,saldoPoupanca = 0.00, debito, credito, limiteContaEspecial = 1000.00
			real emprestimoEmpresa = 10000.00
			real limiteEstudantil = 5000.00
			real valorLimiteEspecial = 1000.00
			logico ativa
			inteiro contadorTalao = 3  
		
			faca {
				caracter aux
				escreva("BANG-9 \n")
				escreva("O TIRO CERTO NA MELHOR OPÇÃO\n")
				escreva("Digite seu CPF e SENHA:\nCPF:")
				leia(cpf) 
				limpa()
				escreva("\nSENHA:")
				leia(senha)
				limpa()
				escreva("\n1- Conta ativa \n2- Conta inativa:\n")
				leia(aux)
				limpa()
				se(aux == '1'){
					ativo = verdadeiro
				}
					senao {
						ativo = falso 
						}
						Util.aguarde(1500)
						limpa()
				}
					enquanto (cpf != numeroCpf ou senha != numeroSenha)
							
						escreva("1- CONTA POUPANÇA\n")
						escreva("2- CONTA CORRENTE\n")
						escreva("3- CONTA ESPECIAL\n")
						escreva("4- CONTA EMPRESA\n")
						escreva("5- CONTA ESTUDANTIL\n")			
						leia(numero)
						limpa()
				se (numero == 1)
				{
					escreva("Informe a data de seu aniversario: ")
					leia(data)
				}
				se (data == Calendario.dia_mes_atual()){
					saldo = (saldo * 0.05) + saldo
					escreva("Seu saldo foi atualizado para R$ ",saldo)
					escreva("\nCONTA POUPANÇA\n SALDO ATUAL: ", saldo)
						
					para(inteiro m=1; m<=10; m++){
						escreva("\nGostaria de retirar um valor, da poupança? \n"
						+ "Se sim digite (1) se não digite (2):\n ")
						leia(numero)
						se (numero == 1){
							escreva("Digite o valor: \n")
							leia(numero)
							limpa()
							saldo -= numero
							saldo1 += numero 
							escreva("Processo realizado. \nSeu saldo em conta corrente é:", saldo1 )
							escreva("\nsaldo da poupança: ", saldo)
							enquanto(saldo != 0)  {
								limpa()
								escreva("FIM DA OPERAÇÃO!")
								pare
							}
				}
				senao se(numero == 2){
					escreva("FIM DE OPERAÇÃO")
				}
				}
				}
				senao se(numero == 2){
					escreva("CONTA CORRENTE\n SALDO ATUAL: ", saldoPoupanca)
				}
				senao se (numero == 3){
					escreva("CONTA ESPECIAL\n LIMITE ESPECIAL DE: ", limiteContaEspecial)
					para(inteiro m=1; m<=10; m++){
						escreva("\nGostaria de retirar um valor, do limite especial?"
						+ "Se sim digite (1) se não digite (2):\n ")
						leia(numero)
							se (numero == 1){
								escreva("Digite o valor: ")
								leia(valorLimiteEspecial)
								limpa()
								saldo += valorLimiteEspecial
								limiteContaEspecial = limiteContaEspecial - valorLimiteEspecial
								escreva("Processo realizado. \nSeu saldo em conta corrente é:", saldo1  )
								escreva("\nsaldo do limite especial: ", limiteContaEspecial)
				}
				senao se(numero == 2){
					limpa()
					escreva("FIM DA OPERAÇÃO!")
				pare
				}
				}
				}
				senao se(numero == 4){
					para(inteiro j=0; j<=10; j++){
						escreva("CONTA EMPRESA\n LIMITE EMPRESA: ", emprestimoEmpresa,
						+ "Se sim digite (1) se não digite (2):\n ")
						leia(numero)
				se (numero == 1){
					escreva("Digite o valor: ")
					leia(emprestimoEmpresa)
					limpa()
					saldo += emprestimoEmpresa
					emprestimoEmpresa = emprestimoEmpresa - emprestimoEmpresa
					escreva("Processo realizado. \nSeu saldo em conta corrente é:", saldo1  )
					escreva("\nsaldo do emprestimo empresa: ", emprestimoEmpresa)
				}
				senao se(numero == 2){
					limpa()
					escreva("FIM DA OPERAÇÃO!")
				pare
				}
				}
				}
				senao se(numero == 5) {
					para(inteiro j=0; j<=10;j++){
						escreva("CONTA ESTUDANTIL\n LIMITE ESTUDANTIL: ", limiteEstudantil,
						+ "\n", "\nGostaria de retirar um valor, do emprestimo empresa? \n"
						+ "Se sim digite (1) se não digite (2):\n ")
						leia(numero)
				se (numero == 1){
					escreva("Digite o valor: ")
					leia(limiteEstudantil)
					limpa()
					saldo += limiteEstudantil
					limiteEstudantil = limiteEstudantil - limiteEstudantil
					escreva("Processo realizado. \nSeu saldo em conta corrente é:", saldo1  )
					escreva("\nsaldo do limite estudantil: ", limiteEstudantil)
				}
				}
				}
				senao{
					escreva("FIM DA OPERAÇÃO, VOLTE SEMPRE!\n")
					leia(numero)
				}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1961; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */