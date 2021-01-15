public class mesas {
	private int[] mesa = new int[10];
	
	//CONSTRUTOR
	public mesas() {
		for(int i=0;i<mesa.length;i++) {
			mesa[i] = 0;
		}
	}
	
	//METODO PARA TESTAR SE A MESA ESTA VAZIA
	public boolean ehVazioM(int mesa) {
		return(this.mesa[mesa] == 0);
	}
	
	//METODO PARA OCUPAR UMA MESA
	public void ocupaMesa(int num) {
		mesa[num] = 1;
	}
	
	// METODO PARA LISTAR AS MESAS DISPONIVEIS
	public String listaMesas() {
		String msg = ""; 
		for(int i=1;i<mesa.length;i++) {
			if(mesa[i] == 0) {
				msg += i+", ";
			}
		}
		return msg;
	}
	 
	 
	
}

