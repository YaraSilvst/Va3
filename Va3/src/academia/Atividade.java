package academia;

public abstract class Atividade {
	 private String nome;
	 private float carga;
	 private int repeticoes;
	 
	 /*public Atividade(String n, float c, int r) { 
			this.nome = n;
			this.carga = c;
			this.repeticoes = r;
		}*/
		
		public String getNome() {
			return this.nome;
		}
		
		public void setNome(String n) {
			this.nome = n;
		}
		
		public float getCarga() {
			return this.carga;
		}
		
		public void setCarga(float c) {
			this.carga = c;
		}
		
		public int getRepeticoes() {
			return this.repeticoes;
		}
		
		public void setRepeticoes(int r) {
			this.repeticoes = r;
		}
		
}
