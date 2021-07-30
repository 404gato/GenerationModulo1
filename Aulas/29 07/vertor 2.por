programa
{ 
/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/
	
	funcao inicio()
	{
		inteiro dado[10], soma=0,media=0, maiorP=0,x, qntMaior=0
		
		para(x=0;x<10;x++)
		{
			escreva("\nValor do dado: ")
			leia(dado[x])

			se(dado[x]>maiorP)
			{
			maiorP = dado[x]
			qntMaior=0 //aqui zera a quantidade de vezes contadas como maior
			}
			se(dado[x] == maiorP)
			{
				qntMaior++
			}

		soma+=dado[x]

		}

		media = soma /10
		
		limpa()
		

		escreva("\nA média dos valores foi de: ",media)
		escreva("\nVocê tirou sua maior pontuação ",qntMaior," vez(es)")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 509; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {dado, 10, 10, 4}-{maiorP, 10, 36, 6}-{qntMaior, 10, 48, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */