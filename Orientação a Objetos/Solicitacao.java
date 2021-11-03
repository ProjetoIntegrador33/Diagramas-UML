package proj3;

import java.util.ArrayList;

public class Solicitacao {
	int id;
	int idFornecedor;
	int idEntidade;
	ArrayList<Alimento> alimentos = new ArrayList<Alimento>();  
	int status;//0-nova /1-aceita / 2-rejeitada
	
	public Solicitacao(int id, int idFornecedor, int idEntidade, ArrayList<Alimento> alimentos, int status) {
		super();
		this.id = id;
		this.idFornecedor = idFornecedor;
		this.idEntidade = idEntidade;
		this.alimentos = alimentos;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public int getIdEntidade() {
		return idEntidade;
	}

	public void setIdEntidade(int idEntidade) {
		this.idEntidade = idEntidade;
	}

	public ArrayList<Alimento> getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(ArrayList<Alimento> alimentos) {
		this.alimentos = alimentos;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
}

