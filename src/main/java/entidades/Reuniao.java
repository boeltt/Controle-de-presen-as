package entidades;

public class Reuniao {
	private int id;
	private String data;
	
	public Reuniao(int id, String data) {
		this.id = id;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Reuniao [id=" + id + ", data=" + data + ", toString()=" + super.toString() + "]";
	}
	
	
}
