package entity;

public class Disciplina {

	private Integer codigo;
	private Double nota1;
	private Double nota2;
	
	//calcular iniciar
	private Double media = 0.0;
	private String situacao="";

	public Disciplina() {

	}

	public Disciplina(Integer codigo, Double nota1, Double nota2) {
		this.codigo = codigo;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	@Override
	public String toString() {
		return "Disciplina [codigo=" + codigo + ", nota1=" + nota1 + ", nota2=" + nota2 + ", media=" + media
				+ ", situacao=" + situacao + "]";
	}


	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

}
