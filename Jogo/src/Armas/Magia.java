package Armas;

public class Magia implements ArmaIF{//Usando interface para implementar o metodo usarArma, Sobrescrevendo o metodo, diferente para cada
	public void usarArma(){      //classe, temos polimorfismo.
		System.out.println("~Pense em uma magia foda~");
	}
}
