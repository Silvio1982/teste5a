package br.com.game.vo;

import java.util.List;

public class JogadorVO {

	private String nome;
	private int qtdMorte;
	private int qtdKilled;
	private int qtdVidasDisponivel = 0;	
		
	List<ArmaVO> armas = null;
	
	public JogadorVO(String nome, int qtdMorte, int qtdKilled,
			int qtdVidasDisponivel, List<ArmaVO> armas) {
		super();
		this.nome = (nome != null && !nome.equals("")) ? nome : "<WORLD>";
		this.qtdMorte = qtdMorte;
		this.qtdKilled = qtdKilled;		
		this.qtdVidasDisponivel = qtdVidasDisponivel;	
		this.armas = armas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdMorte() {
		return qtdMorte;
	}

	public void setQtdMorte(int qtdMorte) {
		this.qtdMorte = qtdMorte;
	}

	public int getQtdKilled() {
		return qtdKilled;
	}

	public void setQtdKilled(int qtdKilled) {
		this.qtdKilled = qtdKilled;
	}

	public int getQtdVidasDisponivel() {
		return qtdVidasDisponivel;
	}

	public void setQtdVidasDisponivel(int qtdVidasDisponivel) {
		this.qtdVidasDisponivel = qtdVidasDisponivel;
	}

	public List<ArmaVO> getArmas() {
		return armas;
	}

	public void setArmas(List<ArmaVO> armas) {
		this.armas = armas;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JogadorVO other = (JogadorVO) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
