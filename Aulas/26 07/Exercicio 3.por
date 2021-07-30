programa
{
	/*
	3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.

	*/


	
	funcao inicio()
	{
		real pq, sq, tq, qq


		escreva("\nInsira o valor do primeiro quadrado: ")
		leia(pq)
		escreva("\nInsira o valor do segundo quadrado: ")
		leia(sq)
		escreva("\nInsira o valor do terceiro quadrado: ")
		leia(tq)
		escreva("\nInsira o valor do quarto quadrado: ")
		leia(qq)


		pq = pq*pq
		sq = sq*sq
		tq = tq*tq
		qq = qq*qq
		
	se(tq>=1000){
		escreva("\nO valor do terceiro quadrado é: ", tq)
		
	}
	
		senao
		escreva("\nO valor do primeiro quadrado é: ", pq, "\nO valor do segundo quadrado é: ",sq, "\nO valor do terceiro quadrado é: ", tq, "\nO valor do quarto quadrado é: ", qq)
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 890; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */