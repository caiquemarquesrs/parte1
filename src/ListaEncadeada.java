public class ListaEncadeada<T> {

    private No<T> inicio;

    // Inserir no início
    public void inserirNoInicio(T dado) {
        No<T> novoNo = new No<>(dado);
        novoNo.proximo = inicio;
        inicio = novoNo;
    }

    // Remover do início
    // Complexidade O(1): apenas move o ponteiro do início para o próximo
    public void removerDoInicio() {
        if (inicio != null) {
            inicio = inicio.proximo;
        }
    }

    // Obter elemento por índice
    // Complexidade O(n): no pior caso, percorre a lista até o índice desejado
    public T obterEm(int indice) {
        if (indice < 0) {
            throw new IndexOutOfBoundsException("Índice inválido: " + indice);
        }
        No<T> atual = inicio;
        int contador = 0;
        while (atual != null) {
            if (contador == indice) {
                return atual.dado;
            }
            atual = atual.proximo;
            contador++;
        }
        throw new IndexOutOfBoundsException("Índice inválido: " + indice);
    }

    // Remover primeira ocorrência de um valor
    // Complexidade O(n): no pior caso percorre toda a lista
    public void removerValor(T dado) {
        if (inicio == null) return;
        if (inicio.dado.equals(dado)) {
            inicio = inicio.proximo;
            return;
        }
        No<T> atual = inicio;
        while (atual.proximo != null && !atual.proximo.dado.equals(dado)) {
            atual = atual.proximo;
        }
        if (atual.proximo != null) {
            atual.proximo = atual.proximo.proximo;
        }
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