package AulaHeranca;

public class Main {
	public static void main(String[] args) {
		/*Visitante p1 = new Visitante();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Cláudio");
		p4.setNome("Fabiana");
		
		p1.setSexo('M');
		p4.setSexo('F');
		p2.setIdade(18);
		
		p2.setCurso("CC");
		p3.setSalario(2500.75);
		p4.setSetor("Estoque");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());*/
		
		Aluno f1 = new Aluno();
		f1.setNome("Cláudio");
		f1.setMatricula(1111);
		f1.setCurso("CC");
		f1.setIdade(16);
		f1.setSexo('M');
		f1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setMatricula(1112);
		b1.setNome("Felipe");
		b1.setBolsa(12.5);
		b1.setSexo('M');
		b1.pagarMensalidade();
	}
}
