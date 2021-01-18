public class pratos{

  //ATRIBUTOS DOS PRATOS 
	private int[] p_prato;
	private int primPrato;
	private int ultPrato;
	private int quantPrato;
	
	public pratos() {
		this.p_prato = new int[100];
		this.primPrato = 0;
		this.ultPrato = 0;
		this.quantPrato = 0;
	
	
	//GETTER E SETTER
	public int getQuantPrato() {
		return quantPrato;
	}
	public void setQuantPrato(int quantPrato) {
		this.quantPrato = quantPrato;
	}
	
	//METODO PARA COLOCAR/REPOR PRATOS
	public void inserirPrato(int num) {
		if(this.ehCheioPilha()) {
			System.out.println("A pilha de pratos esta cheia!");
		} else {
			this.p_pratos [this.ultPratos] = num;
			this.ultPratos = ((this.ultPratos + 1) % this.p_pratos.length);
			this.quantPrato++;	
		}
	}
	
	//METODO PARA RETIRAR PRATOS DA PILHA
	public int removePrato() {
		if(this.ehVazioPilha()) {
			System.out.println("A pilha de pratos esta vazia! Favor repor os pratos");
			return (0);
		} else {
			int aux = p_pratos[this.primPrato];
			this.primPrato = ((this.primPrato + 1) % this.p_pratos.length);
			this.quantPratos--;
			return aux;
		}
	}
	
	//METODO PARA VERIFICAR SE A PILHA DE PRATOS ESTA VAZIA
	public boolean ehVazioPilha() {
		return (this.quantPratos == 0);
	}
	
	//METODO PARA VERIFICAR SE A PILHA DE PRATOS ESTA CHEIA
	public boolean ehVazioPilha() {
		return (this.quantPratos == 0);
	}
}
