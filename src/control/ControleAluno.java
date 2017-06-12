package control;

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
}
