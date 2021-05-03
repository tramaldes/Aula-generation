programa
{
	
	funcao inicio()
	{
		inteiro idadeDias,idadeAnos,idadeMeses, totalidade
		escreva("\nEscreva sua idade em anos:") 
		leia(idadeAnos) 
		escreva("\nEscreva sua idade em meses:")
		leia(idadeDias)
		escreva("\nEscreva sua idade em dias:")
		leia(idadeMeses)
		
		totalidade = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias
		
		escreva("\nO total da sua idade em dias é:",
		totalidade)

	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 406; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */