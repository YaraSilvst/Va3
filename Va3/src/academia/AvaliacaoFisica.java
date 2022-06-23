package academia;

public class AvaliacaoFisica {
	private float peso;
	private float altura;
	
	public AvaliacaoFisica(float p, float a) { 
		this.peso = p;
		this.altura = a;
	}
	
	public float getPeso() {
		return this.peso;
	}
	
	public void setPeso(float p) {
		this.peso = p;
	}
	
	public float getAltura() {
		return this.altura;
	}
	
	public void setAltura(float a) {
		this.altura = a;
	}
	
	float calcularIMC(){
		return this.peso/(this.altura * this.altura);
		
	}
}
