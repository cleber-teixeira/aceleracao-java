package orientacaoObjetos;

public class Principal {

    public static void main (String[] args) {

        // Pessoa pessoa1 = new Pessoa();
    	Pessoa pessoa1 = new Pessoa("Cleber");
    	Pessoa pessoa2 = new Pessoa("João");
    	
    	// System.out.println("O nome da pessoa1 é: " + pessoa1.nome);
    	// System.out.println("O nome da pessoa2 é: " + pessoa2.nome);
    	
    	System.out.println("O nome da pessoa1 é: " + pessoa1.devolverNomeObjeto());
    	System.out.println("O nome da pessoa2 é: " + pessoa2.devolverNomeObjeto());
        
    }
    
}
