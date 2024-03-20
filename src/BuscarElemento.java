import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuscarElemento {

    public static void main(String[] args) {
        int[] vetor={10, 30, 5, 55, 60};
        List<String> listaDeString = new ArrayList<String>();

        System.out.println(buscarElementoETrocarEle(vetor, 5));
        System.out.println("lista: " + Arrays.toString(vetor));
    }


    /**
     * Método para ver se um elemento inteiro está ou não dentro de um vetor e troca ele com o número do
     * índice anterior do vetor
     * @param vetor - Vetor <b>de</b> <i>inteiros</i>
     * @param numero - Número a ser verificado
     * @return - índice do vetor que o elemento está presente ou -1 caso o elemento não esteja presente
     */
    private static int buscarElementoETrocarEle(int[] vetor, int numero) {

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                if (i != 0) {
                    int dummy = vetor[i];
                    vetor[i] = vetor[i - 1];
                    vetor[i - 1] = dummy;
                }
                return numero;
            }
        }
        return -1;
    }
}
