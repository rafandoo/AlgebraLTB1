
public class inicializadora {
	comandosmesas cm = new comandosmesas();
	mesas m = new mesas();
	
	public inicializadora() {
		m.setMesa("2");
		cm.inserirIni(m);
	}
	public void a() {
		m.setMesa("1");
		cm.inserirIni(m);
	}
}