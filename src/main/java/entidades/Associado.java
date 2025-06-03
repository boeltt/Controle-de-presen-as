package entidades;

public class Associado {
	private int id;
	private String nome;
	private boolean foraneo;

	public Associado(String nome, boolean foraneo) {
		this.nome = nome;
		this.foraneo = foraneo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isForaneo() {
		return foraneo;
	}

	public void setForaneo(boolean foraneo) {
		this.foraneo = foraneo;
	}

	@Override
	public String toString() {
		return "Associado [id=" + id + ", nome=" + nome + ", foraneo=" + foraneo + ", toString()=" + super.toString()
				+ "]";
	}

}
