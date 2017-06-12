package control;

import java.util.GregorianCalendar;

import entity.Aluno;
import entity.Disciplina;

public class ControleAluno {
	

	public ControleAluno() {
		// TODO Auto-generated constructor stub
	}

	public Double mediaAluno(Aluno a, Disciplina d){
		Double media=0.;
		media = (d.getNota1()+ d.getNota2())/2;
		return media;
	}

	public String situacaoAluno(Aluno a, Disciplina d){
		String msg="";
		msg=
		(mediaAluno(a,d)>=7)?"Aprovado":(mediaAluno(a,d))>=5?"recuperação" : "reprovado";
		return msg;
	}
	
	
	
	public static void main(String[] args) {
		Aluno a = new Aluno(1000,"carlos","smsrede@gmail.com", new GregorianCalendar(2017,00,21));
		
		Disciplina d1 = new Disciplina(2017,5.5,3.3);
		
		ControleAluno ca = new ControleAluno();
		
		d1.setMedia(ca.mediaAluno(a, d1));
		d1.setSituacao( ca.situacaoAluno(a, d1));
		
		System.out.println("Aluno:" + a);
		System.out.println("Disciplina" + d1);
				
	}
	
	
	
	
	
	
	
	
	
	
	
}
