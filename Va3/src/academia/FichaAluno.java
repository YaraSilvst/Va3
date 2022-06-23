package academia;

import java.util.ArrayList;
import java.util.List;

public class FichaAluno {
	private Treino treino;
	
	List<AvaliacaoFisica> avaliacoes = new ArrayList<AvaliacaoFisica>();
	
	public FichaAluno(Treino t) { 
		this.treino = t;
	}
	
	public Treino getTreino() {
		return this.treino;
	}
	
	public void setFicha(Treino t) {
		this.treino = t;
	}
	
	void relatorio() {
		
	}
}

