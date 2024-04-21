import java.util.Scanner;

public class DesafioDeCodigoBuscaBinaria {
    public static void main(String args[]) {
        Scanner scann = new Scanner(System.in);
        
        int tamanho = Integer.parseInt(scann.nextLine());
        
        Estudante[] estudantes = new Estudante[tamanho];
        for(int i = 0; i < estudantes.length; i++)
        {
            int id = scann.nextInt();
            String nome = scann.next();
            double nota = scann.nextDouble();
            
            estudantes[i] = new Estudante(id, nome, nota);
        }
        

        //Informe seu código aqui
        for (int i = 0; i < estudantes.length; i++) {
            int menorEstudante = i;
            
            for (int j = i + 1; j < estudantes.length; j++) {
                if (estudantes[j].getNota() > estudantes[menorEstudante].getNota()) {
                    menorEstudante = j;
                }
                
                if (estudantes[j].getNota() == estudantes[menorEstudante].getNota()) {
                    if (estudantes[j].getNome().compareTo(estudantes[menorEstudante].getNome()) < 0) {
                        menorEstudante = j;
                    }
                    
                    if (estudantes[j].getNome().compareTo(estudantes[menorEstudante].getNome()) == 0) {
                        if (estudantes[j].getId() < estudantes[menorEstudante].getId()) {
                            menorEstudante = j;
                        }
                    }
                }
            }
            
            Estudante tmp = new Estudante(
                estudantes[menorEstudante].getId(),
                estudantes[menorEstudante].getNome(),
                estudantes[menorEstudante].getNota()
            );
            
            estudantes[menorEstudante] = estudantes[i];
            estudantes[i] = tmp;
        }
        
        double nota = scann.nextDouble();
        
        int resultado = -1;
        int inicio = 0;
        int fim = estudantes.length - 1;
        int meio = 0;
        
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            
            if (estudantes[meio].getNota() < nota)
                inicio = meio + 1;
            else if (estudantes[meio].getNota() > nota)
                fim = meio - 1;
            else if (estudantes[meio].getNota() == nota)
                resultado = meio;
                break;
        }
        
        if (resultado >= 0)
            System.out.print(estudantes[resultado].getNome());

    }
}

class Estudante{
    private int id;
    private String nome;
    private double nota;
    public Estudante(int id, String nome, double nota) {
        this.id = id;
        this.nome = nome;
        this.nota = nota;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public double getNota() {
        return nota;
    }
}
