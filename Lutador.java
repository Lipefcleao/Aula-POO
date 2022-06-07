
public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public Lutador(String no,String na,int id,float al,float pe,int vi,int de,int em) {
		setNome(no);
		setNacionalidade(na);
		setIdade(id);
		setAltura(al);
		setPeso(pe);
		setVitorias(vi);
		setDerrotas(de);
		setEmpates(em);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Inválido";
		}
		else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		}
		else if (this.peso <= 83.9) {
			this.categoria = "Médio";
		}
		else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		}
		else if (this.peso > 120.2) {
			this.categoria = "Inválido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	public void apresentar() {
		this.getNome();
		this.getNacionalidade();
		this.getIdade();
		this.getAltura();
		this.getPeso();
		this.getCategoria();
		this.getVitorias();
		this.getDerrotas();
		this.getEmpates();
	}
	
	public void status() {
		this.getNome();
		this.getNacionalidade();
		this.getPeso();
		this.getVitorias();
		this.getDerrotas();
	}
	
}
