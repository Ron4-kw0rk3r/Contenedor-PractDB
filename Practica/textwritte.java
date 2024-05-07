import java.io.File;
import java.util.Scanner;
import java.util.Scanner;
import java.io.FileWriter;



public class textwritte{ public static void main(String[] args) {
		System.out.printf("Write File in java...\n");
		File fv_new = new File("C:\\Users\\USUARIO\\Desktop\\Carpeta1\\example.txt");

		System.out.printf("Exists : %s\n", fv_new.exists());

		// make array ; 
		String[] xf;
		if(fv_new.canWrite()){
			System.out.printf("El Archivo si es de escritura\n");

		} else {
			System.out.println("El Archivo no es de escritura");
		}



		try {
			// se verifica si el archivo existe o no existe el cual si no se crea un archivo con esa ruta ya dada

			boolean vset = fv_new.createNewFile(); 
			if (vset){
				System.out.println("El archivo se creo");
			}else{
				System.out.println("El archivo ya existe");
			}
			//System.out.printf("Exists : %s", fv_new.exists());

		} catch (Exception e){
			System.out.println("Sin datos: No existe");
			e.getStackTrace();
			
		}

		try  {

			// mesage en si esto es algo inventado , siempre y cuando el valor se formatee como string es copiado al archivo
			// amenos que se quiera enlazar algo a este como ser un archivo oculto o algun mensaje secreto para el cual se tiene 
			// otros detalles diferentes...

			String cp = "Leave my here";
			// root directory file
			FileWriter arch = new FileWriter("C:\\Users\\USUARIO\\Desktop\\Carpeta1\\example.txt");

			arch.write(cp);

			System.out.println("Mesaje escrito \n");
			System.out.println("ruta : "+ fv_new.getAbsolutePath());
			arch.close();

		}catch (Exception e){
			e.getStackTrace();
		}

		// end
	}
}