import java.text.DecimalFormat;
import java.util.Scanner;

public class caixa {
	
	private double valor;
	private String mesa;
	private boolean pag = true;
	
	
	private String arredondar(double n) {
		return (new DecimalFormat("#,##0.00").format(n));
	}
	
	public void cx() {
		ListaS rest = new ListaS();
		Scanner ent = new Scanner(System.in);
		mesas m;
		
		System.out.println("=====       CAIXA        =====");
		do {
			System.out.print("\n=Digite o numero da comanda: ");
			String numC = ent.next();
			valor = rest.pesquisaValor(numC);
			if(valor != 0) {
				System.out.print("\n=Valor total devido: ");
				System.out.println(arredondar(valor));
				mesa = rest.pesquisaMesa(numC);
				System.out.println("\n=Deseja realizar o pagamento? (S/N)");
				String esclh = ent.next().toUpperCase();
				if(esclh.charAt(0) == 'S') {
					m = new mesas();
					rest.pagaComanda(numC);
					m.setMesa(mesa);
					rest.inserirUlt(m);
					System.out.println("Comanda paga com sucesso!");
				} else {
					System.out.println("Comanda não paga!");
				}
				
			} else {
				System.out.println("Comanda não localizada!");
			}
		} while(pag);
		
				
		
	}
}
