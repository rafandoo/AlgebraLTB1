
public class comandosmesas {
	
	//private int[] mesa = new int[11];
	
	//ATRIBUTOS
	private nodo2 prim;
	private nodo2 ult;
	
	//GETTERS E SETTERS
	public void setPrim(nodo2 prim) {
		this.prim = prim;
	}
	public nodo2 getPrim() {
		return prim;
	}
	
	public void setUlt(nodo2 ult) {
		this.ult = ult;
	}
	public nodo2 getUlt() {
		return ult;
	}
	
	//METODOS EHVAZIO
	public boolean ehVazioM() {
		return (this.prim == null);
	}
	
	//METODO DE INSERSÂO
	public void inserirIni(mesas m) {
		nodo2 NvNodo2 = new nodo2(m);
		if(this.ehVazioM()) {
			this.ult = NvNodo2;
		}
		NvNodo2.setProx(this.prim);
		this.prim = NvNodo2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	
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
	}*/
}


	