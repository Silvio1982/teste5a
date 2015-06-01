package br.com.game.vo;

import java.util.ArrayList;
import java.util.List;

public class ArmaVO {

	private String nome;
	private boolean municao = true;
	private int qtdDisparo = 0;
	private int qtdUtilizada = 0;
	
	public ArmaVO(String nome, boolean municao, int qtdDisparo) {
		super();
		this.nome = nome;
		this.municao = municao;
		this.qtdDisparo = qtdDisparo;
	}
	
	public ArmaVO() {		
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isMunicao() {
		return municao;
	}
	public void setMunicao(boolean municao) {
		this.municao = municao;
	}
	public int getQtdDisparo() {
		return qtdDisparo;
	}
	public void setQtdDisparo(int qtdDisparo) {
		this.qtdDisparo = qtdDisparo;
	}
	
	public static List<ArmaVO> getArmasDefault(){
		List<ArmaVO> armas = new ArrayList<ArmaVO>();
		armas.add(new ArmaVO("M16", true, 900));
		armas.add(new ArmaVO("Pistola 38", true, 12));
		armas.add(new ArmaVO("Faca", false, 0));
		
		return armas;		
	}

	public int getQtdUtilizada() {
		return qtdUtilizada;
	}

	public void setQtdUtilizada(int qtdUtilizada) {
		this.qtdUtilizada = qtdUtilizada;
	}

}
