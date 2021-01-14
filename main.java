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
		char opc;
		
		do {
			opc = menu();
			switch(opc) {
				case '1':
					System.out.println("---- Criando comanda ----");
					c = new adm();
					System.out.print("\nDigite o numero da comanda: ");
					c.setComanda(ent.next());
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
					System.out.println();
					break;
					
				case '5':
					System.out.println("Finalizando programa");
					break;
					
				default:
					System.out.println("Opção invalida!");
			}
		} while(opc != 5);
		System.exit(0);
	}	
}
