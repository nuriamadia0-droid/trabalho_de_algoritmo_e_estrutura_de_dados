import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();

        int opcao = 0;

        do{
            System.out.println("---------MENU_PILHA----------");
            System.out.println("1. adicionar elemento");
            System.out.println("2. remover elemento");
            System.out.println("3. visualizar o elemento de frent");
            System.out.println("4. ver esta vazio");
            System.out.println("0. SAIR");

            opcao = ler.nextInt();
            switch (opcao){

                case 1:
                    System.out.println(" digite um número ");
                    pilha.push(ler.nextInt());
                    break;
                case 2:
                    if(!pilha.isEmpty())
                        System.out.println("removido: " + pilha.pop());
                    else
                        System.out.println(" pilha vazia!");
                    break;

                case 3:
                    if(!pilha.isEmpty())
                        System.out.println(" topo "+ pilha.peek());
                    else
                        System.out.println(" pilha vazia!");
                    break;
                case 4:
                    System.out.println(pilha.isEmpty()? "está vazia" : "não está vazia");

                    break;
            }

        }while (opcao != 0);
    }
}
