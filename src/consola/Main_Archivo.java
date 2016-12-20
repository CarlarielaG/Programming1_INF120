package consola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import negocio.Archivo;
import negocio.Person;

public class Main_Archivo {
	private static volatile boolean running;

	public Main_Archivo() {
		running = true;
	}

	public static void main(String[] args) throws IOException {
		// Notar que readLine() nos obliga a declarar IOException
		Main_Archivo m = new Main_Archivo();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Person person = new Person();
		Archivo archivo = new Archivo();
		while (running) {
			m.optionList();

			System.out.print("---> Elija una opcion: ");
			int key = Integer.parseInt(br.readLine());

			switch (key) {
			case 1:
				System.out.println("\n---> Agragando datos de una nueva persona...");

				System.out.print("  --> Nombre: ");
				person.setName(br.readLine());

				System.out.print("  --> Sexo: ");
				person.setSex(br.readLine().charAt(0));

				System.out.print("  --> Fecha de Nacimiento: ");
				person.setBirthdate(br.readLine());

				System.out.print("  --> Cedula de Identidad: ");
				person.setCi(Integer.parseInt(br.readLine()));

				System.out.print("  --> Estado Civil: ");
				person.setMaritalStatus(br.readLine());

				System.out.print("  --> Direccion: ");
				person.setAddres(br.readLine());

				System.out.print("  --> Nacionalidad: ");
				person.setNationality(br.readLine());

				person.saveDataPerson();
				break;
			case 2:

				for (int i = 1; i <= 100; i++) {
					String temp = archivo.readLine("ListPerson.txt", i);
					StringTokenizer st = new StringTokenizer(temp, ":");

					String linea = "";
					int n = 1;
					while (st.hasMoreTokens()) {
						if (n == 7) {
							linea += st.nextToken().trim();
						} else {
							linea += st.nextToken().trim() + ":";
						}
						n++;
					}
					archivo.write("ListPerson2.txt", linea);
				}

				break;
			case 3:
				System.out.println("\n---> Agragando datos de una nueva persona...");
				System.out.print("  --> Numero de Lista: ");
				person.uploadDataPerson(Integer.parseInt(br.readLine()));
				System.out.println("  --> Los datos son: " + person);
				break;
			case 4:
				System.out.println("\n---> Invertir un archivo .txt");
				System.out.print("  --> Nombre del archivo: ");
				String nameFile = br.readLine();
				archivo.invertFile(nameFile);
				System.out.println("Se creo el archivo invertido");
				break;

			case 20:
				running = false;
				break;

			default:
				running = false;
				break;
			}
		}
	}

	public void optionList() {
		System.out.println("\n---> Lista de opciones");
		System.out.println("   ---> 1. Agregar una nueva persona");
		System.out.println("   ---> 2. Listar personas");
		System.out.println("   ---> 3. Cargar datos de Perona");
		System.out.println("   ---> 4. Invertir un Archivo");
		System.out.println("   ---> 20. Salir");
	}
}
