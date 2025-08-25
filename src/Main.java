public class Main {
    public static void main(String[] args) {

        ListaEncadeada<String> agenda = new ListaEncadeada<>();
        agenda.inserirNoInicio("Marcar reunião");
        agenda.inserirNoFim("Preparar apresentação");
        agenda.inserirNoInicio("Revisar e-mails");
        agenda.inserirNoFim("Enviar relatório");
        System.out.print("Estado da lista: ");
        agenda.exibir();
        System.out.println("Tamanho atual (O(1)): " + agenda.tamanho());
        System.out.println("Elemento no índice 0: " + agenda.obterEm(0));
        System.out.println("Elemento no índice 2: " + agenda.obterEm(2));
        agenda.removerDoInicio();
        System.out.print("Após remover do início: ");
        agenda.exibir();
        System.out.println("Tamanho: " + agenda.tamanho());
        agenda.removerValor("Preparar apresentação");
        System.out.print("Após remover 'Preparar apresentação': ");
        agenda.exibir();
        System.out.println("Tamanho: " + agenda.tamanho());
    }
}