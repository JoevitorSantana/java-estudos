import java.util.Scanner;

public class BuscaBinaria {

    static void OrdenarArray(int[] array) {
        // Selection Sort
        for (int i = 0; i < array.length; i++) {
            int menor = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[menor]) {
                    menor = j;
                }
            }

            int aux = array[menor];
            array[menor] = array[i];
            array[i] = aux;
        }
    }

    static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d  ", array[i]);
        }

        System.out.printf("\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[]{4,9,-1,3,5,0,7};
        int resultado = -1;
        int inicio = 0;
        int fim = numeros.length - 1;
        int meio = 0;

        OrdenarArray(numeros);
        imprimirArray(numeros);

        System.out.println("Digite o elemento a ser encontrado!");
        int alvo = scanner.nextInt();

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (numeros[meio] < alvo) {
                inicio = meio + 1;
            } else if (numeros[meio] > alvo) {
                fim = meio - 1;
            } else if (numeros[meio] == alvo) {
                resultado = meio;
                break;
            }
        }

        if (resultado < 0) {
            System.out.println("O elemento não foi encontrado!");
        } else {
            System.out.printf("O número %d está na posição %d", alvo, resultado);
        }

        scanner.close();
    }
}