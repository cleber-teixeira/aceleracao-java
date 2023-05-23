package variaveisESeusTipos;

public class ObjetosString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* variável String, que não se trata de um tipo primitivo, mas sim de 
		 * uma classe Java para manipular textos. A String tem algumas 
		 * características bem interessantes que farão diferença quando você 
		 * desenvolver em Java — tudo pronto para conferir? 😎
		 * 
		 * Como dito, a String é uma classe do pacote java.lang.String que vem 
		 * de forma nativa na jre e jdk. String tem como valor default o null, 
		 * que é padrão de inicialização de qualquer objeto dentro do mundo 
		 * Java. */
		String frase1 = "Estou aprendendo Java!";
        String numeros = "09890";
        String caractere = "a";
        System.out.println("Frase 01 = " + frase1);
        System.out.println("Números = " + numeros);
        System.out.println("Caractere = " + caractere);
        
        // Concatenação de Strings
        String eu = "Eu";
        String ja = " já";
        String sei = " sei";
        String usar = " usar";
        String strings = " Strings";
        String em = " em";
        String java = " Java";

        String frase2 = eu + ja + sei + usar + strings + em + java;
        System.out.println("Frase 02 = " + frase2); // Eu já sei usar Strings em Java
        
        // Concatenação com a classe especial chamada String Builder
        StringBuilder stringBuilder = new StringBuilder();
        String frase3 = stringBuilder.append(eu)
                .append(ja)
                .append(sei)
                .append(usar)
                .append(strings)
                .append(em)
                .append(java)
                .toString();
        System.out.println("Concatenação com StringBuilder = " + frase3);
        // Eu já sei usar Strings em Java
	}

}
