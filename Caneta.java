
public class Caneta {
		public String modelo;
		public String cor;
		private float ponta;
		protected int carga;
		private boolean tampada;
		
		public void status() {
			System.out.println("Modelo: " + this.modelo);
			System.out.println("Uma caneta " + this.cor);
			System.out.println("está tampada? " + this.tampada);
			System.out.println("Tamanho da ponta: " + this.ponta);
			System.out.println("Quanta carga: " + this.carga);
		}
		public void rabiscar() {
			if(this.tampada == true) {
				System.out.println("\nERRO, caneta tampada");
			}else {
				System.out.println("\nRABISCANDO");
			}
		}
		
		public void tampar() {
			this.tampada = true;
		}
		
		public void destampar() {
			this.tampada = false;
		}
		
		
}
