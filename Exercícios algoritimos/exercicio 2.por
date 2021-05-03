programa
{
	
	funcao inicio()
	{
		inteiro totaldedias,idadeanos,idademeses,idadedias,resto
		escreva("Escreva sua idade em dias: ")
		leia(totaldedias)

		idadeanos = totaldedias / 365
		idademeses = (totaldedias % 365) / 30
		idadedias = (totaldedias % 365) % 30 
		escreva("Respósta:", idadeanos, "anos", idademeses, "meses", idadedias, "dias") 
	     

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 270; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */