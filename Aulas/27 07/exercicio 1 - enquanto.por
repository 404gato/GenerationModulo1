programa
{ 
		inclua biblioteca Matematica -->mat
/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo.*/
	
	funcao inicio()
	{
		inteiro nro=0, soma=0, qnt=0
		real media=0.0

		

		enquanto (nro >= 0) //enquanto for menor q zero
		{
		
			escreva("\nDigite um número: ")
			leia(nro)

			soma+=nro // soma = soma + número
			qnt++ // quantidade = quantidade + 1
		}

		limpa()

		media = soma/qnt

		escreva("\nValores inseridos: ", qnt, "\nSoma total: ",soma, "\nMédia total: ", mat.arredondar(media,1))

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 427; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */