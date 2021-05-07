import java.io.File;
import java.util.Scanner;

public class ListarPastas {
 
    public static void listarPastas(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Diretório: ");
            String diretorio = entrada.next();
        try {
            File arquivo = new File(diretorio);
            File[] pastas = arquivo.listFiles(File::isDirectory);
            for (File pasta : pastas){
                System.out.println(pasta);
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            entrada.close();
        }
    }

}
