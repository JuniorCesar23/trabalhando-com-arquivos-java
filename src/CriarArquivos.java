import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CriarArquivos {

    static String[] linguagens = new String[] {"Java", "Python", "JavaScript"};

    // Método para criar arquivos
    public static void criarArquivo(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o diretório e nome do arquivo: ");
            String arquivo = entrada.next();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))){

            for (String linguagem : linguagens){
                bw.write(linguagem);
                bw.newLine();
            }

        } 
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            entrada.close();
        }

    }

}