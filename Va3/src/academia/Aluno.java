package academia;

public class Aluno {
	private String nome;
	private int idade;
	private FichaAluno ficha;
	
	public Aluno(String n, int i, FichaAluno f) { 
		this.nome = n;
		this.idade = i;
		this.ficha = f;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int i) {
		this.idade = i;
	}
	
	public FichaAluno getFicha() {
		return this.ficha;
	}
	
	public void setFicha(FichaAluno f) {
		this.ficha = f;
	}
	
	public void aluno() {
		System.out.println("Informacoes do aluno");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Ficha: " + this.getFicha());
	}
}

	
