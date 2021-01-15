
public class adm {
	private String comanda;
	private double valor;
	private int mesas;
	
	public void setComanda(String comanda) {
		this.comanda = comanda;
	}
	public String getComanda() {
		return comanda;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValor() {
		return valor;
	}
	
	public void setMesas(int mesas) {
		this.mesas = mesas;
		mesas m = new mesas();
		m.ocupaMesa(mesas);
	}
	public int getMesas() {
		return mesas;
	}
}
