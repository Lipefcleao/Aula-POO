
public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("---------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Status: " + this.getStatus());
		System.out.println("Saldo: " + this.getSaldo());
	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if ("CC".equals(t)) {
			this.setSaldo(50);
		} else if ("CP".equals(t)){
			this.setSaldo((150));
		}
	}
	
	public void fecharConta() {
		if (saldo > 0) {
			System.out.println("Conta com dinheiro");
		} 
		else if (saldo < 0){
			System.out.println("Conta em d�bito");
		}
		else {
			this.setStatus(false);
		}
	}
	
	public void depositar(float v) {
		if (this.getStatus()){
			this.setSaldo(getSaldo() + v);
		}
		else {
			System.out.println("Imposs�vel depositar");
		}
	}
	
	public void sacar(float v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
			}
			else {
				System.out.println("Saldo insuficiente");
			}
		}
		else {
			System.out.println("Imposs�vel sacar");
		}
	}
	
	public void pagarMensal() {
		int v = 0;
		if ("CC".equals(this.getTipo())) {
			v = 12;
		}
		else if ("CP".equals(this.getTipo())) {
			v =20;
		}
		if (this.getStatus()) {
			if (this.getSaldo() > v) {
				this.setSaldo(this.getSaldo() - v);
			}
			else {
				System.out.println("Saldo insuficiente");
			}
		}
		else {
			System.out.println("Imposs�vel pagar");
		}
	}
	
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}
