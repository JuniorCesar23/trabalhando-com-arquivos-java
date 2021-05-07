import java.io.File;
import java.util.Scanner;

public class ListarArquivos {
    
    public static void listarArquivos(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Diretório: ");
            String diretorio = entrada.next();

        try {
            File file = new File(diretorio);
            File[] arquivos = file.listFiles(File::isFile);
            for (File arquivo : arquivos){
                System.out.println(arquivo);
            }
        } 
        catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            entrada.close();
        }
            
    }

}
