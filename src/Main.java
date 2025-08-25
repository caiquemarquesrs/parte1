public class Main {
    public static void main(String[] args) {

        ListaEncadeada<Tarefa> lista = new ListaEncadeada<>();
        lista.inserirNoInicio(new Tarefa("Revisar e-mails"));
        lista.inserirNoFim(new Tarefa("Marcar reunião"));
        lista.inserirNoFim(new Tarefa("Preparar apresentação"));
        System.out.print("Lista: ");
        lista.exibir();
        System.out.println("Tamanho atual (O(n)): " + lista.tamanho());
    }
}