
public class Caneta {
		String modelo;
		String cor;
		float ponta;
		int carga;
		boolean tampada;
		
		void status() {
			System.out.println("Uma caneta " + this.cor);
			System.out.println("está tampada? " + this.tampada);
			System.out.println("Tamanho da ponta: " + this.ponta);
			System.out.println("Quanta carga: " + this.carga);
		}
		void rabiscar() {
			if(this.tampada == true) {
				System.out.println("ERRO");
			}else {
				System.out.println("rabiscando");
			}
		}
		
		void tampar() {
			this.tampada = true;
		}
		
		void destampar() {
			this.tampada = false;
		}
		
		
}
