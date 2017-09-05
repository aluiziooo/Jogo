package Personagens;

import Armas.ArmaIF;

public abstract class Personagem {
	
	private ArmaIF arma;
	
	public void correr(){
		System.out.println("Não posso correr");
	}
	public abstract void desenhar();
	

	public void arma(){
		arma.usarArma();
	}
	public void setArma(ArmaIF a){
		this.arma = a;
	}
	
}
