package estruturasCondicionaisEDeRepeticao;

import java.util.Random;

public class Repeticao {

	public static void main(String[] args) {
		// TODO While em Java 
		System.out.println(" -- While em Java -- \n");

		/* Vamos considerar que uma escola abriu um processo de inscrição para um curso gratuito com o número máximo de 10 vagas. A boa notícia é que as inscrições no site bombaram! Com base em quem se inscreveu, vamos preencher as vagas até que sejam totalizados 10 cadastros. */
		
		// Cria um array com os inscritos
		String[] inscritos = { "MARCOS", "ALINE", "LUCAS", "PATRICIA", "JOAO", 
				"FELIPE", "LUCIA", "ANTONIO", "FERNANDA", "MARCELA", "VITOR", 
				"BEATRIZ", "JORGE", "JULIA" };

		// Determina o número máximo de vagas
		final int numeroVagas = 10;
		/* A palavra `final` determina que o valor dessa variável não é alterável, ele passa a ser uma constante! */

		/* Criamos um vetor vazio com espaço igual ao número de vagas. Não se preocupe se não entender a sintaxe 100% — em breve entenderá!*/
		String[] vagas = new String[numeroVagas];

		// Determinamos quantas vagas já foram preenchidas
		int vagaAtual = 0;

		/* Percorremos todos inscritos e adicionamos nas vagas até que o número total de vagas seja preenchido */
		String inscrito = "Indefinido";
		String log;

		while (vagaAtual < numeroVagas) {
			inscrito = inscritos[vagaAtual];
			log = "Adicionando a inscrição: " + inscrito + " Na vaga: "
					+ (vagaAtual + 1) + "\n"; 
			vagas[vagaAtual] = inscrito;
			vagaAtual += 1;
			System.out.println(log);
		}
		
		// TODO For em Java
		System.out.println(" -- For em Java -- \n");
		
		/* A grande diferença entre FOR (‘Para’) e WHILE (‘Enquanto’) é que no FOR você precisa ter uma previsilidade de número de ocorrências, diferente do WHILE, que prossegue enquanto alguma condição for verdadeira (true). 

		 * O comando FOR faz parte da estrutura de fluxo de repetição. Sendo assim, até que uma condição seja atendida, nosso processo será  executado repetidas vezes. Na maioria das vezes, essa condição é determinada por um contador, que servirá para identificar o fim da execução. No primeiro exemplo, vamos realizar uma contagem simples de 1 até 10. */
		int numero;
		String log2;

		/* Leia como: PARA numero = 1, contanto que numero <= 10, faça o loop e depois faça numero += 1! */
		for (numero = 1; numero <= 10; numero += 1) {
			log2 = "O Número atual é: " + numero + "\n";
			System.out.println(log2);
		}
		
		// TODO Caminhando por Arrays
		System.out.println(" -- Caminhando por Arrays -- \n");
		/* O comando FOR também é compatível para interagir em um array de dados previamente estruturado. Imagine que você tem um sistema que precisa exibir no console a lista de estudantes de uma turma de escola. */
		
		// Cria um vetor com 4 alunos
		String[] alunos = { "MARCOS", "ALINE", "LUCAS", "PATRICIA" };
		String log3;

		// Pega o total de alunos existentes no vetor
		int totalAlunos = alunos.length;

		// Nossa variável 'log' não é muito útil agora, mas serve para registrarmos o que está acontecendo! ✌️
		log3 = "A lista de chamadas possui " + totalAlunos + " alunos \n";

		// Imprime a lista de chamadas. Note que você pode declarar a variável posição dentro do for!
		int matricula;
		for (int posicao = 0; posicao < totalAlunos; posicao++) {
			matricula = posicao + 1;
			log3 = "Matricula: " + matricula + " Aluno: " + alunos[posicao] + "\n";
			System.out.println(log3);
		}
		
		// TODO Do/While em Java
		System.out.println(" -- Do/While em Java -- \n");
		/* Semelhante ao WHILE (‘Enquanto’), o DO WHILE (‘Faça Enquanto’) garante que, sempre, ao menos uma iteração do loop será executada, já que ele primeiro executa e apenas depois valida se a condição é verdadeira para continuar ou falsa para interromper o processo.

	Vamos supor que uma escola entrará em contato com os inscritos aprovados para um curso e que o número máximo de tentativas de contato será até 3. */
		int tentativas = 0;
		int atendeu = 0;
		String log4;

		do {
			log4 = "Ligando para candidato selecionado ...\n";
			// O código abaixo nos dá um numero aleatório entre 0 e 2.
			atendeu = new Random().ints(0, 2).findFirst().getAsInt();
			tentativas += 1;
		} while (atendeu == 0 && tentativas < 3);

		log4 = "Candidato atendeu na tentativa: " + tentativas;
		System.out.println(log4);
	}
}
