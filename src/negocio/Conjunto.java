package negocio;

public class Conjunto {
	private int c[];	//Arreglo - Vector de enteros
	private int size;	//tamaño del conjunto
	private int max;	//maximo de elementos en el conjunto
	
	
	public Conjunto(int max) {
		super();
		this.max = max;
		this.size = 0;
		this.c = new int[this.max];
	}

	/*==================== Getter ====================*/
	
	public int getSize() {
		return size;
	}


	public int getMax() {
		return max;
	}


	private int[] getC() {
		return c;
	}

	/*==================== Setter ====================*/
	
	private void setC(int[] c) {
		this.c = c;
	}


	private void setSize(int size) {
		this.size = size;
	}


	private void setMax(int max) {
		this.max = max;
	}
	
	/*==================== Otros metodos ====================*/
	
}
