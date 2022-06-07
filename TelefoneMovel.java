
public class TelefoneMovel {
	private String marca;
	private int capacidadeBateria;
	private float preco;
	
	
	protected final String getMarca() {
		return marca;
	}
	protected final void setMarca(String marca) {
		this.marca = marca;
	}
	int getCapacidadeBateria() {
		return capacidadeBateria;
	}
	void setCapacidadeBateria(int capacidadeBateria) {
		this.capacidadeBateria = capacidadeBateria;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	TelefoneMovel(String marca, int capacidadeBateria, float preco) {
		this.marca = marca;
		this.capacidadeBateria = capacidadeBateria;
		this.preco = preco;
	}
	
	int calcularTempoUso(int potenciaMedia) {
		int tempoDeUso = (getCapacidadeBateria() * 12 / 1000) / potenciaMedia;
		return tempoDeUso;
	}
	
}
