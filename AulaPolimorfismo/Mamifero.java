package AulaPolimorfismo;

public class Mamifero extends Animal{
	private String corPelo;
	
	@Override
	public void locomover() {
		System.out.println("correndo");
	}
	
	public void alimentar() {
		System.out.println("mamando");
	}
	
	public void emitirSom() {
		System.out.println("som de mamífero");
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	
}
