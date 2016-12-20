
package negocio;

import java.util.StringTokenizer;

/**
 * 
 * @author Miguel Angel Martinez Rodriguez
 *
 */
public class Person {
	private String name; // Nombres
	private char sex; // Sexo
	private String birthdate; // fecha de nacimiento
	private int ci; // Cedula de Identidad
	private String maritalStatus; // estado civil
	private String addres; // direccion
	private String nationality; // nacionalidad

	/**
	 * Constructor: Crear un Objeto persona sin datos
	 */
	public Person() {
		this.name = "NN"; // Sin Nombre o Nombre desconocido
		this.sex = 'I'; // Sin definir
		this.birthdate = "DD-MM-YY"; // Sin fecha de nacimiento
		this.ci = 0; // Sin deula de identidad
		this.maritalStatus = "S/MS"; // Sin estado civil
		this.addres = "S/D"; // Sin definir
		this.nationality = "S/D"; // Sin definir
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		String data = "Nombre: " + getName() + "\nSexo: " + String.valueOf(getSex()) + "\nFecha de Nacimiento: "
				+ getBirthdate() + "\nCedula de Identidad: " + String.valueOf(getCi()) + "\nEstado Civil: "
				+ getMaritalStatus() + "\nDireccion: " + getAddres() + "\nNacionalidad: " + getNationality();
		return data;
	}

	public String getDataPerson() {
		String data = getName() + ":" + getSex() + ":" + getBirthdate() + ":" + getCi() + ":" + getMaritalStatus() + ":"
				+ getAddres() + ":" + getNationality();
		return data;
	}

	public void restartData() {
		this.name = "NN"; // Sin Nombre o Nombre desconocido
		this.sex = 'I'; // Sin definir
		this.birthdate = "DD-MM-YY"; // Sin fecha de nacimiento
		this.ci = 0; // Sin deula de identidad
		this.maritalStatus = "S/MS"; // Sin estado civil
		this.addres = "S/D"; // Sin definir
		this.nationality = "S/D"; // Sin definir
	}

	/**
	 * Guarda los datos de la persona en un archivo ListPerson.txt
	 */
	public void saveDataPerson() {
		Archivo archivo = new Archivo();
		archivo.write("ListPerson.txt", getDataPerson());
	}

	/**
	 * Guarda los datos de la persona en el archivo namefile e.g. nameFile =
	 * List.txt
	 * 
	 * @param nameFile
	 */
	public void saveDataPerson(String nameFile) {
		Archivo archivo = new Archivo();
		archivo.write(nameFile, getDataPerson());
	}

	/**
	 * Carga los datos de la lista de personas del archivo ListPerson.txt Upload
	 * data of the person
	 */
	public void uploadDataPerson(int index) {
		Archivo archivo = new Archivo();
		if (archivo.exists("ListPerson.txt") && (index > 0) && (index <= archivo.getNumberLine("ListPerson.txt"))) {
			String dataToken = archivo.readLine("ListPerson.txt", index);
			if (dataToken != null && dataToken != "") {
				StringTokenizer st = new StringTokenizer(dataToken, ":");
				setName(st.nextToken());
				setSex(st.nextToken().charAt(0));
				setBirthdate(st.nextToken());
				setCi(Integer.parseInt(st.nextToken()));
				setMaritalStatus(st.nextToken());
				setAddres(st.nextToken());
				setNationality(st.nextToken());
			} else {
				System.out.println("Error no se pudo leer el archivo...");
			}
		} else {
			System.out.println("Error no existe el archivo o el indice esta fuera de rango...");
		}
	}

	/**
	 * Carga los datos de la lista de personas del archivo nameFile e.g.
	 * nameFile = Prueba.txt Upload data of the person
	 */
	public void uploadDataPerson(String nameFile, int index) {
		Archivo archivo = new Archivo();
		if (archivo.exists(nameFile) && (index > 0) && (index <= archivo.getNumberLine(nameFile))) {
			String dataToken = archivo.readLine(nameFile, index);
			if (dataToken != null && dataToken != "") {
				StringTokenizer st = new StringTokenizer(dataToken, ":");
				setName(st.nextToken());
				setSex(st.nextToken().charAt(0));
				setBirthdate(st.nextToken());
				setCi(Integer.parseInt(st.nextToken()));
				setMaritalStatus(st.nextToken());
				setAddres(st.nextToken());
				setNationality(st.nextToken());
			} else {
				System.out.println("Error no se pudo leer el archivo...");
			}
		} else {
			System.out.println("Error no existe el archivo o el indice esta fuera de rango...");
		}
	}
}
