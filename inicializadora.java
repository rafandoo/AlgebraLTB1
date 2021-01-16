
public class inicializadora {
	
	
	public inicializadora() {
		
	}
	public void a() {
		comandosmesas cm;
		mesas m;
		
		cm = new comandosmesas();
		m = new mesas();
		
		m.setMesa("1");
		cm.inserirIni(m);
	}
}