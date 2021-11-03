package proj3;

import java.util.ArrayList;

public class ListaDeAlimentos {
	int id;
	int idRegiao;
	String NomeRegiao;
	ArrayList<Alimento> alimentos = new ArrayList<Alimento>(); 
	
	public ListaDeAlimentos(int id, int idRegiao, String nomeRegiao, ArrayList<Alimento> alimentos) {
		super();
		this.id = id;
		this.idRegiao = idRegiao;
		NomeRegiao = nomeRegiao;
		this.alimentos = alimentos;
	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getIdRegiao() {
		return idRegiao;
	}



	public void setIdRegiao(int idRegiao) {
		this.idRegiao = idRegiao;
	}



	public String getNomeRegiao() {
		return NomeRegiao;
	}



	public void setNomeRegiao(String nomeRegiao) {
		NomeRegiao = nomeRegiao;
	}



	public ArrayList<Alimento> getAlimentos() {
		return alimentos;
	}



	public void setAlimentos(ArrayList<Alimento> alimentos) {
		this.alimentos = alimentos;
	}



	public ArrayList<Alimento> listaAlimentosDisponiveis() {
		int i;
		ArrayList<Alimento> alimentosDisponiveis = new ArrayList<Alimento>(); 
		for(i=0;i<alimentos.size();i++) {
			if(alimentos.get(i).getStatus()==0) {
				alimentosDisponiveis.add(alimentos.get(i));
			}
		}
		return alimentosDisponiveis;
	}
}


