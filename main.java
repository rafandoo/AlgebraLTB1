import java.util.Scanner;

public class main {

	//METODO PARA LIMPAR A TELA DE SAIDA
	private static void limpaTela() {
		System.out.println("\n\n\n\n\n\n\n\n");
	}
	
	//METODO PARA LIMPAR BUFFER DO TECLADO \n
	private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
	}
	
	//TESTES
	private static void teste() {
		System.out.println("SUCESSO!");
	}
	private static void erro() {
		System.out.println("FALHA!!");
	}
	
	public static float cardBebidas() {
		int esc;
		System.out.println("==            CARDAPIO DE BEBIDAS            ==");
		System.out.println("= 1- Soda Laranjadinha 600ml (R$4,50)         =");
		System.out.println("= 2- Suco natural de laranja 350ml (R$6,30)   =");
		System.out.println("= 3- Pepsh Cola 1,5L (R$7,25)                 =");
		System.out.println("= 4- Achocolatado Choque Leite 260ml (R$2,60) =");
		System.out.print("\n=Digite sua escolha: ");
		esc = new Scanner(System.in).nextInt();
		if(esc==1) {
			return (4.50f);
		}
		if(esc==2) {
			return (6.30f);
		}
		if(esc==3) {
			return (7.25f);
		} else {
			return (2.60f);
		}
	}
	
	//MENU PRINCIPAL
	public static char menu() {
		String msg;
		Scanner ent = new Scanner(System.in);
		
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
		msg = ent.next();
		clearBuffer(ent);
		return msg.charAt(0);
	}

	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		ListaS rest = new ListaS();
		filaRestaurante filaR = new filaRestaurante();
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
								filaR.inserirFimR(i);
								i++;
							}
							if(i==2) {
								m = new mesas();
								m.setMesa("2");
								rest.inserirIni(m);
								filaR.inserirFimR(i);
								i++;
							}
							if(i==3) {
								m = new mesas();
								m.setMesa("3");
								rest.inserirIni(m);
								filaR.inserirFimR(i);
								i++;
							}
							if(i==4) {
								m = new mesas();
								m.setMesa("4");
								rest.inserirIni(m);
								filaR.inserirFimR(i);
								i++;
							}
							if(i==5) {
								m = new mesas();
								m.setMesa("5");
								rest.inserirIni(m);
								filaR.inserirFimR(i);
								i++;
							}
							if(i==6) {
								m = new mesas();
								m.setMesa("6");
								rest.inserirIni(m);
								filaR.inserirFimR(i);
								i++;
							}	
							if(i==7) {
								m = new mesas();
								m.setMesa("7");
								rest.inserirIni(m);
								filaR.inserirFimR(i);
								i++;
							}
							if(i==8) {
								m = new mesas();
								m.setMesa("8");
								rest.inserirIni(m);
								filaR.inserirFimR(i);
								i++;
							}
							if(i==9) {
								m = new mesas();
								m.setMesa("9");
								rest.inserirIni(m);
								filaR.inserirFimR(i);
								i++;
							}
							if(i==10) {
								m = new mesas();
								m.setMesa("10");
								rest.inserirIni(m);
								filaR.inserirFimR(i);
								i++;
							}
							
							
							
							System.out.println("Inicialização concluida com sucesso!");
							abrir = true;

						
						}
					} else {
						erro(); //REVER
					}
					
				case '2':
					if (abrir) {
						System.out.print("\nNumero de pessoas na fila: ");
						System.out.print(filaR.getTotalRest()+"\n");
						System.out.print("\nNumero de pessoas almocando: ");
						System.out.print(filaR.getTotalAlm()+"\n");
						
						c = new adm();
						m = new mesas();
						boolean x = true;
						
						System.out.println("Sirva-se em nosso buffet livre, valor R$15,00 por pessoa");
						System.out.print("\nDigite o numero da comanda: ");
						c.setComanda(ent.next());
						System.out.println("Deseja incluir uma bebida? (S/N)");
						esclh = ent.next().toUpperCase();
						if(esclh.charAt(0) == 'S') {
							c.setValor(cardBebidas()+15);
						} else {
							c.setValor(15);
						}
						
						while(x) { 											//REVER ESSA PARTE URGENTE!!!!
							System.out.print("\nMesas disponiveis: ");
							System.out.print(rest.imprimirMesas());
							System.out.print("\nDigite a mesa desejada: ");
							String mesa = ent.next();
							if(rest.ocupaMesa(mesa)){
								c.setMesas(mesa);
								System.out.println("Mesa ocupada com sucesso!");
								x = false;
							} else {
								System.out.println("Mesa indisponivel");
							}
						}
						rest.inserirIni(c);
						filaR.removeIniR();
					} else {
						System.out.println("RESTAURANTE FECHADO!");
					}
					break;
					
				case '3':
					//adm
					System.out.println("============================");
					System.out.println("= 1-Inserir pratos na pilha ");
					System.out.println("= ");
					
					break;
				case '4':
					caixa cxa = new caixa();
					cxa.cx();
					break;
				case '5':
					//relatorio
					
					break;
					
					
					
					
		
					
					
				default:
					System.out.println("Opção invalida!");
			}
		} while(opc != '6');
		ent.close();
		System.exit(0);
	}	
}
