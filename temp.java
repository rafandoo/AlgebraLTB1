import java.util.Scanner;

public class temp {
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
		ListaS rest = new ListaS();
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
					System.out.print("\nDigite o pre�o: R$");
					c.setValor(ent.nextDouble());
					
					while(x) { 											//REVER ESSA PARTE URGENTE!!!!
						System.out.print("\nMesas disponiveis: ");
						System.out.print(rest.imprimirMesas());
						System.out.print("\nDigite a mesa desejada: ");
						String mesa = ent.next();
						if(rest.ocupaMesa(mesa)){
							System.out.println("Mesa ocupada com sucesso!");
							x = false;
							
						} else {
							System.out.println("Mesa indisponivel");
							
							
						
						}
					}
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

					System.out.print("\nMesas disponiveis: ");
					System.out.print(rest.imprimirMesas());
					System.out.println("");
					break;
				case '7':

					
					
					break;
				case '8':
					int i=1;
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
					
					}
					
					System.out.println(rest.imprimirMesas());
					
				default:
					System.out.println("Op��o invalida!");
			}
		} while(opc != '5');
		System.exit(0);
	}	
}



case '2':
	if (abrir) {
		//colocar fila aqui
		
		c = new adm();
		m = new mesas();
		
		System.out.println("Sirva-se em nosso buffet livre, valor R$15,00 por pessoa");
		System.out.print("\nDigite o numero da comanda: ");
		c.setComanda(ent.next());
		System.out.println("Deseja incluir uma bebida? (S/N)");
		esclh = ent.next().toUpperCase();
		if(esclh.charAt(0) == 'S') {
			System.out.println("== CARDAPIO DE BEBIDAS ==");
			System.out.println("= 1- Soda Laranjadinha 600ml (R$4,50)         =");
			System.out.println("= 2- Suco natural de laranja 350ml (R$6,30)   =");
			System.out.println("= 3- Pepsh Cola 1,5L (R$7,25)                 =");
			System.out.println("= 4- Achocolatado Choque Leite 260ml (R$2,60) =");
		}
	} else {
		System.out.println("RESTAURANTE FECHADO!");
	}
