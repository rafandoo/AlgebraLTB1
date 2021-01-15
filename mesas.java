public class mesas {
	private int[] mesa = new int[99999];
	
	public mesas() {
		for(int i=0;i<mesa.length;i++) {
			mesa[i] = i+1;
		}
	}
	/*public void setMesa(int[] mesa) {
		this.mesa = mesa;
	}
	public int[] getMesa() {
		return mesa;
	}*/
	
	public void setMesa(int num) {
		this.mesa[num]= 1;
	}
	public int getMesa(int num) {
		return mesa[num];
	}
	
	public void relat() {
		for(int i=0;i<mesa.length;i++) {
			System.out.println(mesa[i]+", ");
		}
	}
}
