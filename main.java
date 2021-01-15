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
		adm c;
		mesas m;
		char opc;
		
		do {
			opc = menu();
			switch(opc) {
				case '1':
					System.out.println("---- Criando comanda ----");
					c = new adm();
					m = new mesas();
					boolean x=true;
					
					System.out.print("\nDigite o numero da comanda: ");
					c.setComanda(ent.next());
					System.out.print("\nDigite o preço: R$");
					c.setValor(ent.nextDouble());
					
					while(x) { //REVER ESSA PARTE
						System.out.print("\nMesas disponiveis: ");
						System.out.print(m.listaMesas());
						System.out.print("\nDigite a mesa desejada: ");
						int mesa = ent.nextInt();
						if(m.ehVazioM(mesa)) {
							c.setMesas(mesa);
							m.ocupaMesa(mesa);
							break;
						} else {
							System.out.println("Mesa indisponivel.");
						}
					}
					rest.inserirIni(c);
					break;
					
				case '2':
					if(rest.ehVazio()) {
						System.out.println("Lista vazia!!");
					} else {
						System.out.print("\nDigite o numero da comanda: ");
						String numC =ent.next();
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
					
				case '6':
					mesas m2 = new mesas();
					System.out.println(m2.listaMesas());
					break;
				case '7':
					mesas m3 = new mesas();
					m3.ocupaMesa(2);
					System.out.println();
					break;
				case '8':
					mesas m4 = new mesas();
					m4.imprimeV();
					
				default:
					System.out.println("Opção invalida!");
			}
		} while(opc != 5);
		System.exit(0);
	}	
}
