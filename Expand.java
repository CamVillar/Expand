import java.io.*;
import java.util.StringTokenizer;


	
public class Expand extends Parent implements Interface {
	public static void Expand(){

	try{

		for (int i = 0; i < args.length; i++) {
			
			// Se abre el texto y se guarda en una variable //
		FileReader readableFile = new FileReader(args[i]);
		BufferedReader reader = new BufferedReader(readableFile);

		String text = reader;

		//Se crean los tokens para separar las lineas de texto y las referencias //
		StringTokenizer linetext = new StringTokenizer(text, "\\r?\\n");
		StringTokenizer reference = new StringTokenizer(text, "<<< >>>");


		// Mientras hayan tokens de texto, se printean //
		while (linetext.hasMoreTokens()) {

				String line = linetext.nextToken();
				System.out.println(line);
				
			}

		// Aun no se que hacer con esto. Se supone que debería llevarme al siguiente archivo de texto y tirar la recursividad con ese //
		while (reference.hasMoreTokens()){

			String ref = reference.nextToken();
			
			
		}

			
		}
		
	}
	catch (IOException e){
		
	}
}

	



