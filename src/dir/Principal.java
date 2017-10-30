package dir;

import java.io.File;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Ejercicio 3:
		 * 
		 * Creamos dos objetos File, cada uno con un directorio distinto, des pues se los pasamos a la función comparar(),
		 * que nos devolverá un número:
		 * 	-> 1 si el primer directorio tiene mas archivos
		 * 	-> -1 si el segundo directorio tiene mas archivos
		 * 	-> 0 si los dos tienen el mismo número de archivos
		 * 
		 * */
		File f1 = new File("directorio1");
		File f2 = new File("directorio2");
		try {
			switch(comparar(f1,f2)) {
			case 1:
				System.out.println("El primer directorio tiene mas ficheros/directorios");
				break;
			case -1:
				System.out.println("El segundo directorio tiene mas ficheros/directorios");
				break;
			case 0:
				System.out.println("Los dos directorios tienen el mismo numero de ficheros/directorios");
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public static void localizar(){
		
	}
	
	public static int comparar(File f1, File f2) throws Exception{
		/*
		 * Ejercicio 3:
		 * 
		 * Comprobamos que los dos directorios existan y sean directorios, si no, lanzamos una excepcion con un mensaje detallando el 
		 * error.
		 * 
		 * Si todo ha ido bien, comprobamos los directorios y guardamos un número:
		 * 	-> 1 si el primer directorio tiene mas archivos
		 * 	-> -1 si el segundo directorio tiene mas archivos
		 * 	-> 0 si los dos tienen el mismo número de archivos
		 * */
		int i = 0;
		if(f1.exists() && f2.exists()) {
			if(f1.isDirectory() && f2.isDirectory()) {
				if(f1.list().length > f2.list().length) {
					i = 1;
				} else if(f1.list().length < f2.list().length) {
					i = -1;
				} else {
					i = 0;
				}
				
			} else {
				throw new Exception("Uno de los ficheros no es un directorio");
			}
		} else {
			throw new Exception("Uno de los ficheros no existe");
		}
		
		return i;
	}

}
