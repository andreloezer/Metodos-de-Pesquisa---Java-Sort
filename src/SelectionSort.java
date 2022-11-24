public class SelectionSort {
    private int[] vetor;

    public SelectionSort(int[] vetor) {
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
                }
            }
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

