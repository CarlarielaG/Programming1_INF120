package negocio;

public class Vector {
	private int v[];	//Arreglo - Vector de enteros
	private int dim;	//dimencion (cantidad) de elementos en el vector
	private int max;	//maximo de elementos permitidos en el vector
	
	
	public Vector(int max) {
		super();
		this.max = max;
		this.dim = 0;
		this.v = new int[this.max];
	}

	/*==================== Getter ====================*/
	
	public int getDim() {
		return dim;
	}


	public int getMax() {
		return max;
	}


	private int[] getV() {
		return v;
	}

	/*==================== Setter ====================*/
	
	private void setV(int[] v) {
		this.v = v;
	}


	private void setDim(int dim) {
		this.dim = dim;
	}


	private void setMax(int max) {
		this.max = max;
	}
	
	/*==================== Otros metodos ====================*/
	
	
}
