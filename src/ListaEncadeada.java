public class ListaEncadeada<T> {
    private No<T> inicio;
    private int tamanhoTotal = 0;

    // Inserir no início
    // O(1)
    public void inserirNoInicio(T dado) {
        No<T> novoNo = new No<>(dado);
        novoNo.proximo = inicio;
        inicio = novoNo;
        tamanhoTotal++;
    }

    // Inserir no fim
    // O(n)
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
        tamanhoTotal++;
    }

    // Remover do início
    // O(1)
    public void removerDoInicio() {
        if (inicio != null) {
            inicio = inicio.proximo;
            tamanhoTotal--;
        }
    }

    // Remover valor
    // O(n)
    public void removerValor(T dado) {
        if (inicio == null) return;

        if (inicio.dado.equals(dado)) {
            inicio = inicio.proximo;
            tamanhoTotal--;
            return;
        }

        No<T> atual = inicio;
        while (atual.proximo != null && !atual.proximo.dado.equals(dado)) {
            atual = atual.proximo;
        }

        if (atual.proximo != null) {
            atual.proximo = atual.proximo.proximo;
            tamanhoTotal--;
        }
    }

    // Obter por índice
    // O(n)
    public T obterEm(int indice) {
        if (indice < 0 || indice >= tamanhoTotal) {
            throw new IndexOutOfBoundsException("Índice inválido: " + indice);
        }

        No<T> atual = inicio;
        for (int i = 0; i < indice; i++) {
            atual = atual.proximo;
        }
        return atual.dado;
    }

    // Tamanho otimizado
    // O(1): apenas retorna o valor já armazenado
    public int tamanho() {
        return tamanhoTotal;
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