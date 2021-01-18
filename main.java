import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class main {

	//METODO PARA LIMPAR A TELA DE SAIDA
	private static void limpaTela() {
		System.out.println("\n\n\n\n\n\n\n\n");
	}
	
	
	//TESTES
	private static void teste() {
		System.out.println("SUCESSO!");
	}
	private static void erro() {
		System.out.println("FALHA!!");
	}
	
	//MENU PRINCIPAL
	public static char menu() {
		String msg;
		
		System.out.println("** Sistema gerencial Dev's Restaurant **");
		System.out.println("**             Versão 2.0             **\n");
		
		System.out.println("======      MENU DE FUNÇÔES       ======");
		System.out.println("= 1- Abrir Restaurante                 =");
		System.out.println("= 2- Buffet                            =");
		System.out.println("= 3- Administração                     =");
		System.out.println("= 4- Caixa                             =");
		System.out.println("= 5- Relatorio de fluxo                =");
		System.out.println("= 6- Encerrar                          =");
		System.out.println("========================================");
		System.out.print("\n= Digite uma opção: ");
		msg = new Scanner(System.in).next();
		return msg.charAt(0);
	}

	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		ListaS rest = new ListaS();
		adm c;
		mesas m;
		char opc;
		boolean abrir = false;
		
		do {
			opc = menu();
			limpaTela();
			switch(opc) {
				case '1':
					System.out.println("Deseja abrir o restaurante agora? (S/N)");
					String esclh = ent.next().toUpperCase();
					if(esclh.charAt(0) == 'S') {
						
						int i=1; //INICIALIZA AS MESAS
						while(i!=11) {
							
							if(i==1) {
								m = new mesas();
								m.setMesa("1");
								rest.inserirIni(m);
								i++;
							}
							if(i==2) {
								m = new mesas();
								m.setMesa("2");
								rest.inserirIni(m);
								i++;
							}
							if(i==3) {
								m = new mesas();
								m.setMesa("3");
								rest.inserirIni(m);
								i++;
							}
							if(i==4) {
								m = new mesas();
								m.setMesa("4");
								rest.inserirIni(m);
								i++;
							}
							if(i==5) {
								m = new mesas();
								m.setMesa("5");
								rest.inserirIni(m);
								i++;
							}
							if(i==6) {
								m = new mesas();
								m.setMesa("6");
								rest.inserirIni(m);
								i++;
							}	
							if(i==7) {
								m = new mesas();
								m.setMesa("7");
								rest.inserirIni(m);
								i++;
							}
							if(i==8) {
								m = new mesas();
								m.setMesa("8");
								rest.inserirIni(m);
								i++;
							}
							if(i==9) {
								m = new mesas();
								m.setMesa("9");
								rest.inserirIni(m);
								i++;
							}
							if(i==10) {
								m = new mesas();
								m.setMesa("10");
								rest.inserirIni(m);
								i++;
							}
							System.out.println("Inicialização concluida com sucesso!");
							abrir = true;

						
						}
					} else {
						erro();
					}
					
				case '2':
					if (abrir) {
						teste();
					} else {
						System.out.println("RESTAURANTE FECHADO!");
					}
					
					
					
					
					
					
		
					
					
				default:
					System.out.println("Opção invalida!");
			}
		} while(opc != '6');
		System.exit(0);
	}	
}
