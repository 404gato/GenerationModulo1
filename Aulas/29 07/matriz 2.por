programa
{

/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/
	
	funcao inicio()
	{
		inteiro numero[3][3], l, c, somaDiag=0,soma=0

		para(l=0;l<3;l++)
		{
			para(c=0;c<3;c++)
			{
				escreva("\nDigite um número: ")
				leia(numero[l][c])

				soma+= numero[l][c]
				somaDiag = numero[0][0] + numero[1][1] + numero[2][2]
				
			}
		}

				limpa()
				
				escreva("\nA soma da diagonal principal é de: ",somaDiag)
				escreva("\nE a soma de todos os números é: ", soma)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */