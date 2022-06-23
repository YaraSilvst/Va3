package academia;

public class Aparelho extends Atividade{
	private String tipo;
	
	public Aparelho(String t) { 
		this.tipo = t;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setNome(String t) {
		this.tipo = t;
	}
	
}
