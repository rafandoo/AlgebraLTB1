
public class comandosmesas {
	
	//CONSTRUTOR
	public comandosmesas() {
		this.prim = null;
		this.ult = null;
		
	}
	
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
	
	//INICIALIZADOR
	public void ini(String x) {
		mesas m2 = new mesas();
		m2.setMesa(x);
		inserirIni(m2);
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
		NvNodo2.setProx2(this.prim);
		this.prim = NvNodo2;
	}
	
	//METODO DE INSERSÂO 2
	public void inserirUlt(mesas m) {
		nodo2 NvNodo2 = new nodo2(m);
		if(this.ehVazioM()) {
			this.prim = NvNodo2; 
		} else {
			this.ult.setProx2(NvNodo2);
		}
		this.ult = NvNodo2;
	}
	
	//METODO IMPRESSÃO
	public String imprimirMesas() {
		String msg = "";
		nodo2 atual = this.prim;
		while(atual != null) {
			msg += atual.getM().getMesa() + " - ";
			atual = atual.getProx2();
		}
		return msg;
	}
	
	//METODO OCUPAR MESA
	public boolean ocupaMesa(String numM) {
		nodo2 atual = this.prim;
		nodo2 ant = null;
		if(this.ehVazioM()) {
			return false;
		} else {
			while((atual != null)&&(!atual.getM().getMesa().equals(numM))) {
			ant = atual;
			atual = atual.getProx();
			}
			if(atual == this.prim) {
				if(this.prim == this.ult) {
					this.ult = null;
				}
				this.prim = this.prim.getProx();
			} else {
				if(atual == this.ult) {
					this.ult = ant;
				}
				ant.setProx(atual.getProx());
		}
		return true;
		}
	}
}