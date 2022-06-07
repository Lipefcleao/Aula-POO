package AulaHeranca;

public class Professor extends Pessoa {
	private char especialidade;
	private double salario;
	
	public void receberAumento(double aumento) {
		this.salario += aumento;
	}

	public char getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(char especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
