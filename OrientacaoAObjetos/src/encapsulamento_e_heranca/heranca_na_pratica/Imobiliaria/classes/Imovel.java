package encapsulamento_e_heranca.heranca_na_pratica.Imobiliaria.classes;

import java.time.LocalDate;

public class Imovel {

	private String endereco;
	private LocalDate dataCadastro;
	// modificador de acesso como 'protected' permite que as classes filhas possam visualizar e modificar diretamente o mesmo.
	protected boolean ativo;
	
	public Imovel(String endereco, LocalDate dataCadastro) {
		super();
		this.endereco = endereco;
		this.dataCadastro = dataCadastro;
		this.ativo = false;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void ativarCadastro() {
		this.ativo = true;
	}
	
	public void desativarCadastro() {
		this.ativo = false;
	}
	
}
