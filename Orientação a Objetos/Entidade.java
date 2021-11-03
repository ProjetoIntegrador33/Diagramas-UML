package proj3;

import java.util.ArrayList;
import java.util.Scanner;

public class Entidade {
	int id;
	String tipoEmpresa;
	String nome;
	int CNPJ;
	int telefone;
	String email;
	ArrayList<Solicitacao> solicitacoes = new ArrayList<Solicitacao>();  
	
	public Entidade(int id, String tipoEmpresa, String nome, int cNPJ, int telefone, String email) {
		super();
		this.id = id;
		this.tipoEmpresa = tipoEmpresa;
		this.nome = nome;
		CNPJ = cNPJ;
		this.telefone = telefone;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public ArrayList<Solicitacao> getSolicitacoes() {
		return solicitacoes;
	}

	public void setSolicitacoes(ArrayList<Solicitacao> solicitacoes) {
		this.solicitacoes = solicitacoes;
	}

	public void pesquisa(ListaDeAlimentos lista) {
		lista.listaAlimentosDisponiveis();
	}
	
	public void criaSolicitacao(int ultimoIdSolicitacao ,ArrayList<Alimento> alimentos, int idEntidade,int idFornecedor) {
		int novoIdSolicitacao = ultimoIdSolicitacao+1;
		Solicitacao novaSolicitacao = new Solicitacao(novoIdSolicitacao, idFornecedor, idEntidade, alimentos, 0);
		this.solicitacoes.add(novaSolicitacao);
	}

}
