package entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto {

	static final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");

	// modificador de acesso (atributo) _private
	// tipo
	// campo
	// private, defaut, protect, public
	// conrt _shift +f alinhamento
	// alt
	private Integer codigo;
	private String nome;
	private Double preco;
	private Date dataEntrada; // java.util

	// cntr+o - importa
	// obj.setcodigo(1000)

	// control+espaço
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	// alt+S para criar o construtor cheio
	// alimentar os dados via construtor usndo os campos

	public Produto(Integer codigo, String nome, Double preco, Date dataEntrada) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.dataEntrada = dataEntrada;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", dataEntrada="
				+ SDF.format(dataEntrada) + "]";
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setpreco(Double preco) {
		this.preco = preco;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	// control+espaço
	// area de execucao-teste
	public static void main(String[] args) {

		// p é uma instancia da classe
		// sempre que se usa new date usa-se a data atual
		Produto p = new Produto(1000, "hitablet", 400., new Date());

		Produto p2 = new Produto();
		p2.setCodigo(1001);
		p2.setNome("tablet2");
		p2.setpreco(150.);
		p2.setDataEntrada(new Date());

		// syso + control +espaço
		System.out.println("O valor do primeiro produto: ");
		System.out.println("Nome: " + p2.getNome());
		System.out.println("Nome: " + p2.getPreco());
		
		
		//Quando imprimo o boj, imprimo o toString
		System.out.println(p);

	}

}
