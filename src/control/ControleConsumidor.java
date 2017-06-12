package control;

import java.util.Date;

import entity.Consumidor;
import entity.Produto;


public class ControleConsumidor {

	public ControleConsumidor() {

	}

	public String MensagemPrecoProduto(Consumidor c, Produto p) {
		if (p.getPreco() == null)
			return "Preço inválido";

		String msg = "";

		if (p.getPreco() >= 1 & p.getPreco() < 300) {
			msg = "Produto Barato:" + p.getNome() + "," + p.getPreco() + "Consumidor:" + c.getNome();

		} else if (p.getPreco() >= 300 & p.getPreco() < 3000) {
			msg = "Produto Medio:" + p.getNome() + "," + p.getPreco() + "Consumidor:" + c.getNome();
		}

		else if (p.getPreco() >= 3000 & p.getPreco() < 10000) {
			msg = "Produto Top:" + p.getNome() + "," + p.getPreco() + "Consumidor:" + c.getNome();
		}

		else if (p.getPreco() >= 10000) {
			msg = "Produto Fora da Realidade:" + p.getNome() + "," + p.getPreco() + "Consumidor:" + c.getNome();
		} else {
			msg = "Fora da Faixa:" + p.getNome() + "," + p.getPreco();
		}
		return msg;
	}

	public static void main(String[] args) {
		
		Produto p = new Produto(1000, "xanxung", 11000., new Date());
		Consumidor c = new Consumidor("Pedro", "");
		ControleConsumidor cc = new ControleConsumidor();

		c.setMensagem(cc.MensagemPrecoProduto(c, p));

		System.out.println("Mensagem:" + c.getMensagem());
	}

}
