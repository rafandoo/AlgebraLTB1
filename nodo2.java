
public class nodo2 {
	private mesas m;
	private nodo2 prox;
	
	public nodo2(mesas m) {
		this.m = m;
		this.prox = null;
	}

	public mesas getM() {
		return m;
	}
	public void setM(mesas m) {
		this.m = m;
	}
	
	public nodo2 getProx2() {
		return prox;
	}
	public void setProx2(nodo2 prox) {
		this.prox = prox;
	}
}

