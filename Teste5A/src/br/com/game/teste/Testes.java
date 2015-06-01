package br.com.game.teste;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.game.vo.ArmaVO;
import br.com.game.vo.DadosJogoVO;
import br.com.game.vo.JogadorVO;
import br.com.game.vo.Programa;

public class Testes {
	
	public static void main(String args[]) {

		long jogoNumero = System.currentTimeMillis() + 1;
		DadosJogoVO rodaJogo = null;
		Programa programa = new Programa();
		
		JogadorVO roman = new JogadorVO("Roman", 0, 0, 5, ArmaVO.getArmasDefault());
		JogadorVO nick = new JogadorVO("Nick", 0, 0, 5, ArmaVO.getArmasDefault());
		JogadorVO world = new JogadorVO("", 0, 0, 5, ArmaVO.getArmasDefault());

		System.out.println(new SimpleDateFormat("dd/MM/yyyy hh:MM:ss").format(new Date()) + "- New match " + jogoNumero + " has Started");

		rodaJogo = programa.killJogador(roman, nick, 0);
		roman = rodaJogo.getJogadorMata();
		nick = rodaJogo.getJogadorMorto();
		
		rodaJogo = programa.killJogador(roman, world, 1);
		roman = rodaJogo.getJogadorMata();
		world = rodaJogo.getJogadorMorto();
		
		rodaJogo = programa.killJogador(world, nick, 0);
		world = rodaJogo.getJogadorMata();
		nick = rodaJogo.getJogadorMorto();
		
		rodaJogo = programa.killJogador(world, roman, 2);
		world = rodaJogo.getJogadorMata();
		roman = rodaJogo.getJogadorMorto();
		
		rodaJogo = programa.killJogador(nick, world, 1);
		nick = rodaJogo.getJogadorMata();
		world = rodaJogo.getJogadorMorto();
		
		rodaJogo = programa.killJogador(nick, roman, 2);
		nick = rodaJogo.getJogadorMata();
		roman = rodaJogo.getJogadorMorto();

		System.out.println("Match " + jogoNumero + " has ended");	
		
		System.out.println("Dados por jogador: ");
		System.out.println("Qtd de assassinatos: ");
		System.out.println("Nick: " + nick.getQtdKilled());
		System.out.println("Roman: " + roman.getQtdKilled());
		System.out.println("World: " + world.getQtdKilled());
		
		System.out.println("Qtd de Mortes por Jogador: ");
		System.out.println("Nick: " + nick.getQtdMorte());
		System.out.println("Roman: " + roman.getQtdMorte());
		System.out.println("World: " + world.getQtdMorte());
		
	}

}
