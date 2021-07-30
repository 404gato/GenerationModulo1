programa
{

/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/
	
	funcao inicio()
	{
		inteiro numero[5], maiorN=0, x

		para(x=0;x<5;x++)
		{

			escreva("\nDigite um número: ")
			leia(numero[x])

			se(numero[x]>maiorN)
			{
				maiorN = numero[x]
			}
limpa()
			
		}
		para(x=0;x<5;x++)
			{
				escreva("\nValor ", x+1," foi de ",numero[x])
			}
		

			escreva("\nA maior pontuação foi de ",maiorN)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 261; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numero, 9, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */