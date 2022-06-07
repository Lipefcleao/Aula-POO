package EstudoProva;

public class ChamadoraCredito extends CalculadoraCredito {

	public void chamarCalculadoraCredito(double renda, int idade){
	
		
	try{
		CalculadoraCredito f = new CalculadoraCredito();
		System.out.println(calcularCredito(renda, idade));
	}	

	catch (RuntimeException execao){
		System.out.println(execao);
		}
		
	}
}
