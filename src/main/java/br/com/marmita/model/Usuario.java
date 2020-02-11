package br.com.marmita.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.marmita.model.enums.NivelAcesso;

public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String login;
	private String senha;
	private Integer nivelAcesso;
	
	public Usuario( String nome, String login, String senha, NivelAcesso nivelAcesso) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.nivelAcesso = nivelAcesso.getCod();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public NivelAcesso getNivelAcesso() {
		return NivelAcesso.toEnum(nivelAcesso);
	}

	public void setNivelAcesso(NivelAcesso nivelAcesso) {
		this.nivelAcesso = nivelAcesso.getCod();
	}
	
	
	
}
