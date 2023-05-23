package variaveisESeusTipos;

public class Arrays {

	public static void main(String[] args) {
		// TODO 
		/* Os arrays são coleções de elementos do mesmo tipo. Em Java, nós 
		 * devemos declarar o tamanho do array em sua inicialização, com cada 
		 * item do array representando um elemento da coleção. Quando um array 
		 * é inicializado, o valor armazenado em cada elemento é o valor 
		 * default de cada tipo do Java. */
		int[] arrayDeInteiros1 = new int[9];
        arrayDeInteiros1[0] = 40;
        arrayDeInteiros1[1] = 55;
        arrayDeInteiros1[2] = 63;
        arrayDeInteiros1[3] = 17;
        arrayDeInteiros1[4] = 22;
        arrayDeInteiros1[5] = 68;
        arrayDeInteiros1[6] = 89;
        arrayDeInteiros1[7] = 97;
        arrayDeInteiros1[8] = 89;

        System.out.println(arrayDeInteiros1[8]); // 89
        System.out.println(arrayDeInteiros1[2]); // 63

        arrayDeInteiros1[9] = 89;
        /* Estoura a pilha porque tentamos inserir um valor em um espaço
         * inexistente do array */
        
        // Outras maneiras de manipular arrays
        int[] arrayDeInteiros2 = {1,2,3,4,5,6,767,878,8,8,9,9,9};
        int[][] matriz = new int[2][10]; // inicializamos uma matriz, bem parecido com uma tabela de excel com coluna e linha
        String[] arrayDeString = new String[10];

        matriz[0][0] = 10;
        matriz[1][0] = 20;

        arrayDeString[0] = "Na Trybe";
        arrayDeString[1] = " eu aprendo Java!";

        System.out.println(arrayDeInteiros2[3]); // 4
        System.out.println(matriz[0][0]); // 10
        System.out.println(matriz[1][5]); // 0 
        System.out.println(arrayDeString[0] + arrayDeString[1]); // Na Trybe eu aprendo Java!
        System.out.println(arrayDeString.length); // 10
	}

}
