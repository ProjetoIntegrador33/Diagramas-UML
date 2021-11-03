package proj3;

public class Alimento {
	int id;
	int idFornecedor;
	int idEntidade;
	String descricao;
	int quantidade;
	int status;//0-disponivel / 1-indisponivel
	int tipoAlimento;
	
	public Alimento(int idFornecedor, String descricao, int quantidade, int status,
			int tipoAlimento) {
		super();
		this.idFornecedor = idFornecedor;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.status = status;
		this.tipoAlimento = tipoAlimento;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getTipoAlimento() {
		return tipoAlimento;
	}

	public void setTipoAlimento(int tipoAlimento) {
		this.tipoAlimento = tipoAlimento;
	}

}

