package entity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aluno {

	static final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Integer idAluno;
	private String nome;
	private String email;
	private Calendar dataMAtr;
	
	public Aluno() {
		
	}
	

	public Aluno(Integer idAluno, String nome, String email, GregorianCalendar dataMAtr) {
		this.idAluno = idAluno;
		this.nome = nome;
		this.email = email;
		this.dataMAtr = dataMAtr;
	}

	
	@Override
	public String toString() {
		return "Aluno [idAluno=" + idAluno + ", nome=" + nome +
				", email=" + email + ", dataMAtr=" + SDF.format(dataMAtr.getTime()) + "]";
	}


	public Integer getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getDataMAtr() {
		return dataMAtr;
	}

	public void setDataMAtr(Calendar dataMAtr) {
		this.dataMAtr = dataMAtr;
	}
	
	public static void main(String[] args) {
		Aluno a = new Aluno(10,"marcus","smsrede@gmail.com",new GregorianCalendar(2017,06,01));
		
		System.out.println(a);
		//--------------------------------------------------------------------------------------
		
		Aluno a2 = new Aluno();
		a2.setNome("lu");
		a2.setDataMAtr(new GregorianCalendar(2015,00,10,17,30,00));
		System.out.println("\n"+a2.getNome()+","+ SDF.format(a2.getDataMAtr().getTime()));
		
		
		System.out.println("Ano: " + SDF.format(a2.getDataMAtr().YEAR));
		System.out.println("Mes: " + SDF.format(a2.getDataMAtr().MONTH));
		System.out.println("Dia do Mes: " + SDF.format(a2.getDataMAtr().DAY_OF_MONTH));
		System.out.println("Dia da Semana: " + SDF.format(a2.getDataMAtr().DAY_OF_WEEK));
		
	}
	
}
