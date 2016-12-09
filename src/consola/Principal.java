package consola;

import negocio.Vector;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[================================ Class Vector ================================]");
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Creando una objeto a de tipo Vector con capacidad de 16 elemenots");
		Vector a = new Vector(16);
		System.out.println("    --> Dimencion: "+a.getDim());
		System.out.println("    --> Maximo de elementos: "+a.getMax());
		System.out.println("    --> " + a.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Agregadon elementos al vector (del 1 al 12)");
		a.addElement(1);
		a.addElement(2);
		a.addElement(3);
		a.addElement(4);
		a.addElement(5);
		a.addElement(6);
		a.addElement(7);
		a.addElement(8);
		a.addElement(9);
		a.addElement(10);
		a.addElement(11);
		a.addElement(12);
		System.out.println("    --> Dimencion: "+a.getDim());
		System.out.println("    --> Maximo de elementos: "+a.getMax());
		System.out.println("    --> " + a.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Fijando (cambiando) un elemento del vector e.g. (3 en 1)");
		a.setElement(3, 1);
		System.out.println("    --> Dimencion: "+a.getDim());
		System.out.println("    --> Maximo de elementos: "+a.getMax());
		System.out.println("    --> " + a.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Fijando (cambiando) un elemento del vector e.g. (3 en 7)");
		a.setElement(3, 7);
		System.out.println("    --> Dimencion: "+a.getDim());
		System.out.println("    --> Maximo de elementos: "+a.getMax());
		System.out.println("    --> " + a.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Fijando (cambiando) un elemento del vector e.g. (3 en 12)");
		a.setElement(3, 12);
		System.out.println("    --> Dimencion: "+a.getDim());
		System.out.println("    --> Maximo de elementos: "+a.getMax());
		System.out.println("    --> " + a.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Insertando un elemento al vector e.g. (8 en 1)");
		a.insertElement(8, 1);
		System.out.println("    --> Dimencion: "+a.getDim());
		System.out.println("    --> Maximo de elementos: "+a.getMax());
		System.out.println("    --> " + a.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Insertando un elemento al vector e.g. (8 en 5)");
		a.insertElement(8, 5);
		System.out.println("    --> Dimencion: "+a.getDim());
		System.out.println("    --> Maximo de elementos: "+a.getMax());
		System.out.println("    --> " + a.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Insertando un elemento al vector e.g. (8 en 14)");
		a.insertElement(8, 14);
		System.out.println("    --> Dimencion: "+a.getDim());
		System.out.println("    --> Maximo de elementos: "+a.getMax());
		System.out.println("    --> " + a.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Insertando un elemento al vector e.g. (81 en 16)");
		a.insertElement(81, 16);
		System.out.println("    --> Dimencion: "+a.getDim());
		System.out.println("    --> Maximo de elementos: "+a.getMax());
		System.out.println("    --> " + a.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Eliminando un elemento del vector e.g. el de la posicion 1");
		a.removeElement(1);
		System.out.println("    --> Dimencion: "+a.getDim());
		System.out.println("    --> Maximo de elementos: "+a.getMax());
		System.out.println("    --> " + a.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Eliminando un elemento del vector e.g. el de la posicion 10");
		a.removeElement(10);
		System.out.println("    --> Dimencion: "+a.getDim());
		System.out.println("    --> Maximo de elementos: "+a.getMax());
		System.out.println("    --> " + a.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Eliminando un elemento del vector e.g. el de la posicion 13");
		a.removeElement(13);
		System.out.println("    --> Dimencion: "+a.getDim());
		System.out.println("    --> Maximo de elementos: "+a.getMax());
		System.out.println("    --> " + a.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Eliminando un elemento del vector e.g. el de la posicion 14");
		a.removeElement(14);
		System.out.println("    --> Dimencion: "+a.getDim());
		System.out.println("    --> Maximo de elementos: "+a.getMax());
		System.out.println("    --> " + a.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Agregando elementos en el vectro en formato de string con separador espacio");
		a.addElements("21 22 23 24 25 26 27");
		System.out.println("    --> Dimencion: "+a.getDim());
		System.out.println("    --> Maximo de elementos: "+a.getMax());
		System.out.println("    --> " + a.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Creando una objeto b de tipo Vector con capacidad de 16 elemenots");
		Vector b = new Vector(16);
		System.out.println("    --> Dimencion: "+b.getDim());
		System.out.println("    --> Maximo de elementos: "+b.getMax());
		System.out.println("    --> " + b.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Agregando elementos en el vectro b en formato de string con separador espacio");
		b.addElements("21 22 23 24 25 26 27 28");
		System.out.println("    --> Dimencion: "+b.getDim());
		System.out.println("    --> Maximo de elementos: "+b.getMax());
		System.out.println("    --> " + b.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Invertir el vector b");
		b.invert();
		System.out.println("    --> Dimencion: "+b.getDim());
		System.out.println("    --> Maximo de elementos: "+b.getMax());
		System.out.println("    --> " + b.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Rotar el vector b 3 veces");
		b.rotate(3);
		System.out.println("    --> Dimencion: "+b.getDim());
		System.out.println("    --> Maximo de elementos: "+b.getMax());
		System.out.println("    --> " + b.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Busqueda secuencial en vector b e.g. 28");
		System.out.println("    --> El elemento 28 se encuentra en: " + b.searchSeq(28));
		System.out.println("    --> Dimencion: "+b.getDim());
		System.out.println("    --> Maximo de elementos: "+b.getMax());
		System.out.println("    --> " + b.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Rotar el vector b 5 veces e invertir");
		b.rotate(5);
		b.invert();
		System.out.println("    --> Dimencion: "+b.getDim());
		System.out.println("    --> Maximo de elementos: "+b.getMax());
		System.out.println("    --> " + b.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Busqueda Binaria en vector b e.g. 23");
		System.out.println("    --> El elemento 23 se encuentra en: " + b.searchSeq(23));
		System.out.println("    --> Dimencion: "+b.getDim());
		System.out.println("    --> Maximo de elementos: "+b.getMax());
		System.out.println("    --> " + b.toString());
		System.out.println("\n");//salto de linea
		
		
		System.out.println("--> Creando una objeto c de tipo Vector con capacidad de elemenots por defecto (25)");
		Vector c = new Vector();
		System.out.println("    --> Dimencion: "+c.getDim());
		System.out.println("    --> Maximo de elementos: "+c.getMax());
		System.out.println("    --> " + c.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Agregando elementos en el vectro c en formato de string con separador espacio");
		c.addElements("4 2 5 3 7 4 5 6 8 1 9 1");
		System.out.println("    --> Dimencion: "+c.getDim());
		System.out.println("    --> Maximo de elementos: "+c.getMax());
		System.out.println("    --> " + c.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Ordenamiento por Burbuja");
		c.bubbleSort();
		System.out.println("    --> Dimencion: "+c.getDim());
		System.out.println("    --> Maximo de elementos: "+c.getMax());
		System.out.println("    --> " + c.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Creando una objeto d de tipo Vector con capacidad de elemenots por defecto (25)");
		Vector d = new Vector();
		System.out.println("    --> Dimencion: "+d.getDim());
		System.out.println("    --> Maximo de elementos: "+d.getMax());
		System.out.println("    --> " + d.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Agregando elementos en el vectro c en formato de string con separador espacio");
		d.addElements("4 2 5 3 7 4 5 6 8 1 9 1");
		System.out.println("    --> Dimencion: "+d.getDim());
		System.out.println("    --> Maximo de elementos: "+d.getMax());
		System.out.println("    --> " + d.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Ordenamiento por Insercion");
		d.insertionSort();
		System.out.println("    --> Dimencion: "+d.getDim());
		System.out.println("    --> Maximo de elementos: "+d.getMax());
		System.out.println("    --> " + d.toString());
		System.out.println("\n");//salto de linea
		
		
		System.out.println("--> Creando una objeto e de tipo Vector con capacidad de elemenots por defecto (25)");
		Vector e = new Vector();
		System.out.println("    --> Dimencion: "+e.getDim());
		System.out.println("    --> Maximo de elementos: "+e.getMax());
		System.out.println("    --> " + e.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Agregando elementos en el vectro c en formato de string con separador espacio");
		e.addElements("4 2 5 3 7 4 5 6 8 1 9 1");
		System.out.println("    --> Dimencion: "+e.getDim());
		System.out.println("    --> Maximo de elementos: "+e.getMax());
		System.out.println("    --> " + e.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Ordenamiento por seleccion");
		e.selectionSort();
		System.out.println("    --> Dimencion: "+e.getDim());
		System.out.println("    --> Maximo de elementos: "+e.getMax());
		System.out.println("    --> " + e.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Creando una objeto f de tipo Vector con capacidad de elemenots por defecto (25)");
		Vector f = new Vector();
		System.out.println("    --> Dimencion: "+f.getDim());
		System.out.println("    --> Maximo de elementos: "+f.getMax());
		System.out.println("    --> " + f.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Agregando elementos en el vectro f en formato de string con separador espacio");
		f.addElements("4 2 5 3 7 4 5 6 8 1 9 1");
		System.out.println("    --> Dimencion: "+f.getDim());
		System.out.println("    --> Maximo de elementos: "+f.getMax());
		System.out.println("    --> " + f.toString());
		System.out.println("\n");//salto de linea
		
		System.out.println("--> Ordenamiento por shellSort");
		f.shellSort();
		System.out.println("    --> Dimencion: "+f.getDim());
		System.out.println("    --> Maximo de eleentos: "+f.getMax());
		System.out.println("    --> " + f.toString());
		System.out.println("\n");//salto de linea
		
		
		System.out.println("[=========================== Fin de la Class Vector ===========================]");
		
	}

}
