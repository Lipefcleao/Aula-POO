package AulaPolimorfismo;

public class Peixe extends Animal{
	private String corEscama;
	
	public void locomover() {
		System.out.println("nadando");
	}
	
	public void alimentar() {
		System.out.println("comendo substancias");
	}
	
	public void emitirSom() {
		System.out.println("peixe nao faz som");
	}
	
	public void soltarBolha() {
		System.out.println("soltando bolha");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	
}
