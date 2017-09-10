package Personagens;

import Armas.ArmaIF;

public abstract class Personagem {
	
	private ArmaIF arma;
	
	public abstract void desenhar();
	

	public void arma(){
		arma.usarArma();
	}
	public void setArma(ArmaIF a){
		this.arma = a;
	}
	
}
