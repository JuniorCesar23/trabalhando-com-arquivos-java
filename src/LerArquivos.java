import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LerArquivos {
    
    public static void lerArquivos(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Diretório e nome do arquivo: ");
            String arquivo = entrada.next();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))){
            String linha = null;
            while (true){
                linha = br.readLine();
                if (linha != null){
                    System.out.println(linha);
                } else {
                    break;
                }
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
