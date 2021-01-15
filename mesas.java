public class mesas {
	private int[] mesa = new int[11];
	
	//CONSTRUTOR
	/*public mesas() {
		/*for(int i=0;i<mesa.length;i++) {
			mesa[i] = 0;
		}
		//mesa[1]=1;
	}*/
	
	//METODO IMPRIME VETOR
	public void imprimeV() {
		for(int i=1;i<mesa.length;i++) {
			System.out.println(mesa[i]);
		}
	}
	//METODO PARA TESTAR SE A MESA ESTA VAZIA
	public boolean ehVazioM(int num) {
		return(this.mesa[num] == 0);
	}
	
	//METODO PARA OCUPAR UMA MESA
	public void ocupaMesa(int num) {
		System.out.println(num);
		mesa[num] = 1;
		System.out.println(mesa[num]);
	}
	
	// METODO PARA LISTAR AS MESAS DISPONIVEIS
	public String listaMesas() {
		String msg = ""; 
		for(int i=1;i<mesa.length;i++) {
			if(this.ehVazioM(mesa[i])) {
				msg += Integer.toString(i)+", ";
				//System.out.print(i+", ");
			} else {
				System.out.println("codigo de erro");
			}
		}
		return msg;
	}
}


/*//METODO IMPRIMIR COMANDA
public String imprimirLista() {
	String msg = "";
	if(this.ehVazio()) {
		msg = "A lista está vazia!";
	} else {
		nodo atual = this.prim;
		while(atual != null) {
			msg += atual.getC().getComanda() + " -> ";
			atual = atual.getProx();
		}
	}
	return msg;
}*/
