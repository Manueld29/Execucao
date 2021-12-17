import java.util.Scanner;

public class TesteDeExecuçao {
    public static void main(String[] args) {
        String nomes[] = new String[2];
        nomes[0] = "Ana";
        nomes[1] = "José";
        int indice;
        boolean loop = true;
        do {
            try {
                Scanner nn = new Scanner(System.in);
                System.out.println("Indice? ");
                indice = nn.nextInt();
                System.out.println(nomes[indice]);
                loop = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Indice invalido!");
            }
        }
        while(loop);
    }
}

