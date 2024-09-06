import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class trabalho1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        List<String> concluidos = new ArrayList<>();
        String comand;
        System.out.println("   -Inicio do Programa-   ");
        do {
            System.out.println("      -MENU-      ");
            System.out.print("1 - Para Adicionar:\n"
                    + "2 - Para Remover:\n"
                    + "3 - Para Publicar:\n"
                    + "4 - Para Informar Status:\n"
                    + "5 - Para Sair:\n");
            comand = entrada.nextLine().trim();
            if (comand.equals("1")) {
                System.out.print("Digite a Tarefa: ");
                String tarefa = entrada.nextLine();
                lista.add(tarefa);
                System.out.println("----------------\n");
                concluidos.add("inconcluido");
            } else if (comand.equals("2")) {
                int tamanhoI = lista.size();
                System.out.println("----------------\n");
                for (int conta = 0; conta < tamanhoI; conta++) {
                    System.out.println(conta + " - " + lista.get(conta));
                }
                System.out.println("----------------\n");
                System.out.println("Digite para remover: ");
                int indice = 0;
                try {
                    indice = entrada.nextInt();
                    entrada.nextLine();
                    if (indice < 0 || indice > lista.size()-1) {
                        System.out.println("Indice Invalido!");
                        System.out.println("----------------\n");
                    } else {
                        lista.remove(indice);
                        concluidos.remove(indice);
                        System.out.println("----------------\n");
                    }
                }catch (Exception e){
                    System.out.println("Indice Invalido!");
                    System.out.println("----------------\n");
                }

            } else if (comand.equals("3")) {
                int tamanhoI = lista.size();
                System.out.println("----------------\n");
                if (tamanhoI == 0) {
                    System.out.println("Lista Vazia! ");
                }
                else {
                    for (int conta = 0; conta < tamanhoI; conta++) {
                        System.out.println(conta +" - "+lista.get(conta)+" - "+
                                concluidos.get(conta));
                    }
                    System.out.println("----------------\n");
                }
            }
            else if (comand.equals("4")) {
                int tamanhoI = lista.size();
                System.out.println("----------------\n");
                for (int conta = 0; conta < tamanhoI; conta++) {
                    System.out.println(conta + " - " + lista.get(conta)+" - "+
                            concluidos.get(conta));
                }
                System.out.println();
                try {
                    System.out.println("informe qual deseja concluir: ");
                    int subConcluidas = entrada.nextInt();
                    if (subConcluidas < 0 || subConcluidas > lista.size() - 1) {
                        System.out.println("Indice Invalido!");
                        System.out.println("----------------\n");
                    } else {
                        concluidos.set(subConcluidas, "concluido");
                    }
                    System.out.println("----------------\n");
                } catch (Exception e) {
                    System.out.println("Indice Invalido!");
                    System.out.println("----------------\n");
                }
                entrada.nextLine();
            }
            else {
                System.out.println("Opção Invalida!");
                System.out.println("----------------\n");
            }
        }while(!comand.equalsIgnoreCase("5"));

        System.out.println("   -FIM DO PROGRAMA!-   ");
        entrada.close();
    }
}
