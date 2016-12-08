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
		
		
		System.out.println("[=========================== Fin de la Class Vector ===========================]");
		
	}

}
