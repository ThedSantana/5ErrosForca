package model;

/**
 * @author Hellen
 *
 */
public class Palavra {
	private int id;
	private String palavra;
	private int status;

	public Palavra() {

	}

	public Palavra(String palavra, int status) {
		this.palavra = palavra;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
