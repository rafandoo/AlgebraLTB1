import java.util.Scanner;
public class main {

	public static char menu() {
		String msg;
		
		System.out.println("========================");
		System.out.println("= 1- Inserir comanda   =");
		System.out.println("= 2- Cancelar comanda  =");
		System.out.println("= 3- Listar comandas   =");
		System.out.println("= 4- Localizar comanda =");
		System.out.println("= 5- Encerrar          =");
		System.out.println("========================");
		msg = new Scanner(System.in).next();
		return msg.charAt(0);
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Lista rest = new Lista();
		comandosmesas cm;
		adm c;
		mesas m;
		char opc;
		
		do {
			opc = menu();
			switch(opc) {
				case '1':
					System.out.println("---- Criando comanda ----");
					c = new adm();
					cm = new comandosmesas();
					boolean x=true;
					
					System.out.print("\nDigite o numero da comanda: ");
					c.setComanda(ent.next());
					System.out.print("\nDigite o preço: R$");
					c.setValor(ent.nextDouble());
					
					while(x) { 											//REVER ESSA PARTE URGENTE!!!!
						System.out.print("\nMesas disponiveis: ");
						System.out.print(cm.imprimirMesas());
						System.out.print("\nDigite a mesa desejada: ");
						int mesa = ent.nextInt();
					}
					cm.ocupaMesa(null);
					rest.inserirIni(c);
					break;
					
				case '2':
					if(rest.ehVazio()) {
						System.out.println("Lista vazia!!");
					} else {
						System.out.print("\nDigite o numero da comanda: ");
						String numC = ent.next();
						if(rest.removeNodo(numC)) {
							System.out.println(numC+" comanda cancelada com suceeso");
						} else {
							System.out.println("Falha ao cancelar comanda.");
						}
					}
					break;
				
				case '3':
					System.out.println("*** Comandas Geradas ***");
					System.out.println(rest.imprimirLista());
					System.out.println("***********************************");
					break;
				
				case '4':
					if(rest.ehVazio()) {
						System.out.println("A lista esta vazia!");
					} else {
						System.out.print("\nDigite o numero da comanda: ");
						String numC = ent.next();
						if(rest.pesquisaNodo(numC) == null) {
							System.out.println("Comanda inexixtente");							
						} else {
							System.out.println(rest.pesquisaNodo(numC));
						}
					}
					System.out.println();
					break;
					
				case '5':
					System.out.println("Finalizando programa");
					break;
					
					//TESTES
				case '6':
					cm = new comandosmesas();
					System.out.print("\nMesas disponiveis: ");
					System.out.print(cm.imprimirMesas());
					System.out.println("");
					break;
				case '7':
					cm = new comandosmesas();
					
					
					break;
				case '8':
					cm = new comandosmesas();
					m = new mesas();
					
					m.setMesa("1");
					rest.inserirIni(m);
					
					System.out.println(rest.imprimirMesas());
				default:
					System.out.println("Opção invalida!");
			}
		} while(opc != '5');
		System.exit(0);
	}	
}
