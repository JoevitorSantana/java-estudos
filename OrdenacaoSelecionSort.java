public class OrdenacaoSelecionSort {
    public static void main(String[] args) {
        int[] numeros = new int[]{4,9,-1,3,5,0,7};
        
        // Vamos ordenar utilizando ordenacao de selection Sort

        // Nela vamos varrer os elementos do vetor
        for (int i = 0; i < numeros.length; i++) {
            int indiceMenorNumero = i;// Consideraremos o menor como o indice atual
            System.out.println(i+1 + "° iteração menor número = " + numeros[indiceMenorNumero]);
            // Iremos percorrer o elemento a partir do próximo
            // vendo se há outro menor que o atual
            for (int j = i + 1; j < numeros.length; j++) {
                // Se for menor atualizo o indiceMenor com o novo menor
                System.out.println(numeros[j] + " é menor que " + numeros[indiceMenorNumero]+ "? ");
                if (numeros[j] < numeros[indiceMenorNumero]) {
                    indiceMenorNumero = j;
                    System.out.println("Sim! Novo menor = " + numeros[indiceMenorNumero]);
                } else {
                    System.out.println("Não");
                }
            }
            
            // realizo a troca dos números
            System.out.println("Pronto Achei o menor número dessa iteração = " + numeros[indiceMenorNumero]);
            System.out.println("Vou trocar com o atual = " + numeros[i]);
            
            System.out.println("Antes");
            imprimirArray(numeros);

            int temp = numeros[indiceMenorNumero];
            numeros[indiceMenorNumero] = numeros[i];
            numeros[i] = temp;

            System.out.println("Depois");
            imprimirArray(numeros);

            /*

            1° - 10, 6, 7, 5, 8, 9, 2, 1, 3

            2° - 10, 6, 7, 5, 8, 9, 2, 1, 3
            
            */
        }
    }

    static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d  ", array[i]);
        }

        System.out.printf("\n");
    }
}