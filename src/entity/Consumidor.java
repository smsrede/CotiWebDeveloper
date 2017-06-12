package entity;

import java.text.SimpleDateFormat;

public class Consumidor {

	private String nome;
	private String mensagem;// relativo ao produto se esta barato

	static final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
	
	public Consumidor() {
		// TODO Auto-generated constructor stub
	}
	

	public Consumidor(String nome, String mensagem) {
		this.nome = nome;
		this.mensagem = mensagem;
	}
	

	@Override
	public String toString() {
		return "Consumidor [nome=" + nome + ", mensagem=" + mensagem + "]";
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
