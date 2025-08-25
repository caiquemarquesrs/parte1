public class ListaEncadeada<T> {

    private No<T> inicio;

    // Inserir no início
    public void inserirNoInicio(T dado) {
        No<T> novoNo = new No<>(dado);
        novoNo.proximo = inicio;
        inicio = novoNo;
    }

    // Inserir no fim
    // Complexidade O(n): precisa percorrer até o último nó
    public void inserirNoFim(T dado) {
        No<T> novoNo = new No<>(dado);
        if (inicio == null) {
            inicio = novoNo;
        } else {
            No<T> atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

    // Tamanho (versão O(n))
    // Complexidade O(n): percorre todos os nós e conta
    public int tamanho() {
        int contador = 0;
        No<T> atual = inicio;
        while (atual != null) {
            contador++;
            atual = atual.proximo;
        }
        return contador;
    }

    // Exibir lista
    public void exibir() {
        No<T> atual = inicio;
        while (atual != null) {
            System.out.print(atual.dado + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }
}
