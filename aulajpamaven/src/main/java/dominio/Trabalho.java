package dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trabalho implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String serviço;
	private Pessoa pessoaTrabalhadora;
	
	public Trabalho() {
	}

	public Trabalho(Integer id, String serviço, Pessoa pessoaTrabalhadora) {
		super();
		this.id = id;
		this.serviço = serviço;
		this.pessoaTrabalhadora = pessoaTrabalhadora;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getServiço() {
		return serviço;
	}

	public void setServiço(String serviço) {
		this.serviço = serviço;
	}

	public Pessoa getPessoaTrabalhadora() {
		return pessoaTrabalhadora;
	}

	public void setPessoaTrabalhadora(Pessoa pessoaTrabalhadora) {
		this.pessoaTrabalhadora = pessoaTrabalhadora;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Trabalho [id=" + id + ", serviço=" + serviço + ", pessoaTrabalhadora=" + pessoaTrabalhadora + "]";
	}
	
}
