package negocio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Archivo {
	private final String PATH = System.getProperties().getProperty("user.dir") + "\\src\\datos\\";
	private BufferedReader br;

	/**
	 * Retorna true si el archivo existe e.g. name = Prueba.txt
	 * 
	 * @param name
	 * @return
	 */
	public boolean exists(String name) {
		File file = new File(PATH + name);
		return file.exists();
	}

	/**
	 * Retorna true si el archivo existe y si se elimino e.g. name = Prueba.txt
	 * 
	 * @param name
	 * @return
	 */
	public boolean remove(String name) {
		File file = new File(PATH + name);
		return file.delete();
	}

	public void create(String name) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(PATH + name));
			bw.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No ha podido ser creado el fichero...");
		}
	}

	/**
	 * obteine el número de líneas del archivo
	 * 
	 * @param name
	 * @return
	 */
	public int getNumberLine(String name) {
		try {
			File file = new File(PATH + name);
			if (file.exists()) {
				br = new BufferedReader(new FileReader(PATH + name));
				int lines = 0;
				while ((br.readLine()) != null) {
					lines++;
				}
				return lines;
			} else {
				System.out.println("No existe el archivo...");
				return 0;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error no se pudo leer el archivo...");
			return 0;
		}
	}

	/**
	 * Escribi en un archivo existe name = Prueba.txt la cadena de caracteres En
	 * caso de no existir el archivo en el cual se intenta escribir se crea uno
	 * nuevo
	 * 
	 * @param name
	 * @param s
	 */
	public void write(String name, String s) {
		try {
			File file = new File(PATH + name);
			if (file.exists()) {
				FileWriter fw = new FileWriter(PATH + name, true);
				BufferedWriter bw = new BufferedWriter(fw);
				if (getNumberLine(name) == 0) {
					bw.write(s);
				} else {
					bw.newLine();
					bw.write(s);
				}
				fw.close();
				bw.close();
			} else {
				System.out.println("Error no existe el archivo pero se acaba de crear...");
				BufferedWriter bw = new BufferedWriter(new FileWriter(PATH + name));
				bw.write(s);
				bw.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Errro no se puede escribir o no existe el archivo...");
		}
	}

	/**
	 * Retorna el String del numero de linea indicado, si hubiese un error
	 * retorna null en caso que el indice de linea sea menor a 0 retorna "" en
	 * caso que el numero de linea sea mayor a los del archivo retorna la ultima
	 * linea
	 * 
	 * @param name
	 * @param index
	 * @return
	 */
	public String readLine(String name, int index) {
		String line = "";
		try {
			br = new BufferedReader(new FileReader(PATH + name));
			String temp = "", token;
			int i = 0;
			for (i = 0; (((token = br.readLine()) != null) && (i < index)); i++) {
				temp = token;
			}
			line = temp;
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
			line = null;
			System.out.println("Error en lectura de archivo, o no existe el mismo...");
		}
		return line;
	}
}
