programa
{
	inclua biblioteca Matematica-->mat
/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.*/


	funcao inicio()
	{
		real media_sal=0.0
		inteiro x, filhos,maior_sal=0,renda, percent=0,media_filho=0

		para(x=1;x<=4;x++)
		{
			limpa()
			escreva("\nNúmero de filhos: ")
			leia(filhos)
			escreva("\nRenda familiar: ")
			leia(renda)

			media_filho+=filhos // media = media + filhos
			media_sal+=renda // media = media + salario

			se (renda>maior_sal) //se a renda digitada for maior que o maior salario(que de inicio é 0)
				maior_sal=renda // será atribuida ao maior_sal e ele passará a ter aquele valor digitado

			se (renda<=100) {// será atribuido a porcentagem +1 a cada  
				percent++ // salário no valor de 100 ou menos
			
			}
				
				
		}

		limpa()
		escreva("\nA média de salário é de ",mat.arredondar(media_sal/4,1))
		escreva("\nA média de filhos é de ",media_filho/4)
		escreva("\nO maior salário é de ",maior_sal)
		escreva("\nA taxa de pessoas com salário até R$100 é de ",percent*25)//100 dividido por 20 é 5 ou 100 dividido por 4 é 25

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1010; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */