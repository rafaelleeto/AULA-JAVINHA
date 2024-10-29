public class RemoveDuplicates {
    public static void main() {
        int[] arrayComRepetidos = {1, 2, 3, 2, 4, 5, 1, 3};

        int n = arrayComRepetidos.length;

        // Loop para encontrar e remover duplicatas
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Se encontrar duplicata, mover os elementos para a esquerda
                if (arrayComRepetidos[i] == arrayComRepetidos[j]) {
                    for (int k = j; k < n - 1; k++) {
                        arrayComRepetidos[k] = arrayComRepetidos[k + 1];
                    }
                    n--; // Reduz o tamanho do array
                    j--; // Verifica o novo elemento na mesma posição
                }
            }
        }

        // Imprimir o resultado
        for (int i = 0; i < n; i++) {
            System.out.print(arrayComRepetidos[i] + " ");
        }
    }
}
