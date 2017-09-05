package Personagens;

public class Mago extends Personagem implements Falador, Corredor{
	public void desenhar(){
		
	}
	public void falar(){
		System.out.println("Eu sou um Mago!!!");
	}
	public void correr(){
		System.out.println("Sou um Mago e posso correr");
	}


}
