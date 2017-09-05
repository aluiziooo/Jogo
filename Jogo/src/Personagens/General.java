package Personagens;

public class General extends Personagem implements Falador, Corredor {

	public void desenhar(){
		
	}
	public void falar(){
		System.out.println("Eu sou um general!!!");
	}
	public void correr(){
		System.out.println("Sou um general e posso correr");
	}
	
}
