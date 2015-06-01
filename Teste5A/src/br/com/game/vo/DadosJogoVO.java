package br.com.game.vo;

public class DadosJogoVO {
	
	JogadorVO jogadorMorto = null;
	JogadorVO jogadorMata = null;
		
	public DadosJogoVO(JogadorVO jogadorMorto, JogadorVO jogadorMata) {
		super();
		this.jogadorMorto = jogadorMorto;
		this.jogadorMata = jogadorMata;
	}
	public JogadorVO getJogadorMorto() {
		return jogadorMorto;
	}
	public void setJogadorMorto(JogadorVO jogadorMorto) {
		this.jogadorMorto = jogadorMorto;
	}
	public JogadorVO getJogadorMata() {
		return jogadorMata;
	}
	public void setJogadorMata(JogadorVO jogadorMata) {
		this.jogadorMata = jogadorMata;
	}
	
}
