package AulaPolimorfismo;

public class Main {
	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		m.setPeso(85.3);
		m.setIdade(2);
		m.setMembros(4);
		m.setCorPelo("amarelo");
		m.locomover();
		m.alimentar();
		m.emitirSom();
		
		p.setPeso(0.35);
		p.setIdade(1);
		p.setMembros(0);
		p.locomover();
		p.alimentar();
		p.emitirSom();
		p.soltarBolha();
		
		
	}
}
