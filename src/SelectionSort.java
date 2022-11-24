public class SelectionSort {
    private int[] vetor;

    public SelectionSort(int[] vetor) {
        this.vetor = vetor;
    }

    public void iterate() {
        for (int i = 0; i < vetor.length; i++) {  // Itera pela array
            int valor = 2147483647;  // Valor máximo de int, garantindo que nenhum item da array será ignorado
            int index = 0;  // Começa com a posição inicial
            for (int j = i; j < (vetor.length); j++) {  // Para cada iteração se o item é menor que o menor valor já encontrado, caso seja, o item se tornará o novo valor mais baixo
                if (vetor[j] < valor) {
                    valor = vetor[j];
                    index = j;
                }
            }  // Ao final da iteração o valor mais baixo encontrado será trocado com o item da iteração superior
            int save = vetor[i];
            vetor[i] = valor;
            vetor[index] = save;
        }
    };

    public void print() {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf(String.format("%d ", vetor[i]));
        }
    }

    public static void main(String[] args) {
        var sort = new SelectionSort(new int[] {3,6,8,1,4,9,0});
        sort.iterate();
        sort.print();
    }
}

