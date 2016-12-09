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
	
	public void invert(){
		if (isEmpty()) {
			System.out.println("Error: vector vacio...");
		} else {
			if (getDim() == 1) {
				System.out.println("Error: vector de un solo elemento");
			} else {
				int m = getDim()/2;
				for (int i = 1; i <= m; i++) {
					int temp = v[i-1];
					v[i-1] = v[getDim()-i];
					v[getDim()-i] = temp;
				}
			}
		}
	}
	
	public void rotate(int ri){
		int n = ri % (dim +1);
		for (int i = 1; i <= n; i++) {
			int temp = v[0];
			for (int j = 0; j < dim; j++) {
				v[j] = v[j +1];
			}
			v[dim] = temp;
		}		
	}
	/* -------------------- Busquedas ---------- */
	public int searchSeq(int element){
		int i = 0;
		while (i < getDim() && v[i] != element){
			i++;
		}
		if (i < getDim()) {
			return i+1;
		} else {
			return -1;
		}
	}
	
	public int searchBin(int element){
		int start = 0; int end = getDim()-1;
		int m = (end + start)/2;
		while (start < end && element != v[m]) {
			if (element > v[m]) {
				start = m +1;
			} else {
				end = m -1;
			}
			m = (end + start)/2;
		}
		if (element == v[m]) {
			return m+1;
		} else {
			return -1;
		}
	}
	
	/* -------------------- Ordenamientos -------------------- */
	
	public void bubbleSort(){
		int temp;
		for (int i = 1; i < getDim(); i++) {
			for (int j = 0; j < getDim()-1; j++) {
				if (v[j] > v[j+1]) {
					temp = v[j];
					v[j] = v[j+1];
					v[j+1] = temp;
				}
			}
		}
	}
	
	public void insertionSort(){
		for (int i = 1; i < getDim(); i++) {
			int temp = v[i];
			int j;
			for (j = i-1; (j >= 0 && v[j] > temp); j--) {
				v[j+1] = v[j];
			}
			v[j+1] = temp;
		}
	}
	
	public void selectionSort(){
		int i, k, p, temp, limit = getDim()-1;
		for (k = 0; k < limit; k++) {
			p = k;
			for (i = k+1; i <= limit; i++) {
				if (v[i] < v[p]) {
					p = i;
				}
				if (p != k) {
					temp = v[p];
					v[p] = v[k];
					v[k] = temp;
				}
			}
		}
	}
	
	public void shellSort(){
		for (int increment = getDim()/2; increment > 0;
				increment = (increment == 2 ? 1: (int) Math.round(increment/ 2.2))) {
			for (int i = increment; i < getDim(); i++) {
				for (int j = i; j >= increment && v[j-increment]> v[j]; j -= increment) {
					int temp = v[j];
					v[j] = v[j - increment];
					v[j - increment] = temp;
				}
			}
		}
	}
	
}
