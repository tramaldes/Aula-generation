programa
{
	
	funcao inicio()
	{
		inteiro evento,horas,minutos,segundos
		escreva("Digite a duração do evento em segundos")
		leia(evento)
		horas = evento / 3600
		minutos = (evento %3600) / 60
		segundos = (evento % 3600) % 60
		escreva("o evento durou","horas", "minutos", "segundos.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 302; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */