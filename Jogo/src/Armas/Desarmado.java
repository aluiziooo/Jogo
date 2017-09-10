package Armas;

public class Desarmado implements ArmaIF {//Usando interface para implementar o metodo usarArma, Sobrescrevendo o metodo, diferente para cada
	public void usarArma(){      	//classe, temos polimorfismo.
		System.out.println("Sem arma");
	}
}
