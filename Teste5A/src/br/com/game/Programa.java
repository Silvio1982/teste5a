package br.com.game;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.game.vo.ArmaVO;
import br.com.game.vo.DadosJogoVO;
import br.com.game.vo.JogadorVO;

public class Programa {

	public DadosJogoVO killJogador(JogadorVO matador, JogadorVO morto, int indexArma){	
		
		ArmaVO armaUtilizada = matador.getArmas().get(indexArma); 

		if(!matador.getNome().equals("<WORLD>")){
			matador.setQtdKilled(matador.getQtdKilled() + 1);			
		}
		System.out.println(new SimpleDateFormat("dd/MM/yyyy hh:MM:ss").format(new Date()) + 
				"- " + matador.getNome() + " killed " + morto.getNome() + " Using " + armaUtilizada.getNome());

		morto.setQtdMorte(morto.getQtdMorte() + 1);		
		matador.getArmas().get(indexArma).setQtdUtilizada(
				armaUtilizada.getQtdUtilizada() +1
				);
		
		
		return new DadosJogoVO(morto, matador);
	}

}
