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
        tamanhoTotal++;
    }

    // Remover do início
    // Complexidade O(1): apenas move o ponteiro do início para o próximo
    public void removerDoInicio() {
        if (inicio != null) {
            inicio = inicio.proximo;
            tamanhoTotal--;
        }
    }

    // Remover primeira ocorrência de um valor
    // Complexidade O(n): no pior caso percorre toda a lista
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

    // Obter elemento por índice
    // Complexidade O(n): no pior caso, percorre a lista até o índice desejado
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
