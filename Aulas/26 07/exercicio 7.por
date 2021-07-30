programa
{
/*Receber valores de base e altura de um triângulo e verificar se são valores válidos
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.*/
	
	funcao inicio()
	{
		inteiro case
		real area, base, altura
		
		escreva("\nInsira o valor da base: ")
		leia(base)
		escreva("\nInsira o valor da altura: ")
		leia(altura)

		area = (base*altura)/2

		se (altura > 0.0 e base > 0.0){
		 case = 1
		}
			
		senao{
		case = 0
	}

	limpa()
			escolha(case){

			caso 1:
			escreva("\nO resultado da area é de ",area, "cm")
			pare
			caso 0:
			escreva("\nNão é possível calcular a área")

			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 473; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */