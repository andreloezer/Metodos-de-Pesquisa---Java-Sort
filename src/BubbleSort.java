public class BubbleSort {
    private int[] vetor;

    public BubbleSort(int[] vetor) {
        this.vetor = vetor;
    }

    public void iterate() {
        for (int i = 0; i < vetor.length; i++) {
            int valor = 2147483647;
            int index = 0;
            for (int j = i; j < (vetor.length); j++) {
                if (vetor[j] < valor) {
                    valor = vetor[j];
                    index = j;
                    int save = vetor[i];
                    vetor[i] = valor;
                    vetor[index] = save;
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
        var sort = new BubbleSort(new int[] {38,14,29,34,666,88,1,999,0,-50});
        sort.iterate();
        sort.print();
    }
}
