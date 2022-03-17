
public class Caneta {
		private String modelo;
		public String cor;
		private float ponta;
		private boolean tampada;
		
		public Caneta(String m, String c, float p) { //Constructor
			this.tampar();
			this.cor = c;
			this.modelo = m;
			this.setPonta(p);
		}
		
		public String getModelo() {
			return this.modelo;
		}
		
		public void setModelo(String m) {
			this.modelo = m;
		}
		
		public float getPonta() {
			return this.ponta;
		}
		
		public void setPonta(float p) {
			this.ponta = p;
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
		
		public void status() {
			System.out.println("Modelo: " + this.getModelo());
			System.out.println("Uma caneta " + this.cor);
			System.out.println("está tampada? " + this.tampada);
			System.out.println("Tamanho da ponta: " + this.getPonta());
			//System.out.println("Quanta carga: " + this.carga);
		}
		
		
}
