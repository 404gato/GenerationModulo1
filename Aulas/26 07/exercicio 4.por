programa
{ 
//Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
//número é par ou ímpar, e se é positivo ou negativo.
	
	funcao inicio()
	{
		inteiro num

		escreva("\nDigite um, número: ")
		leia(num)

		se (num > 0)
		escreva("\nSeu número é positivo")
		senao
		escreva("\nSeu número é negativo")

		se (num % 2 == 0)
		escreva("\nSeu número é par")
		senao
		escreva("\nSeu número é impar")

		se (num == 0)
		escreva("\nSeu número é nulo")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 228; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */