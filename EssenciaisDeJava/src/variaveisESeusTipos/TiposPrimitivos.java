package variaveisESeusTipos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* O tipo primitivo byte é tipo de menor unidade para armazenamento dos
		 * tipos inteiros, dado que 1 byte é composto por 8 bits. Mas cuidado! 
		 * O fato de ser a menor unidade não significa que não o usamos ou que 
		 * não cabe nada nele. Pelo contrário: a representação de dados 
		 * (áudios, textos, vídeos e etc.) realizada por computadores é o 
		 * resultado de várias combinações de bits. Além disso, graças aos 
		 * bytes, podemos manipular imagens (se quiser saber mais, acesse Bit 
		 * ou Byte?. */		
		byte b1 = 9;
		System.out.println("byte = " + b1);
		
		/* Tipos de variáveis short são tipos de variáveis numéricas de range 
		 * entre -32768 até 32767. São utilizados quando queremos criar 
		 * algoritmos com uma interação de valores numéricos não muito grandes.
		 * */	
		short num = 300;
		// variável
		short formatadaComUnderscore = 20_000;
		System.out.println("short = " + num);
		System.out.println("short underscore = " + formatadaComUnderscore);
		// 20000
		
		/* O int é um tipo primitivo numérico de range -2.147.483.648 até 
		 * 2.147.483.647. Variáveis de tipo inteiro são amplamente utilizadas 
		 * para resolver problemas com algoritmos.*/
		int numeroInteiro = 10;
		// inicialização de variáveis inline
        int a = 10, b = 20, soma;
        // atribuição da soma da variável a + b para a variável soma
        soma = a + b;
        System.out.println("Inteiro = " + numeroInteiro); // 10
        System.out.println("Soma = " + soma); // 30
        
        /* O long é um tipo primitivo numérico de range 
         * -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807. Esse é o 
         * tipo que armazena a maior quantidade de números inteiros (sem casas 
         * decimais). Bora conferir alguns exemplos? */
        long numA = 102040;
        /* adicionado L no final para indicar que estamos inserindo um valor do
         * tipo long */
        long numB = 102030405060L;
        System.out.println("Long sem L = " + numA);
        System.out.println("Long com L = " + numB);
        
        /* O float é um tipo primitivo numérico de range -1,4024E-37 até 
         * 3,40282347E+38. Ele é um dos tipos primitivos usados para trabalhar 
         * com números de ponto flutuante, servindo para garantir precisão nos 
         * cálculos e para notação científica. Bora descobrir um pouco mais? */
        float floatA = -101.23f;
        float floatB = 2.356f;
        System.out.println("Soma dos Float's = " + floatA + floatB);
        // -98.874
        
        /* O double é um tipo primitivo numérico de range -4,9E-324 até 
         * 1,7976931348623157E308. Ele é o outro tipo primitivo para utilização
         * de números de ponto flutuante, similar ao float, porém com um range 
         * maior. */
        double varDouble = 2.356; // double inicializado naturalmente
        double doubleRecebendoFloat = 1.409F; // double aceitando número float
        double doubleRecebendoLong = 12930L; // double aceitando número long
        System.out.println("Double = " + varDouble);
        System.out.println("Double | Float = " + doubleRecebendoFloat);
        // 1.409000039100647
        System.out.println("Double | Long = " + doubleRecebendoLong);
        // 12930.0
        
        /* O tipo primitivo boolean é um tipo de variável utilizado para 
         * trabalharmos com condições lógicas em Java. Diferente de outras 
         * linguagens em que utilizamos números como 0 ou 1 para representar 
         * falso e verdadeiro, no Java utilizamos variáveis de tipo boolean. 
         * Isso pode ser usado, por exemplo, para indicar condição ou estado de
         * algum elemento em nosso código. Para isso, variáveis booleanas 
         * aceitam apenas dois valores: true ou false. */
        boolean isBoolean = true;
        // outros exemplos: isGreaterThan, isFlexible, isStarted
        boolean ehNumero = false;
        // outros exemplos: ehMaiorDeIdade, ehCedo, ehValido
        System.out.println("Boolean = " + isBoolean + " e " + ehNumero);
        
        /* O tipo primitivo char, ou caractere, é um dos tipos primitivos para 
         * lidar com valores alfanuméricos em Java. Com ele, deixamos de 
         * trabalhar com apenas representações numéricas para trabalhar com 
         * representações de letras ou texto. No caso do char, ele armazena 
         * apenas um caractere por variável. */
        char letraA = 'a';
        char letraAMaiuscula = 'A';
        System.out.println("Char minuscula = " + letraA); // a
        System.out.println("Char maiuscula = " + letraAMaiuscula); // A
        
        
	}

}
