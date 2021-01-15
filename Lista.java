
public class Lista {

	//ATRIBUTOS
	private nodo prim;
	private nodo ult;
	private int QuantNodo;
	
	//CONSTRUTOR 
	public Lista() {        
		this.prim = null;
		this.ult = null;
		this.QuantNodo = 0;
	}
	
	// GETTERS E SETTERS
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
			while((atual != null)&&(!atual.getC().getComanda().equals(numC)));
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
	
	//METODO DE PESQUISA
	public String pesquisaNodo(String numC) {
		String msg = "";
		nodo atual = this.prim;
		while((atual != null) && (!atual.getC().getComanda().equals(numC))) {
			atual = atual.getProx();
		}
		
		return msg = "Numero da comanda: "+atual.getC().getComanda() +"\n"+
		             "Valor da comanda : "+atual.getC().getValor();
		
	}
	
}
