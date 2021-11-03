package proj3;

import java.util.ArrayList;  

public class Fornecedor {
	int id;
	String tipoEmpresa;
	String nome;
	int CNPJ;
	int telefone;
	String email;
	ArrayList<Alimento> alimentos = new ArrayList<Alimento>();  

	public Fornecedor(int id, String tipoEmpresa, String nome, int cNPJ, int telefone, String email,
			ArrayList<Alimento> alimentos) {
		super();
		this.id = id;
		this.tipoEmpresa = tipoEmpresa;
		this.nome = nome;
		CNPJ = cNPJ;
		this.telefone = telefone;
		this.email = email;
		this.alimentos = alimentos;
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

	public ArrayList<Alimento> getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(ArrayList<Alimento> alimentos) {
		this.alimentos = alimentos;
	}

	public void cadastraAlimento(String descricao, int quantidade, int tipoAlimento, ListaDeAlimentos lista) {
		Alimento novoAlimento = new Alimento(this.id,descricao, quantidade, 0, tipoAlimento);
		lista.getAlimentos().add(novoAlimento);
		this.alimentos.add(novoAlimento);
	}
	
	public void aceitaSolicitacao(Alimento alimento, int idEntidade, int idAlimentoSelecionado) {
		this.alimentos.get(idAlimentoSelecionado).setIdEntidade(idEntidade);
		this.alimentos.get(idAlimentoSelecionado).setStatus(1);
	}
}
