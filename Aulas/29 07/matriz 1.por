programa
{

/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.*/
	
	funcao inicio()
	{
		inteiro n1[4][6], n2[4][6], m1[4][6],m2[4][6], x, y

		para (x=0;x<4;x++)
		{

			para(y=0;y<6;y++)
			{
				escreva("\nValor de N1: ")
				leia(n1[x][y])
				escreva("\nValor de N2: ")
				leia(n2[x][y])

			m1[x][y] = n1[x][y] + n2[x][y] //a soma
			m2[x][y] = n1[x][y] - n2[x][y] //a diferença

				limpa()
			}
		}

		para (x=0;x<4;x++)
		{
			para(y=0;y<6;y++)
			{
				escreva("\nSoma: ", m1[x][y])
				escreva("\nDiferença: ",m2[x][y])
			}

		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 680; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */