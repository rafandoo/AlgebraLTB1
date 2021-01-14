
public class nodo {
	private adm c;
	private nodo prox;
	
	public nodo(adm c) {
		this.c = c;
		this.prox = null;
	}
	public adm getC() {
		return c;
	}
	public void setC(adm c) {
		this.c = c;
	}
	
	public nodo getProx() {
		return prox;
	}
	public void setProx(nodo prox) {
		this.prox = prox;
	}
}
