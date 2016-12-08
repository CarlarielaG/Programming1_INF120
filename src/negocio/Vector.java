package negocio;

import java.util.StringTokenizer;

/**
 * Miguel_Angel-M@outlook.com
 * @author miguel_angel_m
 *
 */

public class Vector {
	private int v[];	//Arreglo - Vector de enteros
	private int dim;	//dimencion (cantidad) de elementos en el vector
	private int max;	//maximo de elementos permitidos en el vector
	
	/**
	 * constructor: crea un vector de capacidad para 25 elementos
	 */
	public Vector(){
		super();
		this.max = 25;
		this.dim = -1;
		this.v = new int[this.max];
		for (int i = 0; i < max; i++) {
			v[i] = 0;
		}
	}
	/**
	 * constructor: crea un vector de capacidad para el maximo de 
	 * elementos indicado por parametro
	 * @param max
	 */
	public Vector(int max) {
		super();
		this.max = max;
		this.dim = -1;
		this.v = new int[this.max];
		for (int i = 0; i < max; i++) {
			v[i] = 0;
		}
	}

	/*==================== Getter ====================*/
	
	public int getDim() {
		return dim+1;
	}


	public int getMax() {
		return max;
	}


//	private int[] getV() {
//		return v;
//	}

	/*==================== Setter ====================*/
	
//	private void setV(int[] v) {
//		this.v = v;
//	}
//
//
//	private void setDim(int dim) {
//		this.dim = dim;
//	}
//
//
//	private void setMax(int max) {
//		this.max = max;
//	}
	
	/*==================== Otros metodos ====================*/
	
	/**
	 * Retorna true si el vector esta vacio
	 * @return
	 */
	public boolean isEmpty(){
		return (getDim() == 0);
	}
	/**
	 * Retorna true si el vector esta lleno
	 * @return
	 */
	public boolean isFull(){
		return (getDim() == max);
	}
	
	public void addElement(int element){
		if (isFull()) {
			System.out.println("Error: Vector lleno...");
		} else {
			v[dim+1] = element;
			dim++;
		}
	}
	
	public void setElement(int element, int index){
		if ((index-1)>= 0 && (index-1) <= dim) {
			v[index-1] = element;
		} else {
			System.out.println("Error: posicion fuera de rango...");
		}
	}
	
	public void addElements(String elements){
		StringTokenizer st = new StringTokenizer(elements, " ");
		while (!isFull() && st.hasMoreTokens()) {
			String temp = st.nextToken();
			int element = Integer.parseInt(temp);
			addElement(element);
		}
	}
	
	public void insertElement(int element, int index){
		if ((index-1)>= 0 && (index-1) <= dim) {
			if (getDim() < max) {
				for (int i = getDim(); i > index-1; i--) {
					v[i] = v[i-1];
				}
				v[index-1] = element;
				dim++;
			} else {
				System.out.println("Error: Vector lleno...");
			}
		} else {
			System.out.println("Error: index fuera de rango...");
		}
	}
	
	public void removeElement(int index){
		if ((index-1)>= 0 && (index-1) <= dim) {
			for (int i = index-1; i < dim; i++) {
				v[i] = v[i+1];
			}
			v[dim] = 0;
			dim--;
		} else {
			System.out.println("Error: index fuera de rango...");
		}
	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < getDim(); i++) {
			s += "[" + v[i] + "]";
		}
		return "Vector {" + s + "}";
	}
	
}
