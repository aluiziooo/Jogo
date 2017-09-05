package Jogo;

import Armas.Desarmado;
import Personagens.General;
import Personagens.Personagem;

public class UsaPersonagem {

	public static void main(String[] args) {
		Personagem p = new General();
		
		p.setArma(new Desarmado());
		
		p.arma();

	}

}
