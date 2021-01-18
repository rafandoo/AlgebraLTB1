
public class Lista {

	
	mesas m = new mesas();
	
	//ATRIBUTOS
	private nodo prim;
	private nodo ult;
	private int QuantNodo;
	
	//CONSTRUTOR 
	public Lista() {        
		this.prim = null;
		this.ult = null;
		this.QuantNodo = 0;
		
		this.prim2 = null;
		this.ult2 = null;
		
	}
	
	//GETTERS E SETTERS
	public nodo getPrim() {
		return prim;
	}
	public void setPrim(nodo prim) {
		this.prim = prim;
	}
	
	public nodo getUlt() {
		return ult;
	}
	public void setUlt(nodo ult) {
		this.ult = ult;
	}
	
	public int getQuantNodo() {
		return QuantNodo;
	}
	public void setQuantNodo(int quantNodo) {
		QuantNodo = quantNodo;
	}
	
	//METODO DE TESTE NODO VAZIO
	public boolean ehVazio() {
		return(this.prim == null);
	}
	
	//METODO INSERIR NO INICIO
	public void inserirIni(adm c) {
		nodo NvNodo = new nodo(c);
		if(this.ehVazio()) {
			this.ult = NvNodo;
		}
		NvNodo.setProx(this.prim);
		this.prim = NvNodo;
		this.QuantNodo++;
	}
	
	//METODO INSERIR NO FIM
	public void inserirUlt(adm c) {
		nodo NvNodo = new nodo(c);
		if(this.ehVazio()) {
			this.prim = NvNodo;
		} else {
			this.ult.setProx(NvNodo);
		}
		this.ult = NvNodo;
		this.QuantNodo++;
	}
	
	//METODO IMPRIMIR COMANDA
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
	}
	
	//METODO CANCELA COMANDA
	public boolean removeNodo(String numC) {
		nodo atual = this.prim;
		nodo ant = null;
		if(this.ehVazio()) {
			return false;
		} else {
			while((atual != null)&&(!atual.getC().getComanda().equals(numC))) {
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
		this.QuantNodo--;
		return true;
		}
	}
	
	//METODO DE PESQUISA
	public String pesquisaNodo(String numC) {
		String msg = "";
		nodo atual = this.prim;
		while((atual != null) && (!atual.getC().getComanda().equals(numC))) {
			atual = atual.getProx();
		}
		
		return msg = "Numero da comanda: "+atual.getC().getComanda() +"\n"+
		             "Valor da comanda : "+atual.getC().getValor() +"\n"+
				     "Mesa: "+atual.getC().getMesas();
		
	}
	
	//-------------------------
	
	private nodo2 prim2;
	private nodo2 ult2;
	
	//GETTERS E SETTERS
	public void setPrim2(nodo2 prim2) {
		this.prim2 = prim2;
	}
	public nodo2 getPrim2() {
		return prim2;
	}
	
	public void setUlt2(nodo2 ult2) {
		this.ult2 = ult2;
	}
	public nodo2 getUlt2() {
		return ult2;
	}
	
	public void nulador() {
		this.prim2=null;
		this.ult2=null;
		m.setMesa(null);
	}
	//METODOS EHVAZIO
	public boolean ehVazioM() {
		return (this.prim == null);
	}
	
	//METODO DE INSERSÂO
	public void inserirIni(mesas m) {
		nodo2 NvNodo2 = new nodo2(m);
		if(this.ehVazioM()) {
			this.ult2 = NvNodo2;
		}
		NvNodo2.setProx2(this.prim2);
		this.prim2 = NvNodo2;
		NvNodo2 = null;
	}
	
	//METODO DE INSERSÂO 2
	public void inserirUlt(mesas m) {
		nodo2 NvNodo2 = new nodo2(m);
		if(this.ehVazioM()) {
			this.prim2 = NvNodo2; 
		} else {
			this.ult2.setProx2(NvNodo2);
		}
		this.ult2 = NvNodo2;
	}
	
	//METODO IMPRESSÃO
	public String imprimirMesas() {
		String msg = "";
		nodo2 atual = this.prim2;
		while(atual != null) {
			msg += atual.getM().getMesa() + " - ";
			atual = atual.getProx2();
		}
		return msg;
	}

	//METODO OCUPAR MESA
	public boolean ocupaMesa(String numM) {
		nodo2 atual = this.prim2;
		nodo2 ant = null;
		if(this.ehVazioM()) {
			return false;
		} else {
			while((atual != null)&&(!atual.getM().getMesa().equals(numM))) {
			ant = atual;
			atual = atual.getProx2();
			}
			if(atual == this.prim2) {
				if(this.prim == this.ult) {
					this.ult = null;
				}
				this.prim = this.prim.getProx();
			} else {
				if(atual == this.ult2) {
					this.ult2 = ant;
				}
				ant.setProx2(atual.getProx2());
		}
		return true;
		}
	}
}
	
	
	
	

