package entidades;

public class Trimestre {
	private int id;
	private String nome;
	private boolean finalizado;
	
	public Trimestre(String nome, boolean finalizado) {
		this.nome = nome;
		this.finalizado = finalizado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Trimestre [id=" + id + ", nome=" + nome + ", finalizado=" + finalizado + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
