public class BubbleSort {
    private int[] vetor;

    public BubbleSort(int[] vetor) {
        this.vetor = vetor;
    }

    public void iterate() {
        for (int i = 0; i < vetor.length; i++) {  // Itera por cada item da array
            for (int j = 0; j < (vetor.length - 1); j++) {  // Itera uma segunda vez pela array para garantir que todos os itens serão contemplados entre si
                if (vetor[j] > vetor[j + 1]) {  // Verificação se o item atual é maior que o próximo, caso seja, os mesmos a posição invertida
                    int save = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = save;
                }
            }
        }
    };

    public void print() {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf(String.format("%d ", vetor[i]));
        }
    }

    public static void main(String[] args) {
        var sort = new BubbleSort(new int[] {3,6,8,1,4,9,0});
        sort.iterate();
        sort.print();
    }
}
