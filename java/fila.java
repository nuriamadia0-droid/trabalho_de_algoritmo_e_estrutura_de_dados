import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Queue<Integer> fila = new LinkedList<>();

        int opcao = 0;

        do{
            System.out.println("---------MENU----------");
           System.out.println("1. adicionar elemento");
            System.out.println("2. remover elemento");
            System.out.println("3. visualizar o elemento de frent");
            System.out.println("4. ver esta vazio");
            System.out.println("0. SAIR");

            opcao = ler.nextInt();

            switch (opcao){

                case 1:
                    System.out.println("gidite um numero");
                    fila.add(ler.nextInt());
                    break;

                case 2:
                    if(!fila.isEmpty())

                        System.out.println("removido" + fila.poll());
                    else
                        System.out.println("fila Vazia");
                    break;
                case 3:
                    if(!fila.isEmpty())
                        System.out.println("o elemento frente" + fila.peek());
                    else
                        System.out.println("fila Vazia");
                    break;
                case 4 :
                    System.out.println(fila.isEmpty()? "a fila esta vazia" : "não esta vazia");
                    break;
            }
        }while (opcao != 0);

    }
}
