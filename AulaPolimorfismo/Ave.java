package AulaPolimorfismo;

public class Ave extends Animal{
	private String corPena;
	
	public void locomover() {
		System.out.println("voando");
	}
	
	public void alimentar() {
		System.out.println("comendo frutas");
	}
	
	public void emitirSom() {
		System.out.println("som de ave");
	}
	
	public void fazerNinho() {
		System.out.println("fazendo ninho");
	}

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
	
}
