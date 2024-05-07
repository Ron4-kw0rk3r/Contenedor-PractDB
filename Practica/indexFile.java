import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
public class indexFile {
    public static void main(String[] args) {
        try {
            File file = new File("archivo.txt");
            FileWriter writer = new FileWriter(file, true); // Append mode
            Vector<String> vector = new Vector<String>();
            vector.add("\n");
            vector.add("Contenido agregado nueva linea : Nºc1");
            
            for (String line : vector) {
                writer.write(line);
            }
            System.out.println("Se agrego al archivo el dato:");
            System.out.println("cerrando...");
            writer.close();
        } catch (IOException e) {
            // error
            e.printStackTrace();
        }
    }
}
