public class Main {
    public static void main(String[] args) {

        ListaEncadeada<Tarefa> lista = new ListaEncadeada<>();
        lista.inserirNoInicio(new Tarefa("Estudar Java"));
        lista.inserirNoInicio(new Tarefa("Fazer exercício"));
        lista.inserirNoInicio(new Tarefa("Ler artigo"));
        System.out.print("Lista inicial: ");
        lista.exibir();
        System.out.println("Elemento no índice 1: " + lista.obterEm(1));
        lista.removerDoInicio();
        System.out.print("Após remover do início: ");
        lista.exibir();
        ListaEncadeada<String> lista2 = new ListaEncadeada<>();
        lista2.inserirNoInicio("A");
        lista2.inserirNoInicio("B");
        lista2.inserirNoInicio("C");
        lista2.exibir();
        lista2.removerValor("B");
        System.out.print("Após remover 'B': ");
        lista2.exibir();
    }
}