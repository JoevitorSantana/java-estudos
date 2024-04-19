import java.util.Scanner;

class DesafioDeCodigo1 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        
        int tamanho = Integer.parseInt(scann.nextLine());

        //Informe seu código aqui
        String[] paises = new String[tamanho];
        
        for (int i = 0; i < paises.length; i++) {
            paises[i] = scann.nextLine();
        }
        
        // Ler o país
        String busca = scann.nextLine();
        int posicaoEncontrado = -1;
        
        for (int i = 0; i < paises.length; i++) {
            System.out.println(paises[i] +" = "+ busca);
            if (paises[i].equals(busca)){
                posicaoEncontrado = i;
                break;
            }
        }
        
        System.out.println(posicaoEncontrado);

        scann.close();
    }
}