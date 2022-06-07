package AulasExercícios;

public class MeioTransporte {
	private String nome;
	private float cargaMax;
	private float velocidadeMax;
	
	
	public MeioTransporte(String nome, float cargaMax, float velocidadeMax) {
		this.nome = nome;
		this.cargaMax = cargaMax;
		this.velocidadeMax = velocidadeMax;
	}


	public String getNome() {
		return nome;
	}


	void setNome(String nome) {
		this.nome = nome;
	}


	public float getCargaMax() {
		return cargaMax;
	}


	void setCargaMax(float cargaMax) {
		this.cargaMax = cargaMax;
	}


	public float getVelocidadeMax() {
		return velocidadeMax;
	}

	
	void setVelocidadeMax(float velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}

	
	
}
