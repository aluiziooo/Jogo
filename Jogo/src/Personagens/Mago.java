package Personagens;

public class Mago extends Personagem implements Falador, Corredor{//Herdando os atributos e comportamentos de personagem e implementando
//Os comportamentos das interfaces Falador e corredor. Como vai ser uma resposta diferente para os metodos das interfaces a cada chamada para
//a mesma assinatura do metodo, temos polimorfismo.
	public void desenhar(){
		
	}
	public void falar(){
		System.out.println("Eu sou um Mago!!!");
	}
	public void correr(){
		System.out.println("Sou um Mago e posso correr");
	}


}
