package EstudoProva;

public class CalculadoraCredito{

	public double calcularCredito(double renda, int idade) throws ExecaoRegraNegocio {
				
		if (idade > 70){
			throw new RuntimeException("Idade maior que 70");
		}
		if (renda < 0){
			throw new RuntimeException("Renda negativa");
		}
		if (idade > 30 &&  renda > 20000){
			System.out.println("50000");
		}
		if (idade < 30){
			System.out.println(renda * 0.8);
		}
		if (idade > 30 && renda <= 20000){
			System.out.println("18000");
		}
	}
}
