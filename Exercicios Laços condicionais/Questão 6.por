programa
{
	
	funcao inicio()
	{
		inteiro idade
		escreva("Qual a sua idade? ")
		leia(idade)
          se (idade >= 5 e idade <= 7) 
          escreva("Você está na categoria INFANTIL A")

		senao se(idade >= 8 e idade <= 10) {
			escreva("Você está na categoriaa INFANTIL B")
		}senao se(idade >= 11 e idade <=13){
			escreva("Você está na categoria JUVENIL A")
		}senao se(idade >=14 e idade <=17){
			escreva("Você está na categoria JUVENIL B")
		}senao se(idade >= 18){
			escreva("Você está na categoria ADULTO")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 535; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */