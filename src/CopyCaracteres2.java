import java.io.*;

public class CopyCaracteres2 {
    private static String ruta = "/home/dam/Documentos/Copycaracteres2/texto1.txt";
    private static String ruta2 = "/home/dam/Documentos/Copycaracteres2/texto2.txt";
    public static void main(String[] args) {
        copyCaracteres();
    }
    /**
     * Metodo que lee un archivo y copia su contenido en otro archivo
     */
    public static void copyCaracteres() {
        try (
                FileReader fr = new FileReader(ruta);
                FileWriter fw = new FileWriter(ruta2);
                BufferedReader br = new BufferedReader(fr);
                PrintWriter pw = new PrintWriter(fw);
            ){
            String linea;
            while ((linea = br.readLine()) != null) {
                pw.println(linea);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
