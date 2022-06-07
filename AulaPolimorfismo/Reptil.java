package AulaPolimorfismo;

public class Reptil extends Animal {
	private String corEscama;
	
	public void locomover() {
		System.out.println("rastejando");
	}
	
	public void alimentar() {
		System.out.println("comendo planta");
	}
	
	public void emitirSom() {
		System.out.println("som de reptil");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	
	
}
